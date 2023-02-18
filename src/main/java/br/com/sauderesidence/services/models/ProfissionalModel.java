package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class ProfissionalModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public int idprofessional;
	public int idespecialidade;
	public String nmespecialidade;
	public String nmprofessional;
	public String registro;
	public int getIdprofessional() {
		return idprofessional;
	}
	public void setIdprofessional(int idprofessional) {
		this.idprofessional = idprofessional;
	}
	public int getIdespecialidade() {
		return idespecialidade;
	}
	public void setIdespecialidade(int idespecialidade) {
		this.idespecialidade = idespecialidade;
	}
	public String getNmespecialidade() {
		return nmespecialidade;
	}
	public void setNmespecialidade(String nmespecialidade) {
		this.nmespecialidade = nmespecialidade;
	}
	public String getNmprofessional() {
		return nmprofessional;
	}
	public void setNmprofessional(String nmprofessional) {
		this.nmprofessional = nmprofessional;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	

}
