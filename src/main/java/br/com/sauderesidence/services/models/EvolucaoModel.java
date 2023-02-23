package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class EvolucaoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private String dataini;
	private String datafim;
	private int idtemplate;
	
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
	public String getDataini() {
		return dataini;
	}
	public void setDataini(String dataini) {
		this.dataini = dataini;
	}
	public String getDatafim() {
		return datafim;
	}
	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}
	public int getIdtemplate() {
		return idtemplate;
	}
	public void setIdtemplate(int idtemplate) {
		this.idtemplate = idtemplate;
	}
	
	
	
}
