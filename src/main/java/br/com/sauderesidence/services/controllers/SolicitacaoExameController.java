package br.com.sauderesidence.services.controllers;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import br.com.sauderesidence.services.helpers.Uteis;
import br.com.sauderesidence.services.models.EmailModel;
import br.com.sauderesidence.services.models.PacienteModel;
import br.com.sauderesidence.services.models.SolicitacaoExameModel;

public class SolicitacaoExameController {
	
public boolean inserirSolicitacao(SolicitacaoExameModel sol) throws SQLException {
		
		
		String tipoAlteracao = "";
		String textoSolicitacao = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		switch (sol.getTipoalteracao()) {
		case 1:
			tipoAlteracao = "INCLUSÃO";
			break;
		case 2:
			tipoAlteracao = "ALTERAÇÃO";
			break;
		default:
			tipoAlteracao = "EXCLUSÃO";
			break;
		}
		
		PacienteController pacienteController = new PacienteController();
		PacienteModel pacienteModel = pacienteController.buscarPacientePorAdmissao(sol.getIdadmission());	
		
		
		textoSolicitacao = ""
				+ "Paciente: " + Integer.toString(sol.getIdadmission()) + " " + pacienteModel.getNome()
				+ "<br />Solicitante: " + sol.getNmsolicitante()
				+ "<br />Data da Solicitação: " + formato.format(new Date())
				+ "<br />Tipo da Solicitação: " + tipoAlteracao 
				+ "<br />Exame(s): " + sol.getExames()
				+ "<br />Observação: " + sol.getObservacao()
				+ "<br />Justificativa: " + sol.getJustificativa();
		
		StringBuilder html = new StringBuilder();
		html.append(""
				+ "<html>"
					+ "<head>"
						+ "<style type='text/css'>"
							+ ".titulo_gg{"
								+ "font-family: 'Myriad Pro', Arial, Helvetica, sans-serif; "
								+ "font-size: 25px; "
								+ "font-weight: normal; "
								+ "letter-spacing: 0.9px; "
								+ "white-space: nowrap; "
								+ "color: #0d4362; "
								+ "text-align: left; "
							+ "}"
							+ ".cor1{"
								+ "background: rgb(0, 153, 204);"
							+ "}"
							+ ".cor2{"
								+ "background: rgb(232, 250, 255);"
							+ "}"
							+ ".fonte1{"
								+ "font-family: Tahoma; "
								+ "color: #FFFFFF; "
								+ "font-weight: bold; "
								+ "vertical-align: middle; "
								+ "font-size: 10px; "								
							+ "}"
							+ ".fonte2{"
								+ "font-family: Tahoma; "
								+ "color: #FFFFFF; "
								+ "font-weight: bold; "
								+ "vertical-align: middle; "
								+ "font-size: 14px; "								
							+ "}"
							+ ".label1{"
								+ "font-family: Tahoma; "
								+ "color: rgb(51, 102, 153); "
								+ "font-weight: normal; "
								+ "vertical-align: middle; "
								+ "font-size: 14px; "								
							+ "}"
						+ "</style>"
					+ "</head>"
					+ "<body>"
						+ "<table style='width=100%'>"
							+ "<tr>"
								+ "<td colspan='2' style='width=100%' class='titulo_gg'>Solicitar Exame(s)</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td style='width=50%' class='cor1 fonte2'>Profissional Solicitante:</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(sol.getNmsolicitante()).append("</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td style='width=50%' class='cor1 fonte2'>Paciente:</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(Integer.toString(sol.getIdadmission())).append(" - ").append(pacienteModel.getNome()).append("</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td style='width=50%' class='cor1 fonte2'>Exame(s) solicitado(s):</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(sol.getExames()).append("</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td style='width=50%' class='cor1 fonte2'>Descrição:</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(textoSolicitacao).append("</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td colspan='2' style='width=100%'><i>Arquivo gerado em: ").append(formato.format(new Date())).append("</i></td>"
							+ "</tr>"
						+ "</table>"
					+ "</body>"
				+ "</html>"
				+ "");
		
		// Enviar emails para os setores cadastrados
		EmailController emailController = new EmailController();
		List<EmailModel> emails = emailController.listarEmailsPorCategoria("SOLICITAÇÃO DE EXAMES");
		for (int i = 0; i < emails.size(); i++) {
			Uteis.enviarEmail(emails.get(i).getEmail(), emails.get(i).getTipo(), html.toString());
		}
		
		
		return true;
	}

}
