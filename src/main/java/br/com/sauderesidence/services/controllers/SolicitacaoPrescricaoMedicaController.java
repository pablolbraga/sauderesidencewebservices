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
import br.com.sauderesidence.services.models.SolicitacaoPrescricaoMedicaModel;

public class SolicitacaoPrescricaoMedicaController {
	
	public boolean inserirSolicitacao(SolicitacaoPrescricaoMedicaModel sol) throws SQLException {
		
		
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
		
		switch (sol.getTipoenvio()) {
		case 1:
			tipoEnvio = "IMEDIATO";
			break;
		case 2:
			tipoEnvio = "24 HORAS";
			break;
		case 3:
			tipoEnvio = "SEMANAL";
			break;
		default:
			tipoAlteracao = "NÃO INFORMADO";
			break;
		}
		
		PacienteController pacienteController = new PacienteController();
		PacienteModel pacienteModel = pacienteController.buscarPacientePorAdmissao(sol.getIdadmission());
		
		ProfissionalController profissionalController = new ProfissionalController();
		ProfissionalModel profissionalModel = profissionalController.buscarPorId(sol.getIdusuariosolicitante());
		
		if (sol.getTipoalteracao() < 3) {
			textoSolicitacao = ""
					+ "Paciente: " + Integer.toString(sol.getIdadmission()) + " " + pacienteModel.getNome()
					+ "<br />Solicitante: " + profissionalModel.getNmprofessional()
					+ "<br />Data da Solicitação: " + sol.getDatasolicitacao()
					+ "<br />Tipo da Solicitação: " + tipoAlteracao 
					+ "<br />Medicamento: " + sol.getMedicamento()
					+ "<br />Dose: " + sol.getDose()
					+ "<br />Posologia: " + sol.getPosologia()
					+ "<br />Via: " + sol.getVia()
					+ "<br />Duração: " + sol.getDuracao()
					+ "<br />Tipo de Envio: " + tipoEnvio
					+ "<br />Observação: " + sol.getObservacaosolicitante()
					+ "<br />Justificativa: " + sol.getJustificativa();
		} else {
			textoSolicitacao = ""
					+ "Paciente: " + Integer.toString(sol.getIdadmission()) + " " + pacienteModel.getNome()
					+ "<br />Solicitante: " + profissionalModel.getNmprofessional()
					+ "<br />Data da Solicitação: " + sol.getDatasolicitacao()
					+ "<br />Tipo da Solicitação: " + tipoAlteracao 
					+ "<br />Medicamento: " + sol.getMedicamento()
					+ "<br />Justificativa: " + sol.getJustificativa();
		}
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO SR_SOLICITACAO_PRESC ("
				+ "IDUSU_SOLIC, DATA_SOLIC, IDPACIENTE, OBSERVACAO_SOLIC, MEDICAMENTO, "
				+ "DOSE, POSOLOGIA, STATUS_ALT_PRESC, TIPO_ALT_PRESC, DURACAO, "
				+ "VIA, IDADMISSION"
				+ ") VALUES ("
				+ "?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), ?, ?, ?, "
				+ "?, ?, ?, ?, ?, "
				+ "?, ?"
				+ ")");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, sol.getIdusuariosolicitante());
		pst.setString(2, sol.getDatasolicitacao());
		pst.setInt(3, sol.getIdpaciente());
		pst.setString(4, textoSolicitacao);
		pst.setString(5, sol.getMedicamento());
		pst.setString(6, sol.getDose());
		pst.setString(7, sol.getPosologia());
		pst.setString(8, "S");
		pst.setInt(9, sol.getTipoalteracao());
		pst.setString(10, sol.getDuracao());
		pst.setString(11, sol.getVia());
		pst.setInt(12, sol.getIdadmission());
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
								+ "<td colspan='2' style='width=100%' class='titulo_gg'>Solicitar Alteração de Prescrição</td>"
							+ "</tr>"
							+ "<tr>"
								+ "<td style='width=50%' class='cor1 fonte2'>Profissional Solicitante:</td>"
								+ "<td style='width=50%' class='cor2 label1'>").append(profissionalModel.getNmprofessional()).append("</td>"
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
		
		// Enviar emails para os setores cadastrados
		EmailController emailController = new EmailController();
		List<EmailModel> emails = emailController.listarEmailsPorCategoria("ALTERAÇÃO DE PRESCRIÇÃO");
		for (int i = 0; i < emails.size(); i++) {
			Uteis.enviarEmail(emails.get(i).getEmail(), emails.get(i).getTipo(), html.toString());
		}
		
		
		return true;
	}
}
