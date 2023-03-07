package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.helpers.Uteis;
import br.com.sauderesidence.services.models.FichaNutricaoModel;
import br.com.sauderesidence.services.models.PacienteModel;

public class FichaNutricaoController {
	
	public boolean gravarFicha(FichaNutricaoModel fn) {
		
		EvolucaoController ctrEvolucao = new EvolucaoController();
		AssinaturaController ctrAssinatura = new AssinaturaController();
		
		try {
			int idEvolucao = ctrEvolucao.buscarUltimaEvolucao(
					fn.getIdadmission(), 
					fn.getIdprofessional(), 
					fn.getDatainicio(), 
					fn.getDatafim(), 
					109);
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO TDACNUTRICAO (");
			sql.append("IDREFERENCE, EVENTDATE, IDEVOLUTION, ACOMPANHANTE, GRUPO_HAS, "
			+ "GRUPO_DIABETES, GRUPO_DISLIPIDEMIA, GRUPO_IMOBILIDADE, GRUPO_OBESIDADE, GRUPO_DESNUTRICAO, "
			+ "GRUPO_OUTROS, NUTRICAO, NUT_ENT_TIPO, NUT_ENT_TIPO_OUTRO, DIETA_ENTERAL, "
			+ "DIETA_ENTUPIMENTO, DIETA_IND_TIPO, DIETA_IND_MAN_QTDE, DIETA_IND_MAN_DESC, DIETA_IND_PRO_QTDE, "
			+ "DIETA_IND_PRO_DESC, DIETA_IND_PRO_FAB, DIETA_IND_FORN, AVALSUB_ING, AVALSUB_PESO_TIPO, "
			+ "AVALSUB_PESO_QTDE, AVALSUB_PESO_TEMPO, AVALSUB_SINT_DIA, AVALSUB_SINT_HIP, AVALSUB_SINT_CONST, "
			+ "AVALSUB_SINT_OUTRO, AVALSUB_RITMO_INT, AVALANTRO_AJ, AVALANTRO_PESO, AVALANTRO_CIRCABD, "
			+ "AVALANTRO_IMC, AVALANTRO_CP, AVALANTRO_DCT, AVALANTRO_CB, AVALANTRO_CMB, "
			+ "AVALANTRO_ALT, DIAG_NUT, DIAG_NUT_65, DIAG_NUT_DESC, CONDUTA, "
			+ "LATITUDE, LONGITUDE, OFF_LINE");
			sql.append(") VALUES ");
			sql.append("(?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?, ?, ?, ");
			sql.append("?, ?, ?");
			sql.append(")");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, fn.getIdadmission());
			pst.setString(2, fn.getDatainicio());
			pst.setInt(3, idEvolucao);
			pst.setString(4, fn.getAcompanhante());
			pst.setString(5, fn.getGrupohas());
			pst.setString(6, fn.getGrupodiabetes());
			pst.setString(7, fn.getGrupodislipidemia());
			pst.setString(8, fn.getGrupoimobilidade());
			pst.setString(9, fn.getGrupoobesidade());
			pst.setString(10, fn.getGrupodesnutricao());
			pst.setString(11, fn.getGrupooutros());
			pst.setInt(12, fn.getNutricao());
			pst.setInt(13, fn.getNutricaotipoenteral());
			pst.setString(14, fn.getNutricaotipoenteraloutros());
			pst.setInt(15, fn.getDietaenteral());
			pst.setString(16, fn.getDietaenteralentupimento());
			pst.setInt(17, fn.getDietaindustipo());
			pst.setString(18, fn.getDietaindustmanipqtde());
			pst.setString(19, fn.getDietaindustmanipdesc());
			pst.setString(20, fn.getDietaindustprontaqtde());
			pst.setString(21, fn.getDietaindustprontadesc());
			pst.setString(22, fn.getDietaindustprontafab());
			pst.setInt(23, fn.getDietaindustfornecedor());
			pst.setInt(24, fn.getAvalsubjingesta());
			pst.setInt(25, fn.getAvalsubjpesotipo());
			pst.setString(26, fn.getAvalsubjpesoqtde());
			pst.setString(27, fn.getAvalsubjpesotempo());
			pst.setString(28, fn.getAvalsubjsintomadiarreia());
			pst.setString(29, fn.getAvalsubjsintomahiporexia());
			pst.setString(30, fn.getAvalsubjsintomaconstipacao());
			pst.setString(31, fn.getAvalsubjsintomaoutros());
			pst.setString(32, fn.getAvalsubjritmointestinal());
			pst.setString(33, fn.getAvalantroaj());
			pst.setString(34, fn.getAvalantropeso());
			pst.setString(35, fn.getAvalantrocircabd());
			pst.setString(36, fn.getAvalantroimc());
			pst.setString(37, fn.getAvalantrocp());
			pst.setString(38, fn.getAvalantrodct());
			pst.setString(39, fn.getAvalantrocb());
			pst.setString(40, fn.getAvalantrocmb());
			pst.setString(41, fn.getAvalantroaltura());
			pst.setInt(42, fn.getDiagnutriabaixo65());
			pst.setInt(43, fn.getDiagnutriacima65());
			pst.setString(44, fn.getDiagnutridesc());
			pst.setString(45, fn.getConduta());
			pst.setString(46, fn.getLatitude());
			pst.setString(47, fn.getLongitude());
			pst.setString(48, "N");
			pst.execute();
			pst.close();
			
			ctrAssinatura.gravarAssinatura(
					idEvolucao, 
					fn.getIdadmission(), 
					fn.getAssinaturapaciente(), 
					fn.getAssinaturaprofissional(), 
					fn.getIdprofagenda());
			
			StringBuilder sqlConsulta = new StringBuilder();
			sqlConsulta.append("UPDATE CAPCONSULT SET IDEVOLUTION = ? WHERE IDPROFAGENDA = ?");
			PreparedStatement pstConsulta = Conexao.abrirConexaoOracle().prepareStatement(sqlConsulta.toString());
			pstConsulta.setInt(1, idEvolucao);
			pstConsulta.setInt(2, fn.getIdprofagenda());
			pstConsulta.execute();
			pstConsulta.close();
			
			if ("N".equals(fn.getManterconduta())) {
			    PacienteController ctrPaciente = new PacienteController();   
				
		        PacienteModel dadosPaciente = ctrPaciente.buscarPacientePorAdmissao(fn.getIdadmission());
		        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		       
		        StringBuilder html = new StringBuilder();
				html.append(""
				+ "<html>"
				+ "<head>"
				+ "<style type='text/css'>"
				+ ".titulo_gg{"
				+ "font-family: 'Myriad Pro', Arial, Helvetica, sans-serif;"
				+ "font-size: 25px;"
				+ "font-weight: normal;"
				+ "letter-spacing: 0.9px;"
				+ "white-space: nowrap;"
				+ "color: #0d4362;"
				+ "text-align: left;"
				+ "}"
				+ ".cor1{"
				+ "background: rgb(0, 153, 204);"
				+ "}"
				+ ".cor2{"
				+ "background: rgb(232, 250, 255);"
				+ "}"
				+ ".fonte1{"
				+ "font-family: Tahoma;"
				+ "color: #FFFFFF;"
				+ "font-weight: bold;"
				+ "vertical-align: middle;"
				+ "font-size: 10px;"
				+ "}"
				+ ".fonte2{"
				+ "font-family: Tahoma;"
				+ "color: #FFFFFF;"
				+ "font-weight: bold;"
				+ "vertical-align: middle;"
				+ "font-size: 14px;"
				+ "}"
				+ ".label1{"
				+ "font-family: Tahoma;"
				+ "color: rgb(51, 102, 153);"
				+ "font-weight: normal;"
				+ "vertical-align: middle;"
				+ "font-size: 14px;"
				+ "}"
				+ "</style>"
				+ "</head>"
				+ "<body>"
				+ "<table style='width=100%'>"
				+ "<tr>"
				+ "<td colspan='2' style='width=100%' class='titulo_gg'>ALTERAÇÃO DE CONDUTA - NUTRICIONISTA<hr></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='width=50%' class='cor1 fonte2'>Paciente:</td>"
				+ "<td style='width=50%' class='cor2 label1'>").append(dadosPaciente.getNome()).append("</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='width=50%' class='cor1 fonte2'>Convênio:</td>"
				+ "<td style='width=50%' class='cor2 label1'>").append(dadosPaciente.getNmconvenio()).append("</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='width=50%' class='cor1 fonte2'>Conduta:</td>"
				+ "<td style='width=50%' class='cor2 label1'>").append(fn.getConduta()).append("</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td colspan='2' style='width=100%'><i>Alteração gerada em: ").append(formato.format(new Date())).append("</i></td>"
				+ "</tr>"
				+ "</table>"
				+ "</body>"
				+ "</html>");
		
				Uteis.enviarEmail("case@sauderesidence.com.br", "ALTERAÇÃO DE CONDUTA", html.toString());
				Uteis.enviarEmail("secretaria.ce@sauderesidence.com.br", "ALTERAÇÃO DE CONDUTA", html.toString());

		       
		    }
			
			return true;
			
		}  catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
