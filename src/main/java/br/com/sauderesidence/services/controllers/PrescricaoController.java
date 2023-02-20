package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;

public class PrescricaoController {
	
	public static int retornarUltimaPrescricao(int idadmission) throws SQLException {
		
		StringBuilder sqlUltimaPrescricao = new StringBuilder();
		sqlUltimaPrescricao.append(""
				+ "SELECT J.ID FROM ("
					+ "SELECT "
						+ "* "
					+ "FROM "
						+ "CAPPRESCRIPTION A "
					+ "WHERE "
						+ "A.IDADMISSION = ? "
						+ "AND NOT A.MEDICALLIBERATION IS NULL "
						+ "AND NOT A.NURSINGLIBERATION IS NULL "
					+ "ORDER BY "
						+ "A.ID DESC "
				+ ") J WHERE ROWNUM = 1");
		PreparedStatement pstUltimaPrescricao = Conexao.abrirConexaoOracle().prepareStatement(sqlUltimaPrescricao.toString());
		pstUltimaPrescricao.setInt(1, idadmission);
		ResultSet rsUltimaPrescricao = pstUltimaPrescricao.executeQuery();
		int idPrescricao = 0;
		while(rsUltimaPrescricao.next()) {
			idPrescricao = rsUltimaPrescricao.getInt("ID");
		}
		
		return idPrescricao;
		
	}

}
