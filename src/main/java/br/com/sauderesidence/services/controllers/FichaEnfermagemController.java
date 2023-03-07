package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.FichaEnfermagemModel;

public class FichaEnfermagemController {
	
	public boolean gravarFicha(FichaEnfermagemModel fe) {
		
		EvolucaoController ctrEvolucao = new EvolucaoController();
		AssinaturaController ctrAssinatura = new AssinaturaController();
		
		try {
			int idEvolucao = ctrEvolucao.buscarUltimaEvolucao(
					fe.getIdadmission(), 
					fe.getIdprofessional(), 
					fe.getDatainicio(), 
					fe.getDatafim(), 
					98);
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO TDACENFA ("
					+ "IDREFERENCE, IDEVOLUTION, EVENTDATE, INTERNACAO, NOME_HOSPITAL, "
					+ "AV_CUIDADO_BANHO, AV_CUIDADO_VESTIR, AV_CUIDADO_TRANSF, AV_CUIDADO_CONT, AV_CUIDADO_ALIM, "
					+ "UTILIZ_TQ, UTILIZ_SNE, UTILIZ_GT, UTILIZ_CVD, UTILIZ_OUTRAS, "
					+ "OUTRASUTIL, OXIGENOTERAPIA_NAO, OXIGENOTERAPIA_CILINDRO, OXIGENOTERAPIA_CONCENTRADOR, OXIGENOTERAPIA_CON, "
					+ "PA_MAX, PA_MIN, FERIDA_PRESSAO, FERIDA_VASCULO, FERIDA_CIRURGIC, FER_OUTROS, "
					+ "DIAG_01, DIAG_02, DIAG_03, DIAG_04, DIAG_05, "
					+ "DIAG_06, DIAG_07, DIAG_08, DIAG_09, DIAG_10, "
					+ "DIAG_11, DIAG_12, DIAG_13, DIAG_14, DIAG_15, "
					+ "PROC_COL_CVD, PROC_COL_CNE, PROC_COL_CNG, PROC_TROC_TQT, PROC_COL_CVA, "
					+ "PROC_COL_CV, PROC_COL_GT, PROC_CURATIVO, PROC_OUTROS, PROC_OUTROS_DESC, "
					+ "PLANO_CUID_1, PLANO_CUID_2, PLANO_CUID_3, PLANO_CUID_4, PLANO_CUID_5, "
					+ "PLANO_CUID_6, PLANO_CUID_7, PLANO_CUID_8, PLANO_CUID_9, PLANO_CUID_OUTROS, "
					+ "OBSERVACOES, MUD_DECUBITO, ACOMPANHANTE, VM, VMEQUIP, "
					+ "BRADEN_PERCEP_SENSORIAL, BRADEN_UMIDADE, BRADEN_ATIVIDADE, BRADEN_MOBILIDADE, BRADEN_NUTRICAO, "
					+ "BRADEN_FRICCAO, ESCALA_BRADEN, LATITUDE, LONGITUDE) VALUES ("
					+ "?, ?, TO_DATE(?,'DD/MM/YYYY HH24:MI:SS'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, fe.getIdadmission());
			pst.setInt(2, idEvolucao);
			pst.setString(3, fe.getDatainicio());
			pst.setInt(4, "".equals(fe.getHospital()) ? 1 : 0);
			pst.setString(5, fe.getHospital());
			pst.setInt(6, fe.getCuidadobanho());
			pst.setInt(7, fe.getCuidadovestir());
			pst.setInt(8, fe.getCuidadotransferencia());
			pst.setInt(9, fe.getCuidadocontinencia());
			pst.setInt(10, fe.getCuidadoalimentacao());
			pst.setInt(11, fe.getUtilizacaotqt());
			pst.setInt(12, fe.getUtilizacaocne());
			pst.setInt(13, fe.getUtilizacaogt());
			pst.setInt(14, fe.getUtilizacaocvd());
			pst.setInt(15, fe.getUtilizacaooutros());
			pst.setString(16, fe.getUtilizacaooutrostexto());
			pst.setInt(17, fe.getOxigenoterapianao());
			pst.setInt(18, fe.getOxigenoterapiacilindro());
			pst.setInt(19, fe.getOxigenoterapiaconcentrador());
			pst.setInt(20, fe.getOxigenoterapiacontinuo());
			pst.setInt(21, fe.getPamax());
			pst.setInt(22, fe.getPamin());
			pst.setInt(23, fe.getFeridapressao());
			pst.setInt(24, fe.getFeridavasculogencia());
			pst.setInt(25, fe.getFeridacirurgia());
			pst.setString(26, fe.getFeridaoutros());
			pst.setInt(27, fe.getDiag001());
			pst.setInt(28, fe.getDiag002());
			pst.setInt(29, fe.getDiag003());
			pst.setInt(30, fe.getDiag004());
			pst.setInt(31, fe.getDiag005());
			pst.setInt(32, fe.getDiag006());
			pst.setInt(33, fe.getDiag007());
			pst.setInt(34, fe.getDiag008());
			pst.setInt(35, fe.getDiag009());
			pst.setInt(36, fe.getDiag010());
			pst.setInt(37, fe.getDiag011());
			pst.setInt(38, fe.getDiag012());
			pst.setInt(39, fe.getDiag013());
			pst.setInt(40, fe.getDiag014());
			pst.setInt(41, fe.getDiag015());
			pst.setInt(42, fe.getProc001());
			pst.setInt(43, fe.getProc002());
			pst.setInt(44, fe.getProc003());
			pst.setInt(45, fe.getProc004());
			pst.setInt(46, fe.getProc005());
			pst.setInt(47, fe.getProc006());
			pst.setInt(48, fe.getProc007());
			pst.setInt(49, fe.getProc008());
			pst.setInt(50, fe.getProcoutros());
			pst.setString(51, fe.getProcoutrostexto());
			pst.setInt(52, fe.getCuid001());
			pst.setInt(53, fe.getCuid002());
			pst.setInt(54, fe.getCuid003());
			pst.setInt(55, fe.getCuid004());
			pst.setInt(56, fe.getCuid005());
			pst.setInt(57, fe.getCuid006());
			pst.setInt(58, fe.getCuid007());
			pst.setInt(59, fe.getCuid008());
			pst.setInt(60, fe.getCuidoutros());
			pst.setString(61, fe.getCuidoutrostexto());
			pst.setString(62, fe.getObservacao());
			pst.setInt(63, 2);
			pst.setString(64, fe.getAcompanhante());
			pst.setInt(65, fe.getVentilacaomecanica());
			pst.setString(66, fe.getVentilacaomecanicaequipamento());
			pst.setInt(67, fe.getBradenpercepcaosensorial());
			pst.setInt(68, fe.getBradenumidade());
			pst.setInt(69, fe.getBradenatividade());
			pst.setInt(70, fe.getBradenmobilidade());
			pst.setInt(71, fe.getBradennutricao());
			pst.setInt(72, fe.getBradenficcao());
			pst.setInt(73, fe.getBradenpercepcaosensorial() + fe.getBradenumidade() +
					fe.getBradenatividade() + fe.getBradenmobilidade() +
					fe.getBradennutricao() + fe.getBradenficcao());
			pst.setString(74, fe.getLatitude());
			pst.setString(75, fe.getLongitude());
			pst.execute();
			pst.close();
			
			ctrAssinatura.gravarAssinatura(
					idEvolucao, 
					fe.getIdadmission(), 
					fe.getAssinaturapaciente(), 
					fe.getAssinaturaprofissional(), 
					fe.getIdprofagenda());
			
			StringBuilder sqlConsulta = new StringBuilder();
			sqlConsulta.append("UPDATE CAPCONSULT SET IDEVOLUTION = ? WHERE IDPROFAGENDA = ?");
			PreparedStatement pstConsulta = Conexao.abrirConexaoOracle().prepareStatement(sqlConsulta.toString());
			pstConsulta.setInt(1, idEvolucao);
			pstConsulta.setInt(2, fe.getIdprofagenda());
			pstConsulta.execute();
			pstConsulta.close();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
