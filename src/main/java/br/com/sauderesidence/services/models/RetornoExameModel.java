package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class RetornoExameModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private String dataretorno;
	private String acompanhante;
	private String observacao;
	
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getIdprofessional() {
		return idprofessional;
	}
	public void setIdprofessional(int idprofessional) {
		this.idprofessional = idprofessional;
	}
	public String getDataretorno() {
		return dataretorno;
	}
	public void setDataretorno(String dataretorno) {
		this.dataretorno = dataretorno;
	}
	public String getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	

}
