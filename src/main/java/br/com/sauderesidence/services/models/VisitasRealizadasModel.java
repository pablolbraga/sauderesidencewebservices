package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class VisitasRealizadasModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idevolution;
	private int idadmission;
	private String nmpaciente;
	private int idprofessional;
	private String nmprofessional;
	private String dataini;
	private String datafim;
	private int idprofagenda;
	private int idespecialidade;
	private String nmespecialidade;
	private String imagem;
	
	public int getIdevolution() {
		return idevolution;
	}
	public void setIdevolution(int idevolution) {
		this.idevolution = idevolution;
	}
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public String getNmpaciente() {
		return nmpaciente;
	}
	public void setNmpaciente(String nmpaciente) {
		this.nmpaciente = nmpaciente;
	}
	public int getIdprofessional() {
		return idprofessional;
	}
	public void setIdprofessional(int idprofessional) {
		this.idprofessional = idprofessional;
	}
	public String getNmprofessional() {
		return nmprofessional;
	}
	public void setNmprofessional(String nmprofessional) {
		this.nmprofessional = nmprofessional;
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
	public int getIdprofagenda() {
		return idprofagenda;
	}
	public void setIdprofagenda(int idprofagenda) {
		this.idprofagenda = idprofagenda;
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
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	

}
