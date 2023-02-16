package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class UsuarioModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idusuario;
	private String nome;
	private String login;
	private String email;
	private int idperson;
	private String primeiroacesso;
	private int idespecialidade;
	private String apelido;
	private String nmespecialidade;
	private String registro;
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdperson() {
		return idperson;
	}
	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}
	public String getPrimeiroacesso() {
		return primeiroacesso;
	}
	public void setPrimeiroacesso(String primeiroacesso) {
		this.primeiroacesso = primeiroacesso;
	}
	public int getIdespecialidade() {
		return idespecialidade;
	}
	public void setIdespecialidade(int idespecialidade) {
		this.idespecialidade = idespecialidade;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getNmespecialidade() {
		return nmespecialidade;
	}
	public void setNmespecialidade(String nmespecialidade) {
		this.nmespecialidade = nmespecialidade;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}

}
