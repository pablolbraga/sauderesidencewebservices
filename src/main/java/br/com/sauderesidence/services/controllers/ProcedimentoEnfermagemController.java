package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.ProcedimentoEnfermagemModel;

public class ProcedimentoEnfermagemController {
	
	public List<ProcedimentoEnfermagemModel> listarProcedimentoPorAdmissao(int idadmission) throws SQLException{
		
		int idPrescricao = PrescricaoController.retornarUltimaPrescricao(idadmission);
		
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "SELECT "
				+ "DISTINCT SC.ID AS IDPROCEDIMENTO, "
				+ "PRENF.IDPRESCRIPTION AS IDPRESCRICAO, "
				+ "SC.CODENAME AS NMPROCEDIMENTO, "
				+ "FRE.NAME AS NMFREQUENCIA "
				+ "FROM "
				+ "CAPPRESCRIPNURSE PRENF "
				+ "INNER JOIN CAPPRESCRIPTION PR ON PR.ID = PRENF.IDPRESCRIPTION "
				+ "INNER JOIN SCCCODE SC ON SC.ID = PRENF.SCNURSINGPROC "
				+ "LEFT JOIN GLBFREQUENCY FRE ON FRE.ID = PRENF.IDFREQUENCY "
				+ "WHERE "
				+ "PR.IDADMISSION = ? "
				+ "AND PRENF.IDPRESCRIPTION = ? "
				+ "ORDER BY "
				+ "SC.CODENAME");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		pst.setInt(2, idPrescricao);
		ResultSet rs = pst.executeQuery();
		List<ProcedimentoEnfermagemModel> lista = new ArrayList<>();
		while(rs.next()) {
			ProcedimentoEnfermagemModel pe = new ProcedimentoEnfermagemModel();
			pe.setIdprescricao(rs.getInt("IDPRESCRICAO"));
			pe.setIdprocedimento(rs.getInt("IDPROCEDIMENTO"));
			pe.setNmprocedimento(rs.getString("NMPROCEDIMENTO"));
			pe.setNmfrequencia(rs.getString("NMFREQUENCIA"));
			lista.add(pe);
		}
		pst.close();
		return lista;
		
	}

}
