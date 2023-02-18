package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.ProfissionalModel;

public class ProfissionalController {
	
	public ProfissionalModel buscarPorId(int idprofessional) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "USU.IDPERSON AS IDPROFESSIONAL, "
				+ "USU.NOME AS NMPROFESSIONAL, "
				+ "PROF.SCSPECIALITY AS IDESPECIALIDADE, "
				+ "SC.CODENAME AS NMESPECIALIDADE, "
				+ "PROF.REGISTRYNUMBER AS REGISTRO "
				+ "FROM "
				+ "SR_USUARIO USU "
				+ "INNER JOIN GLBPROFESSIONAL PROF ON PROF.IDPERSON = USU.IDPERSON "
				+ "INNER JOIN SCCCODE SC ON SC.ID = PROF.SCSPECIALITY "
				+ "WHERE "
				+ "USU.IDUSUARIO = ?");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idprofessional);
		ResultSet rs = pst.executeQuery();
		ProfissionalModel prof = null;
		while(rs.next()) {
			prof = new ProfissionalModel();
			prof.setIdprofessional(rs.getInt("IDPROFESSIONAL"));
			prof.setNmprofessional(rs.getString("NMPROFESSIONAL"));
			prof.setIdespecialidade(rs.getInt("IDESPECIALIDADE"));
			prof.setNmespecialidade(rs.getString("NMESPECIALIDADE"));
			prof.setRegistro(rs.getString("REGISTRO"));
		}
		pst.close();
		return prof;
		
	}

}
