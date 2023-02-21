package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.EquipamentoModel;

public class EquipamentoController {
	
	public List<EquipamentoModel> listarEquipamentoPorAdmissao(int idadmission) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "SELECT "
				+ "SC.ID AS IDEQUIPAMENTO, "
				+ "SC.CODENAME AS NMEQUIPAMENTO, "
				+ "COUNT(*) AS QTDE "
				+ "FROM "
				+ "CAPEQUIPMENTRENTAL EQ "
				+ "INNER JOIN SCCCODE SC ON SC.ID = EQ.SCEQUIPMENT "
				+ "WHERE "
				+ "EQ.IDADMISSION = ? "
				+ "AND EQ.RETURNDATE IS NULL "
				+ "GROUP BY "
				+ "SC.ID, "
				+ "SC.CODENAME "
				+ "ORDER BY "
				+ "SC.CODENAME");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		ResultSet rs = pst.executeQuery();
		List<EquipamentoModel> lista = new ArrayList<>();
		while(rs.next()) {
			EquipamentoModel eq = new EquipamentoModel();
			eq.setIdequipamento(rs.getInt("IDEQUIPAMENTO"));
			eq.setNome(rs.getString("NMEQUIPAMENTO"));
			eq.setQuantidade(rs.getInt("QTDE"));
			lista.add(eq);
		}
		pst.close();
		return lista;
		
	}

}
