package br.com.sauderesidence.services.helpers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import br.com.sauderesidence.services.conexoes.Conexao;

public class Uteis {
	
	public static String retornarDataAtual() {
		
		String data = "";
		String sql = "SELECT TO_CHAR(SYSDATE, 'DD/MM/YYYY') AS DATA FROM DUAL";
		try {
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				data = rs.getString("DATA");
			}
			return data;
		} catch (SQLException e) {
			return data;
		}
	}
	
	public static void enviarEmail(String destinatario, String assunto, String mensagem) {
		
		final String user = "email@sauderesidence.com.br";
		final String password = "17509036";
		
		HtmlEmail email = new HtmlEmail();
		email.setSSLOnConnect(true);
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(user, password));
		try {
			email.setFrom(user, "Saúde Residence");
			email.setDebug(true);
			email.setSubject(assunto);
			email.setHtmlMsg(mensagem);
			email.addTo(destinatario);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}

}
