package br.com.sauderesidence.services.helpers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;

public class Uteis {
	
	public static String retornarDataAtual() {
		
		String data = "";
		String sql = "SELECT TO_CHAR(SYSDATE, 'DD/MM/YYYY') AS DATA FROM DUAL";
		try {
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				data = rs.getString("DATA");
			}
			return data;
		} catch (SQLException e) {
			return data;
		}
	}

}
