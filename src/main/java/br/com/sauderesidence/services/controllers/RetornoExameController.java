package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.RetornoExameModel;

public class RetornoExameController {
	
	public void inserirRetornoExame(RetornoExameModel ret) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "INSERT INTO SR_RETORNO_EXAMES ("
				+ "IDADMISSION, IDPROFESSIONAL, DATA_RETORNO, OBS, ACOMPANHANTE"
				+ ") VALUES ("
				+ "?, ?, TO_DATE(?, 'DD/MM/YYYY'), ?, ?"
				+ ")");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, ret.getIdadmission());
		pst.setInt(2, ret.getIdprofessional());
		pst.setString(3, ret.getDataretorno());
		pst.setString(4, ret.getObservacao());
		pst.setString(5, ret.getAcompanhante());
		pst.execute();
		pst.close();
		
	}

}
