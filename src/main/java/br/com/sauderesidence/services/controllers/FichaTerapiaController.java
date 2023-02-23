package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.FichaTerapiaModel;

public class FichaTerapiaController {
	
	public boolean gravarFicha(FichaTerapiaModel ficha) {
		
		EvolucaoController ctrEvolucao = new EvolucaoController();
		AssinaturaController ctrAssinatura = new AssinaturaController();
		
		try {
			int idEvolucao = ctrEvolucao.buscarUltimaEvolucao(
					ficha.getIdadmission(), 
					ficha.getIdprofessional(), 
					ficha.getDatainicio(), 
					ficha.getDatafim(), 
					108);
			
			String participacaoAtivo = "ATIVO".equals(ficha.getParticipacaocliente()) ? "S" : "N";
			String participacaoAtivoAssistido = "ATIVO ASSISTIDO".equals(ficha.getParticipacaocliente()) ? "S" : "N";
			String participacaoPassivo = "PASSIVO".equals(ficha.getParticipacaocliente()) ? "S" : "N";
			String participacaoNaoRealizada = "NÃO REALIZADA".equals(ficha.getParticipacaocliente()) ? "S" : "N";
			
			String execucaoCompleta = "COMPLETA".equals(ficha.getExecucaotecnicaproposta()) ? "S" : "N";
			String execucaoParcial = "PARCIAL".equals(ficha.getExecucaotecnicaproposta()) ? "S" : "N";
			String execucaoMinima = "MINIMA".equals(ficha.getExecucaotecnicaproposta()) ? "S" : "N";
			String execucaoNaoRealizada = "NÃO REALIZADA".equals(ficha.getExecucaotecnicaproposta()) ? "S" : "N";
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO TDACESPECIALIDADE ("
					+ "IDREFERENCE, EVENTDATE, SCSPECIALITY, PARTATIVO, PARTATIVOASSISTIDO, "
					+ "PARTPASSIVO, PARTNAOREALIZADO, EXECCOMPLETA, EXECPARCIAL, EXECMINIMA, "
					+ "OBSERVACAO, IDPROFESSIONAL, DATAINICIO, DATAFIM, IDEVOLUTION, "
					+ "LATITUDE, LONGITUDE, OFF_LINE, EXECNAOREALIZADO) VALUES ("
					+ "?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, ?, ?, "
					+ "?, ?, ?, ?, ?, "
					+ "?, ?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, "
					+ "?, ?, ?, ? "
					+ ")");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, ficha.getIdadmission());
			pst.setString(2, ficha.getDatainicio());
			pst.setInt(3, ficha.getIdespecialidade());
			pst.setString(4, participacaoAtivo);
			pst.setString(5, participacaoAtivoAssistido);
			pst.setString(6, participacaoPassivo);
			pst.setString(7, participacaoNaoRealizada);
			pst.setString(8, execucaoCompleta);
			pst.setString(9, execucaoParcial);
			pst.setString(10, execucaoMinima);
			pst.setString(11, ficha.getObservacao());
			pst.setInt(12, ficha.getIdprofessional());
			pst.setString(13, ficha.getDatainicio());
			pst.setString(14, ficha.getDatafim());
			pst.setInt(15, idEvolucao);
			pst.setString(16, ficha.getLatitude());
			pst.setString(17, ficha.getLongitude());
			pst.setString(18, "N");
			pst.setString(19, execucaoNaoRealizada);
			pst.execute();
			pst.close();
			
			ctrAssinatura.gravarAssinatura(
					idEvolucao, 
					ficha.getIdadmission(), 
					ficha.getAssinaturapaciente(), 
					ficha.getAssinaturaprofissional(), 
					ficha.getIdprofagenda());
			
			StringBuilder sqlConsulta = new StringBuilder();
			sqlConsulta.append("UPDATE CAPCONSULT SET IDEVOLUTION = ? WHERE IDPROFAGENDA = ?");
			PreparedStatement pstConsulta = Conexao.abrirConexaoOracle().prepareStatement(sqlConsulta.toString());
			pstConsulta.setInt(1, idEvolucao);
			pstConsulta.setInt(2, ficha.getIdprofagenda());
			pstConsulta.execute();
			pstConsulta.close();
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
