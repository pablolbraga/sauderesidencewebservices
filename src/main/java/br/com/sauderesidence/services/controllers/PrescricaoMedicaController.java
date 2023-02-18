package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.PrescricaoMedicaModel;

public class PrescricaoMedicaController {
	
	public List<PrescricaoMedicaModel> listarPrescricaoPorAdmissao(int idadmission) throws SQLException{
		
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
		
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "SELECT "
					+ "0 AS SCMEDICAMENT, "
					+ "A.INSTRUCTIONS AS NMPRINCIPIO, "
					+ "A.MEDICAMENT AS MEDICAMENTO, "
					+ "A.QUANTITY AS QTDE, "
					+ "A.MU AS UNIDMED, "
					+ "C.NAME AS NMFREQUENCIA, "
					+ "A.INSTRUCTIONS AS INSTRUCOES, "
					+ "A.SCHEDULE, "
					+ "APP.NAME AS NMVIA, "
					+ "APP.VIEWINPRESCRIPTION AS IDVIA, "
					+ "A.ITEM, "
					+ "A.SUBITEM, "
					+ "A.IDPRESCRIPTION "
				+ "FROM "
					+ "CAPPRESCRIPITEM A "
					+ "LEFT JOIN CAPAPPLICATIONTYPE APP ON APP.VIEWINPRESCRIPTION = A.IDAPPLICATIONTYPE AND APP.CANCELED IS NULL "
					+ "LEFT JOIN SCCCODE B ON B.ID = A.SCMEDICAMENT "
					+ "LEFT JOIN GLBFREQUENCY C ON C.ID = A.IDFREQUENCY "
				+ "WHERE "
					+ "A.IDPRESCRIPTION = ? "
					+ "AND A.SCMEDICAMENT IS NULL ");
		sql.append("UNION ALL ");
		sql.append(""
				+ "SELECT "
					+ "A.SCMEDICAMENT, "
					+ "B.CODENAME AS NMPRINCIPIO, "
					+ "A.MEDICAMENT AS MEDICAMENTO, "
					+ "A.QUANTITY AS QTDE, "
					+ "A.MU AS UNIDMED, "
					+ "C.NAME AS NMFREQUENCIA, "
					+ "A.INSTRUCTIONS AS INSTRUCOES, "
					+ "A.SCHEDULE, "
					+ "APP.NAME AS NMVIA, "
					+ "APP.VIEWINPRESCRIPTION AS IDVIA, "
					+ "A.ITEM, "
					+ "A.SUBITEM, "
					+ "A.IDPRESCRIPTION "
				+ "FROM "
					+ "CAPPRESCRIPITEM A "
					+ "LEFT JOIN CAPAPPLICATIONTYPE APP ON APP.VIEWINPRESCRIPTION = A.IDAPPLICATIONTYPE AND APP.CANCELED IS NULL "
					+ "LEFT JOIN SCCCODE B ON B.ID = A.SCMEDICAMENT "
					+ "LEFT JOIN GLBFREQUENCY C ON C.ID = A.IDFREQUENCY "
				+ "WHERE "
					+ "A.IDPRESCRIPTION = ? "
					+ "AND NOT A.SCMEDICAMENT IS NULL ");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idPrescricao);
		pst.setInt(2, idPrescricao);
		ResultSet rs = pst.executeQuery();
		List<PrescricaoMedicaModel> lista = new ArrayList<>();
		while(rs.next()) {
			if (rs.getInt("SCMEDICAMENT") > 0) {
				PrescricaoMedicaModel pm = new PrescricaoMedicaModel();
				pm.setId(rs.getInt("IDPRESCRIPTION"));
				pm.setIdproduto(rs.getInt("SCMEDICAMENT"));
				pm.setNmproduto(rs.getInt("SCMEDICAMENT") == 0 ? "" : rs.getString("NMPRINCIPIO"));
				pm.setQuantidade(rs.getDouble("QTDE") == 0.0 ? "S/N" : Double.toString(rs.getDouble("QTDE")));
				pm.setUnidmed(rs.getString("UNIDMED"));
				pm.setFrequencia(rs.getString("NMFREQUENCIA"));
				pm.setInstrucao(rs.getString("INSTRUCOES") == null ? "" : rs.getString("INSTRUCOES"));
				pm.setHorario(rs.getString("SCHEDULE"));
				pm.setVia(rs.getString("NMVIA") == null ? "" : rs.getString("NMVIA"));
				lista.add(pm);
			}
		}
		
		return lista;
		
	}

}
