package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class AgendaModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idcapconsult;
	private int idadmission;
	private int idpatient;
	private int idperson;
	private String nmpaciente;
	private int idconvenio;
	private String nmconvenio;
	private int idade;
	private int idprofagenda;
	private int idevolucao;
	
	public int getIdcapconsult() {
		return idcapconsult;
	}
	public void setIdcapconsult(int idcapconsult) {
		this.idcapconsult = idcapconsult;
	}
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(int idpatient) {
		this.idpatient = idpatient;
	}
	public int getIdperson() {
		return idperson;
	}
	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}
	public String getNmpaciente() {
		return nmpaciente;
	}
	public void setNmpaciente(String nmpaciente) {
		this.nmpaciente = nmpaciente;
	}
	public int getIdconvenio() {
		return idconvenio;
	}
	public void setIdconvenio(int idconvenio) {
		this.idconvenio = idconvenio;
	}
	public String getNmconvenio() {
		return nmconvenio;
	}
	public void setNmconvenio(String nmconvenio) {
		this.nmconvenio = nmconvenio;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdprofagenda() {
		return idprofagenda;
	}
	public void setIdprofagenda(int idprofagenda) {
		this.idprofagenda = idprofagenda;
	}
	public int getIdevolucao() {
		return idevolucao;
	}
	public void setIdevolucao(int idevolucao) {
		this.idevolucao = idevolucao;
	}

}
