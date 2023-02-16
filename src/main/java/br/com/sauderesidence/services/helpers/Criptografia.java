package br.com.sauderesidence.services.helpers;

import java.util.Base64;

public class Criptografia {
	
	public static String criptografar(String texto) {
		return Base64.getEncoder().encodeToString(texto.getBytes());
	}

}
