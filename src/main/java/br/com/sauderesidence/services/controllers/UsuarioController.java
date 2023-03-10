package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.UsuarioModel;

public class UsuarioController {
	
	public List<UsuarioModel> validarLoginSenha(String login, String senha) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "USU.*, "
				+ "PROF.SCSPECIALITY AS IDESPECIALIDADE, "
				+ "PF.SHORTNAME AS APELIDO, "
				+ "SC.CODENAME AS NMESPECIALIDADE, "
				+ "PROF.REGISTRYNUMBER AS REGISTRO "
				+ "FROM "
				+ "SR_USUARIO USU "
				+ "INNER JOIN GLBPROFESSIONAL PROF ON PROF.IDPERSON = USU.IDPERSON "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PROF.IDPERSON "
				+ "INNER JOIN SCCCODE SC ON SC.ID = PROF.SCSPECIALITY "
				+ "WHERE "
				+ "USU.LOGIN = ? "
				+ "AND SENHA = ? "
				+ "AND USU.STATUS = 'A' ");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setString(1, login);
		pst.setString(2, senha);
		ResultSet rs = pst.executeQuery();		
		List<UsuarioModel> lista = new ArrayList<>();
		while(rs.next()) {
			UsuarioModel usuario = new UsuarioModel();
			usuario.setIdusuario(rs.getInt("IDUSUARIO"));
			usuario.setNome(rs.getString("NOME"));
			usuario.setLogin(rs.getString("LOGIN"));
			usuario.setEmail(rs.getString("EMAIL"));
			usuario.setIdperson(rs.getInt("IDPERSON"));
			usuario.setPrimeiroacesso(rs.getString("NOVO"));
			usuario.setIdespecialidade(rs.getInt("IDESPECIALIDADE"));
			usuario.setApelido(rs.getString("APELIDO"));
			usuario.setNmespecialidade(rs.getString("NMESPECIALIDADE"));
			usuario.setRegistro(rs.getString("REGISTRO"));
			lista.add(usuario);
		}
		pst.close();
		return lista;
	}
	
	public UsuarioModel buscarUsuarioPorIdPerson(int idperson) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "USU.IDUSUARIO, "
				+ "USU.NOME, "
				+ "USU.LOGIN, "
				+ "USU.EMAIL, "
				+ "USU.IDPERSON, "
				+ "USU.NOVO, "
				+ "PROF.SCSPECIALITY AS IDESPECIALIDADE, "
				+ "PF.SHORTNAME AS APELIDO, "
				+ "SC.CODENAME AS NMESPECIALIDADE, "
				+ "PROF.REGISTRYNUMBER AS REGISTRO "
				+ "FROM "
				+ "SR_USUARIO USU "
				+ "INNER JOIN GLBPROFESSIONAL PROF ON PROF.IDPERSON = USU.IDPERSON "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PROF.IDPERSON "
				+ "INNER JOIN SCCCODE SC ON SC.ID = PROF.SCSPECIALITY "
				+ "WHERE "
				+ "USU.IDPERSON = ?");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idperson);
		ResultSet rs = pst.executeQuery();
		UsuarioModel usu = null;
		while(rs.next()) {
			usu = new UsuarioModel();
			usu.setIdusuario(rs.getInt("IDUSUARIO"));
			usu.setNome(rs.getString("NOME"));
			usu.setLogin(rs.getString("LOGIN"));
			usu.setEmail(rs.getString("EMAIL"));
			usu.setIdperson(rs.getInt("IDPERSON"));
			usu.setPrimeiroacesso(rs.getString("NOVO"));
			usu.setIdespecialidade(rs.getInt("IDESPECIALIDADE"));
			usu.setApelido(rs.getString("APELIDO"));
			usu.setNmespecialidade(rs.getString("NMESPECIALIDADE"));
			usu.setRegistro(rs.getString("REGISTRO"));
		}
		return usu;
	}

}
