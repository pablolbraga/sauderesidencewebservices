package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.FichaMedicaModel;

public class FichaMedicaController {
	
public boolean gravarFicha(FichaMedicaModel fm) {
		
		EvolucaoController ctrEvolucao = new EvolucaoController();
		AssinaturaController ctrAssinatura = new AssinaturaController();
		
		try {
			int idEvolucao = ctrEvolucao.buscarUltimaEvolucao(
					fm.getIdadmission(), 
					fm.getIdprofessional(), 
					fm.getDatainicio(), 
					fm.getDatafim(), 
					107);
			
			StringBuilder sql = new StringBuilder();

			sql.append("INSERT INTO TDACMEDICO (")
			.append("IDREFERENCE, IDEVOLUTION, EVENTDATE, FISIOMOTORA, FRESPIRATORIA, ")
			.append("RESPX, MOTX, NUTRICIONISTA, FONOTERAPIA, ENFERMAGEM, ")
			.append("TERAP_OCUP, SITCLINICA, OUTROSANTIB, EXFISICO, NUTRI_ORAL, ")
			.append("NUTRI_GT, NUTRI_CNE, NUTRI_IV, AVD, PARTERIAL, ")
			.append("VM, VM_TIPO, VENTILADOR, OXIGENOTERAPIA, OX_TIPO, ")
			.append("PROBLEMAS, CONDUTAS, SOL_EXAMES, MUD_PRESC, OST_CISTOSTOMIA, ")
			.append("OST_GASTROSTOMIA, OST_TRAQUEOSTOMIA, OST_COLONOSTOMIA, OST_OUTROS, ASP_TRAQUEAL, ")
			.append("ACESSO_VENOSO, AV_TIPO, HD, FC, FR, ")
			.append("NOME_ACOMPANHANTE, OX_CIL, OX_CONC, JUST_ATEND_DOMIC, RM, ")
			.append("RV, AO, PONTOS, PSICOLOGO, LATITUDE, LONGITUDE) ")
			.append("VALUES (")
			.append("?, ?, TO_DATE(?,'DD/MM/YYYY HH24:MI:SS'), ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ")
			.append("?, ?, ?, ?, ?, ? ")
			.append(")");

			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, fm.getIdadmission());
			pst.setInt(2, idEvolucao);
			pst.setString(3, fm.getDatainicio());
			pst.setInt(4, fm.getFisioterapiamotora() > 0 ? 1 : 0);
			pst.setInt(5, fm.getFisioterapiarespiratoria() > 0 ? 1 : 0);
			pst.setInt(6, fm.getFisioterapiarespiratoria());
			pst.setInt(7, fm.getFisioterapiamotora());
			pst.setInt(8, fm.getNutricionista());
			pst.setInt(9, fm.getFonoterapia());
			pst.setInt(10, fm.getEnfermagem());
			pst.setInt(11, fm.getTerapiaocupacional());
			pst.setString(12, fm.getSituacaoclinica());
			pst.setString(13, fm.getAntibiotico());
			pst.setString(14, fm.getExamefisico());
			pst.setInt(15, fm.getNutricaooral());
			pst.setInt(16, fm.getNutricaogt());
			pst.setInt(17, fm.getNutricaocne());
			pst.setInt(18, fm.getNutricaoiv());
			pst.setInt(19, fm.getAtividadevidadiaria());
			pst.setString(20, Integer.toString(fm.getPamax()) + " x " + Integer.toString(fm.getPamin()));	
			pst.setInt(21, fm.getVentilacaomecanica() > 0 ? 2 : 1);
			pst.setInt(22, fm.getVentilacaomecanica());
			pst.setString(23, fm.getVentilador());
			pst.setInt(24, fm.getOxigenoterapia() > 0 ? 2 : 1);
			pst.setInt(25, fm.getOxigenoterapia());
			pst.setString(26, fm.getProblemas());
			pst.setString(27, fm.getOrientacao());
			pst.setInt(28, fm.getSolicitarexame());
			pst.setInt(29, fm.getMudancaprescricao());
			pst.setInt(30, fm.getOstomiacistostomia());
			pst.setInt(31, fm.getOstomiagastrostomia());
			pst.setInt(32, fm.getOstomiatraqueostomia());
			pst.setInt(33, fm.getOstomiacolostomia());
			pst.setString(34, fm.getOstomiaoutros());
			pst.setInt(35, fm.getAspiracaotraqueal());
			pst.setInt(36, fm.getAcessovenoso() > 0 ? 2 : 1);
			pst.setInt(37, fm.getAcessovenoso());
			pst.setString(38, fm.getHd());
			pst.setString(39, fm.getFc());
			pst.setString(40, fm.getFr());
			pst.setString(41, fm.getAcompanhante());
			pst.setInt(42, fm.getSuporteoxigeniocilindro());
			pst.setInt(43, fm.getSuporteoxigenioconcentrador());
			pst.setString(44, fm.getJustificativaatendimentodomiciliar());
			pst.setInt(45, fm.getNivelconscienciarm());
			pst.setInt(46, fm.getNivelconscienciarv());
			pst.setInt(47, fm.getNivelconscienciaao());
			pst.setInt(48, fm.getNivelconscienciapontos());
			pst.setInt(49, fm.getPsicologo());
			pst.setString(50, fm.getLatitude());
			pst.setString(51, fm.getLongitude());
			pst.execute();
			pst.close();
			
			ctrAssinatura.gravarAssinatura(
					idEvolucao, 
					fm.getIdadmission(), 
					fm.getAssinaturapaciente(), 
					fm.getAssinaturaprofissional(), 
					fm.getIdprofagenda());
			
			StringBuilder sqlConsulta = new StringBuilder();
			sqlConsulta.append("UPDATE CAPCONSULT SET IDEVOLUTION = ? WHERE IDPROFAGENDA = ?");
			PreparedStatement pstConsulta = Conexao.abrirConexaoOracle().prepareStatement(sqlConsulta.toString());
			pstConsulta.setInt(1, idEvolucao);
			pstConsulta.setInt(2, fm.getIdprofagenda());
			pstConsulta.execute();
			pstConsulta.close();
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}