package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.VisitasRealizadasModel;

public class VisitasRealizadasController {
	
	public List<VisitasRealizadasModel> buscarUltimaVisitaRealizadaPorAdmissao(int idadmission, int idespecialidade) throws SQLException{
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT J.* FROM ("
				+ "SELECT "
				+ "EVO.ID AS IDEVOLUTION, "
				+ "EVO.IDADMISSION, "
				+ "PF.NAME AS NMPACIENTE, "
				+ "EVO.IDPROFESSIONAL, "
				+ "EVO.PERSONNAME AS NMPROFESSIONAL, "
				+ "TO_CHAR(EVO.STARTDATE, 'DD/MM/YYYY HH24:MI:SS') AS DATAINI, "
				+ "TO_CHAR(EVO.ENDDATE, 'DD/MM/YYYY HH24:MI:SS') AS DATAFIM, "
				+ "CC.IDPROFAGENDA, "
				+ "EVO.SCSPECIALITY AS IDESPECIALIDADE, "
				+ "SC.CODENAME AS NMESPECIALIDADE ");
		if (idespecialidade == 148815) {
			sql.append(", MED.IMAGEM AS IMAGEM ");
		}
		sql.append("FROM CAPEVOLUTION EVO "
				+ "INNER JOIN CAPCONSULT CC ON CC.IDEVOLUTION = EVO.ID "
				+ "INNER JOIN SCCCODE SC ON SC.ID = CC.SCSPECIALITY "
				+ "INNER JOIN CAPADMISSION ADM ON ADM.ID = EVO.IDADMISSION "
				+ "INNER JOIN GLBPATIENT PAT ON PAT.ID = ADM.IDPATIENT "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PAT.IDPERSON ");
		if (idespecialidade == 148815) {
			sql.append("INNER JOIN TDACMEDICO MED ON MED.IDEVOLUTION = EVO.ID ");
		}
		sql.append("WHERE "
				+ "EVO.IDADMISSION = ? "
				+ "ORDER BY "
				+ "EVO.ID DESC");
		sql.append(") J WHERE ROWNUM = 1");
		
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		ResultSet rs = pst.executeQuery();
		List<VisitasRealizadasModel> lista = new ArrayList<>();
		while(rs.next()) {
			VisitasRealizadasModel vr = new VisitasRealizadasModel();
			vr.setIdevolution(rs.getInt("IDEVOLUTION"));
			vr.setIdadmission(rs.getInt("IDADMISSION"));
			vr.setNmpaciente(rs.getString("NMPACIENTE"));
			vr.setIdprofessional(rs.getInt("IDPROFESSIONAL"));
			vr.setNmprofessional(rs.getString("NMPROFESSIONAL"));
			vr.setDataini(rs.getString("DATAINI"));
			vr.setDatafim(rs.getString("DATAFIM"));
			vr.setIdprofagenda(rs.getInt("IDPROFAGENDA"));
			vr.setIdespecialidade(rs.getInt("IDESPECIALIDADE"));
			vr.setNmespecialidade(rs.getString("NMESPECIALIDADE"));
			vr.setImagem(rs.getString("IMAGEM") == null ? "" : rs.getString("IMAGEM"));
			lista.add(vr);
		}
		pst.close();
		return lista;
	}

}
