package br.com.sauderesidence.services.controllers;

import java.io.Reader;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;

public class AssinaturaController {
	
	public void gravarAssinatura(
			int idevolucao, 
			int idadmission, 
			String assinaturaPaciente, 
			String assinaturaProfissional, 
			int idprofagenda) throws SQLException {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO SR_ASSINATURAS (IDEVOLUCAO, IDADMISSION, ASS_PAC, ASS_PROF, IDPROFAGENDA) VALUES (?, ?, ?, ?, ?)");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idevolucao);
		pst.setInt(2, idadmission);
		Reader rpac = new StringReader(assinaturaPaciente);
		Reader rprof = new StringReader(assinaturaProfissional);
		pst.setClob(3, rpac);
		pst.setClob(4, rprof);
		pst.setInt(5, idprofagenda);
		pst.execute();
		pst.close();
	}

}
