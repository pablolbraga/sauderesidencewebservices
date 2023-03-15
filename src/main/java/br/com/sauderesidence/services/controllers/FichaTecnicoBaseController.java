package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.FichaTecnicoBaseModel;

public class FichaTecnicoBaseController {
	
public boolean gravarFicha(FichaTecnicoBaseModel ft) {
		
		EvolucaoController ctrEvolucao = new EvolucaoController();
		AssinaturaController ctrAssinatura = new AssinaturaController();
		
		try {
			int idEvolucao = ctrEvolucao.buscarUltimaEvolucao(
					ft.getIdadmission(), 
					ft.getIdprofessional(), 
					ft.getDatainicio(), 
					ft.getDatafim(), 
					101);
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO TDACAUX (");
			sql.append("IDEVOLUTION, IDREFERENCE, EVENTDATE, ADM_MEDIC, IV, ");
			sql.append("IM, SC, CLISTER, CURATIVO, CAT_ALIVIO, ");
			sql.append("CAT_URINA, CUID_GERAIS, ECG, PUNCAO, RET_PONTOS, ");
			sql.append("PROC_OUTROS, MEDICAMENTOS, EVOLUCAO, ABD, ABD_UNIT, ");
			sql.append("ALGODAO, ALGODAO_UNIT, AGULHA1, AGULHA1_UNIT, CATETER, ");
			sql.append("CATETER_UNIT, EQUIPO, EQUIPO_UNIT, EXTENSOR1, EXTENSOR1_UNIT, ");
			sql.append("GAZE_AC, GAZE_AC_UNIT, GAZE_EM, GAZE_EM_UNIT, GAZE_ES, ");
			sql.append("GAZE_ES_UNIT, HEPARINA, HEPARINA_UNIT, IV_FIX, IV_FIX_UNIT, ");
			sql.append("JELCO, JELCO_UNIT, LAMINA, LAMINA_UNIT, LUVA_ES, ");
			sql.append("LUVA_ES_UNIT, LUVA_PROC, LUVA_PROC_UNIT, MASK, MASK_UNIT, ");
			sql.append("MICROPORE25, MICROPORE25_UNIT, MICROPORE50, MICROPORE50_UNIT, SCALP, ");
			sql.append("SCALP_UNIT, SERINGA1, SERINGA1_UNIT, SF, SF_UNIT, ");
			sql.append("MAT_OUTROS, MAT_OUTROS_UNIT, ALCOOL, ALCOOL_UNIT, ATADURA, ");
			sql.append("ATADURA_UNIT, TP_CHAMADA, LATITUDE, LONGITUDE, EXTENSOR2, ");
			sql.append("EXTENSOR2_UNIT) VALUES (");
			sql.append("?, ?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?)");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, idEvolucao);
			pst.setInt(2, ft.getIdadmission());
			pst.setString(3, ft.getDatainicio());
			pst.setInt(4, ft.getAdministracaomed());
			pst.setInt(5, ft.getAdministracaomediv());	
			pst.setInt(6, ft.getAdministracaomedim());
			pst.setInt(7, ft.getAdministracaomedsc());
			pst.setInt(8, ft.getClister());
			pst.setInt(9, ft.getCurativo());
			pst.setInt(10, ft.getCateterismovesicalalivio());
			pst.setInt(11, ft.getCateterismovericalurina());
			pst.setInt(12, ft.getCuidadogerais());
			pst.setInt(13, ft.getEcg());
			pst.setInt(14, ft.getPuncao());
			pst.setInt(15, ft.getRetiradapontos());
			pst.setString(16, ft.getOutrosprocedimentos());
			pst.setString(17, ft.getMedicamentos());
			pst.setString(18, ft.getEvolucao());
			pst.setInt(19, ft.getAbd() == "" ? 0 : 1);
			pst.setString(20, ft.getAbd());
			pst.setInt(21, ft.getAlcool() == "" ? 0 : 1);
			pst.setString(22, ft.getAlgodao());
			pst.setInt(23, ft.getAgulha() == "" ? 0 : 1);
			pst.setString(24, ft.getAgulha());
			pst.setInt(25, ft.getCateter() == "" ? 0 : 1);
			pst.setString(26, ft.getCateter());
			pst.setInt(27, ft.getEquipo() == "" ? 0 : 1);
			pst.setString(28, ft.getEquipo());
			pst.setInt(29, ft.getExtensor1via() == "" ? 0 : 1);
			pst.setString(30, ft.getExtensor1via());
			pst.setInt(31, ft.getGazeacolchoada() == "" ? 0 : 1);
			pst.setString(32, ft.getGazeacolchoada());
			pst.setInt(33, ft.getGazeembebida() == "" ? 0 : 1);
			pst.setString(34, ft.getGazeembebida());
			pst.setInt(35, ft.getGazeesteril() == "" ? 0 : 1);
			pst.setString(36, ft.getGazeesteril());
			pst.setInt(37, ft.getHeparina() == "" ? 0 : 1);
			pst.setString(38, ft.getHeparina());
			pst.setInt(39, ft.getIvfix() == "" ? 0 : 1);
			pst.setString(40, ft.getIvfix());
			pst.setInt(41, ft.getJelco() == "" ? 0 : 1);
			pst.setString(42, ft.getJelco());
			pst.setInt(43, ft.getBisturi() == "" ? 0 : 1);
			pst.setString(44, ft.getBisturi());
			pst.setInt(45, ft.getLuvaesteril() == "" ? 0 : 1);
			pst.setString(46, ft.getLuvaesteril());
			pst.setInt(47, ft.getLuvaprocedimento() == "" ? 0 : 1);
			pst.setString(48, ft.getLuvaprocedimento());
			pst.setInt(49, ft.getMascara() == "" ? 0 : 1);
			pst.setString(50, ft.getMascara());
			pst.setInt(51, ft.getMicropore2510() == "" ? 0 : 1);
			pst.setString(52, ft.getMicropore2510());
			pst.setInt(53, ft.getMicropore5010() == "" ? 0 : 1);
			pst.setString(54, ft.getMicropore5010());
			pst.setInt(55, ft.getScalp() == "" ? 0 : 1);
			pst.setString(56, ft.getScalp());
			pst.setInt(57, ft.getSeringa() == "" ? 0 : 1);
			pst.setString(58, ft.getSeringa());
			pst.setInt(59, ft.getSorofisiologico() == "" ? 0 : 1);
			pst.setString(60, ft.getSorofisiologico());
			pst.setInt(61, ft.getOutrosmateriais() == "" ? 0 : 1);
			pst.setString(62, ft.getOutrosmateriais());
			pst.setInt(63, ft.getAlcool() == "" ? 0 : 1);
			pst.setString(64, ft.getAlcool());
			pst.setInt(65, ft.getAtadura() == "" ? 0 : 1);
			pst.setString(66, ft.getAtadura());
			pst.setInt(67, ft.getTipochamada());
			pst.setString(68, ft.getLatitude());
			pst.setString(69, ft.getLongitude());
			pst.setInt(70, ft.getExtensor2via() == "" ? 0 : 1);
			pst.setString(71, ft.getExtensor2via());
			pst.execute();
			pst.close();
			
			ctrAssinatura.gravarAssinatura(
					idEvolucao, 
					ft.getIdadmission(), 
					ft.getAssinaturapaciente(), 
					ft.getAssinaturaprofissional(), 
					ft.getIdprofagenda());
			
			StringBuilder sqlConsulta = new StringBuilder();
			sqlConsulta.append("UPDATE CAPCONSULT SET IDEVOLUTION = ? WHERE IDPROFAGENDA = ?");
			PreparedStatement pstConsulta = Conexao.abrirConexaoOracle().prepareStatement(sqlConsulta.toString());
			pstConsulta.setInt(1, idEvolucao);
			pstConsulta.setInt(2, ft.getIdprofagenda());
			pstConsulta.execute();
			pstConsulta.close();
			
			return true;			
		}  catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
