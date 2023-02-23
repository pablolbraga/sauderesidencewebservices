package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.EvolucaoModel;
import br.com.sauderesidence.services.models.UsuarioModel;

public class EvolucaoController {
	
	public void inserirEvolucao(EvolucaoModel evo) throws SQLException {
		
		UsuarioController ctrUsuario = new UsuarioController();
		UsuarioModel usuario = ctrUsuario.buscarUsuarioPorIdPerson(evo.getIdprofessional());
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO CAPEVOLUTION ("
				+ "IDADMISSION, IDPROFESSIONAL, SCSPECIALITY, STARTDATE, ENDDATE, "
				+ "PERSONNAME, PROFESSIONALNAME, PROFSHORTNAME, SCSPECIALITYNAME, SIGNED, "
				+ "PROGRAMMED, CREATIONDATE, IDTEMPLATE, XMLPERSISTENCETYPE, REGISTRYNUMBER) "
				+ "VALUES ("
				+ "?, ?, ?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), "
				+ "?, ?, ?, ?, ?, "
				+ "?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, ?, ? "
				+ ")");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, evo.getIdadmission());
		pst.setInt(2, evo.getIdprofessional());
		pst.setInt(3, usuario.getIdespecialidade());
		pst.setString(4, evo.getDataini());
		pst.setString(5, evo.getDatafim());
		pst.setString(6, usuario.getNome());
		pst.setString(7, usuario.getNome());
		pst.setString(8, usuario.getApelido());
		pst.setString(9, usuario.getNmespecialidade());
		pst.setInt(10, 0);
		pst.setInt(11, 1);
		pst.setString(12, evo.getDataini());
		pst.setInt(13, evo.getIdtemplate());
		pst.setInt(14, 2);
		pst.setString(15, usuario.getRegistro());
		pst.execute();
		pst.close();		
		
	}
	
	public int buscarUltimaEvolucao(int idadmission, int idprofessional, String dataini, String datafim, int idtemplate) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "* "
				+ "FROM "
				+ "CAPEVOLUTION EVO "
				+ "WHERE "
				+ "EVO.IDADMISSION = ? "
				+ "AND EVO.IDPROFESSIONAL = ?"
				+ "AND EVO.STARTDATE = TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS') "
				+ "AND EVO.ENDDATE = TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS') "
				+ "AND EVO.IDTEMPLATE = ?");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		pst.setInt(2, idprofessional);
		pst.setString(3, dataini);
		pst.setString(4, datafim);
		pst.setInt(5, idtemplate);
		ResultSet rs = pst.executeQuery();
		int resultado = 0;
		while(rs.next()) {
			resultado = rs.getInt("ID");
		}
		return resultado;		
		
	}

}
