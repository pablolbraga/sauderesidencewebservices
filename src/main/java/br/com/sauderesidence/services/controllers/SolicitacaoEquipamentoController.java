package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.helpers.Uteis;
import br.com.sauderesidence.services.models.EmailModel;
import br.com.sauderesidence.services.models.PacienteModel;
import br.com.sauderesidence.services.models.ProfissionalModel;
import br.com.sauderesidence.services.models.SolicitacaoEquipamentoModel;

public class SolicitacaoEquipamentoController {
	
	public boolean inserirSolicitacao(SolicitacaoEquipamentoModel sol) throws SQLException {
		
		
		String tipoAlteracao = "";
		String textoSolicitacao = "";
		String tipoEnvio = "";
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
					+ "<br />Tipo da Solicitação: " + tipoAlteracao + " (EQUIPAMENTOS)"
					+ "<br />Equipamento: " + sol.getEquipamento()
					+ "<br />Observação: " + sol.getObservacao()
					+ "<br />Justificativa: " + sol.getJustificativa();		
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO SR_SOLICITACAO_MATMED ("
					+ "IDUSU_SOLIC, IDPACIENTE, DATA_SOLIC, DATA_MAXIMA, OBSERVACAO_SOLIC, "
					+ "STATUS, PEDIDO_SEMANAL, ENFERMEIRA, JUSTIFICATIVA, STATUS_CASE, "
					+ "INCLUSAO_PRESCRICAO, TIPO_ALT_PRESC"
					+ ") VALUES ("
					+ "?, ?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, "
					+ "'S', 'NAO', ?, 'Aplicação de equipamentos', 'S', "
					+ "'NAO', 1"
					+ ")");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, sol.getIdusuario());
			pst.setInt(2, sol.getIdpaciente());
			pst.setString(3, formato.format(new Date()));
			pst.setString(4, formato.format(new Date()));
			pst.setString(5, textoSolicitacao);
			pst.setInt(6, sol.getIdperson());
			pst.execute();
		
		
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
								+ "<td colspan='2' style='width=100%' class='titulo_gg'>Solicitar Equipamento</td>"
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
								+ "<td style='width=50%' class='cor1 fonte2'>Solicitação:</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(textoSolicitacao).append("</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td colspan='2' style='width=100%'><i>Arquivo gerado em: ").append(formato.format(new Date())).append("</i></td>"
							+ "</tr>"
						+ "</table>"
					+ "</body>"
				+ "</html>"
				+ "");
		
		//Enviar emails para os setores cadastrados
		
		EmailController emailController = new EmailController();
		List<EmailModel> emails = emailController.listarEmailsPorCategoria("SOLICITAÇÃO DE EQUIPAMENTO");
		for (int i = 0; i < emails.size(); i++) {
			Uteis.enviarEmail(emails.get(i).getEmail(), emails.get(i).getTipo(), html.toString());
		}
		
		
		return true;
	}
}
