package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.helpers.Uteis;
import br.com.sauderesidence.services.models.AgendaModel;

public class AgendaController {
	
	public List<AgendaModel> listarAgendaPorProfissional(int idperson) throws SQLException{
		
		String data = Uteis.retornarDataAtual();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ("
				+ "SELECT "
				+ "CC.ID AS IDCAPCONSULT, "
				+ "CC.IDADMISSION, "
				+ "CC.IDEVOLUTION, "
				+ "PAT.ID AS IDPATIENT, "
				+ "PF.ID AS IDPERSON, "
				+ "PF.NAME AS NMPACIENTE, "
				+ "(CASE WHEN ADM.IDENTERPRISE IS NULL THEN 0 ELSE CONV.ID END) AS IDCONVENIO, "
				+ "(CASE WHEN ADM.IDENTERPRISE IS NULL THEN 'PARTICULAR' ELSE CONV.NAME END) AS NMCONVENIO, "
				+ "TRUNC((MONTHS_BETWEEN(SYSDATE, TO_DATE(TO_CHAR(PF.BIRTHDAY, 'DD/MM/YYYY'), 'DD/MM/YYYY')))/12) AS IDADE, "
				+ "PA.ID AS IDPROFAGENDA "
				+ "FROM "
				+ "CAPPROFAGENDA PA "
				+ "INNER JOIN CAPCONSULT CC ON CC.IDPROFAGENDA = PA.ID "
				+ "INNER JOIN CAPADMISSION ADM ON ADM.ID = CC.IDADMISSION AND ADM.STATUS = 1 "
				+ "INNER JOIN GLBPATIENT PAT ON PAT.ID = ADM.IDPATIENT "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PAT.IDPERSON "
				+ "LEFT JOIN CAPEVOLUTION EVO ON EVO.ID = CC.IDEVOLUTION "
				+ "LEFT JOIN GLBENTERPRISE CONV ON CONV.ID = ADM.IDENTERPRISE "
				+ "WHERE "
				+ "PA.IDPROFESSIONAL = ? "
				+ "AND PA.AGENDASTARTDATE BETWEEN TO_DATE('" + data + " 00:00:00','DD/MM/YYYY HH24:MI:SS') AND TO_DATE('" + data + " 23:59:59', 'DD/MM/YYYY HH24:MI:SS') "
				+ ") J "
				+ "WHERE "
				+ "J.IDEVOLUTION IS NULL");
		//System.out.println(sql.toString());
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idperson);
		ResultSet rs = pst.executeQuery();		
		List<AgendaModel> lista = new ArrayList<>();
		while(rs.next()) {
			AgendaModel agenda = new AgendaModel();
			agenda.setIdcapconsult(rs.getInt("IDCAPCONSULT"));
			agenda.setIdadmission(rs.getInt("IDADMISSION"));
			agenda.setIdpatient(rs.getInt("IDPATIENT"));
			agenda.setIdperson(rs.getInt("IDPERSON"));
			agenda.setNmpaciente(rs.getString("NMPACIENTE"));
			agenda.setIdconvenio(rs.getInt("IDCONVENIO"));
			agenda.setNmconvenio(rs.getString("NMCONVENIO"));
			agenda.setIdade(rs.getInt("IDADE"));
			agenda.setIdprofagenda(rs.getInt("IDPROFAGENDA"));
			agenda.setIdevolucao(rs.getInt("IDEVOLUTION"));
			lista.add(agenda);
		}
		pst.close();
		return lista;
	}

}
