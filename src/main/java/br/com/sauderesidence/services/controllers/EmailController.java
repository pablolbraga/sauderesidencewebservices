package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.EmailModel;

public class EmailController {
	
	public List<EmailModel> listarEmailsPorCategoria(String categoria) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM SR_CATEGORIAS_EMAIL WHERE TIPO = ?");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setString(1, categoria);
		ResultSet rs = pst.executeQuery();
		List<EmailModel> lista = new ArrayList<>();
		while(rs.next()) {
			EmailModel email = new EmailModel();
			email.setTipo(rs.getString("TIPO"));
			email.setEmail(rs.getString("EMAIL"));
			email.setCodigo(rs.getInt("CODIGO"));
			lista.add(email);
		}
		pst.close();
		return lista;
		
	}

}
