package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.PrescricaoEnfermagemModel;

public class PrescricaoEnfermagemController {
	
public List<PrescricaoEnfermagemModel> listarPrescricaoPorAdmissao(int idadmission) throws SQLException{
		
		int idPrescricao = PrescricaoController.retornarUltimaPrescricao(idadmission);
		
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "SELECT "
					+ "PCE.ID, "
					+ "PAT.ID AS IDPATIENT, "
					+ "PC.ID AS IDPRESCRIPTION, "
					+ "PC.IDADMISSION, "
					+ "PF.NAME AS NMPACIENTE, "
					+ "SCCMAT.ID AS SCMEDICAMENT, "
					+ "SCCMAT.CODENAME AS NMPRODUTO, "
					+ "SCCPENF.CODENAME AS NMPROCEDIMENTO, "
					+ "PCE.QUANTITY AS QTDE, "
					+ "PCE.MU AS UNIDMED, "
					+ "FRE.NAME AS NMFREQUENCIA "					
				+ "FROM "
					+ "CAPPRESCRIPNURSE PRESCENF "
					+ "INNER JOIN CAPPRESCRIPTION PC ON PC.ID = PRESCENF.IDPRESCRIPTION "
					+ "INNER JOIN CAPPRESCRIPMAT PCE ON PCE.IDPRESCRIPNURSE = PRESCENF.ID "
					+ "INNER JOIN SCCCODE SCCPENF ON SCCPENF.ID = PRESCENF.SCNURSINGPROC "
					+ "INNER JOIN SCCCODE SCCMAT ON SCCMAT.ID = PCE.SCMATERIAL "
					+ "INNER JOIN CAPADMISSION ADM ON ADM.ID = PC.IDADMISSION "
					+ "INNER JOIN GLBPATIENT PAT ON PAT.ID = ADM.IDPATIENT "
					+ "INNER JOIN GLBPERSON PF ON PF.ID = PAT.IDPERSON "
					+ "LEFT JOIN GLBFREQUENCY FRE ON FRE.ID = PRESCENF.IDFREQUENCY "
				+ "WHERE "
					+ "PRESCENF.IDPRESCRIPTION = ? "
				+ "ORDER BY "
					+ "PCE.SEQ");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idPrescricao);
		ResultSet rs = pst.executeQuery();
		List<PrescricaoEnfermagemModel> lista = new ArrayList<>();
		while(rs.next()) {
			PrescricaoEnfermagemModel pe = new PrescricaoEnfermagemModel();
			pe.setId(rs.getInt("ID"));
			pe.setIdpatient(rs.getInt("IDPATIENT"));
			pe.setIdprescricao(rs.getInt("IDPRESCRIPTION"));
			pe.setIdadmission(rs.getInt("IDADMISSION"));
			pe.setNmpaciente(rs.getString("NMPACIENTE"));
			pe.setIdproduto(rs.getInt("SCMEDICAMENT"));
			pe.setNmproduto(rs.getInt("SCMEDICAMENT") == 0 ? "" : rs.getString("NMPRODUTO"));
			pe.setNmprocedimento(rs.getString("NMPROCEDIMENTO"));
			pe.setQuantidade(rs.getDouble("QTDE") == 0.0 ? "S/N" : Double.toString(rs.getDouble("QTDE")));
			pe.setUnidmed(rs.getString("UNIDMED"));
			pe.setFrequencia(rs.getString("NMFREQUENCIA"));
			lista.add(pe);
		}
		pst.close();
		return lista;
		
	}

}
