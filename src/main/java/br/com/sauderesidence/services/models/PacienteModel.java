package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class PacienteModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private String nome;
	private String nmconvenio;
	private String nmservico;
	private int idpatient;
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNmconvenio() {
		return nmconvenio;
	}
	public void setNmconvenio(String nmconvenio) {
		this.nmconvenio = nmconvenio;
	}
	public String getNmservico() {
		return nmservico;
	}
	public void setNmservico(String nmservico) {
		this.nmservico = nmservico;
	}
	public int getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(int idpatient) {
		this.idpatient = idpatient;
	}
	
	

}
