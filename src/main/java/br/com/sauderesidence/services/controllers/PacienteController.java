package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.PacienteModel;

public class PacienteController {
	
	public List<PacienteModel> listarPacientesGeral() throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "ADM.ID, "
				+ "PF.NAME AS NMPACIENTE, "
				+ "PV.NAME AS NMSERVICO, "
				+ "PAT.ID AS IDPATIENT, "
				+ "(CASE WHEN CV.NAME IS NULL THEN 'PARTICULAR' ELSE CV.NAME END) AS NMCONVENIO "
				+ "FROM "
				+ "CAPADMISSION ADM "
				+ "INNER JOIN GLBPATIENT PAT ON PAT.ID = ADM.IDPATIENT "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PAT.IDPERSON "
				+ "INNER JOIN GLBHEALTHPROVDEP HP ON HP.ID = ADM.IDHEALTHPROVDEP "
				+ "INNER JOIN GLBHEALTHPROVIDER PV ON PV.ID = HP.IDHEALTHPROVIDER "
				+ "LEFT JOIN GLBENTERPRISE CV ON CV.ID = ADM.IDENTERPRISE "
				+ "WHERE "
				+ "ADM.STATUS = 1 "
				+ "AND PV.ID IN (1,10,7,6,22,25,26,27) "
				+ "ORDER BY "
				+ "PF.NAME");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		ResultSet rs = pst.executeQuery();		
		List<PacienteModel> lista = new ArrayList<>();
		while(rs.next()) {
			PacienteModel paciente = new PacienteModel();
			paciente.setIdadmission(rs.getInt("ID"));
			paciente.setNome(rs.getString("NMPACIENTE"));
			paciente.setNmconvenio(rs.getString("NMCONVENIO"));
			paciente.setNmservico(rs.getString("NMSERVICO"));
			paciente.setIdpatient(rs.getInt("IDPATIENT"));			
			lista.add(paciente);
		}
		pst.close();
		return lista;
	}
	
	public PacienteModel buscarPacientePorAdmissao(int idadmission) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT "
				+ "ADM.ID, "
				+ "PF.NAME AS NMPACIENTE, "
				+ "PV.NAME AS NMSERVICO, "
				+ "PAT.ID AS IDPATIENT, "
				+ "(CASE WHEN CV.NAME IS NULL THEN 'PARTICULAR' ELSE CV.NAME END) AS NMCONVENIO "
				+ "FROM "
				+ "CAPADMISSION ADM "
				+ "INNER JOIN GLBPATIENT PAT ON PAT.ID = ADM.IDPATIENT "
				+ "INNER JOIN GLBPERSON PF ON PF.ID = PAT.IDPERSON "
				+ "INNER JOIN GLBHEALTHPROVDEP HP ON HP.ID = ADM.IDHEALTHPROVDEP "
				+ "INNER JOIN GLBHEALTHPROVIDER PV ON PV.ID = HP.IDHEALTHPROVIDER "
				+ "LEFT JOIN GLBENTERPRISE CV ON CV.ID = ADM.IDENTERPRISE "
				+ "WHERE "
				+ "ADM.ID = ? "
				+ "AND ADM.STATUS = 1 "
				+ "AND PV.ID IN (1,10,7,6,22,25,26,27) "
				+ "ORDER BY "
				+ "PF.NAME");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		ResultSet rs = pst.executeQuery();		
		PacienteModel paciente = null;
		while(rs.next()) {
			paciente = new PacienteModel();
			paciente.setIdadmission(rs.getInt("ID"));
			paciente.setNome(rs.getString("NMPACIENTE"));
			paciente.setNmconvenio(rs.getString("NMCONVENIO"));
			paciente.setNmservico(rs.getString("NMSERVICO"));
			paciente.setIdpatient(rs.getInt("IDPATIENT"));		
			
		}
		pst.close();
		return paciente;
	}

}
