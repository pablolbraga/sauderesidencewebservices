package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class FichaTerapiaModel implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private int idespecialidade;
	private int idcapconsult;
	private int idprofagenda;
	private String datainicio;
	private String datafim;
	private String participacaocliente;
	private String execucaotecnicaproposta;
	private String observacao;
	private String assinaturapaciente;
	private String assinaturaprofissional;
	private String latitude;
	private String longitude;
	
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
	public int getIdespecialidade() {
		return idespecialidade;
	}
	public void setIdespecialidade(int idespecialidade) {
		this.idespecialidade = idespecialidade;
	}
	public int getIdcapconsult() {
		return idcapconsult;
	}
	public void setIdcapconsult(int idcapconsult) {
		this.idcapconsult = idcapconsult;
	}
	public int getIdprofagenda() {
		return idprofagenda;
	}
	public void setIdprofagenda(int idprofagenda) {
		this.idprofagenda = idprofagenda;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public String getDatafim() {
		return datafim;
	}
	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}
	public String getParticipacaocliente() {
		return participacaocliente;
	}
	public void setParticipacaocliente(String participacaocliente) {
		this.participacaocliente = participacaocliente;
	}
	public String getExecucaotecnicaproposta() {
		return execucaotecnicaproposta;
	}
	public void setExecucaotecnicaproposta(String execucaotecnicaproposta) {
		this.execucaotecnicaproposta = execucaotecnicaproposta;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getAssinaturapaciente() {
		return assinaturapaciente;
	}
	public void setAssinaturapaciente(String assinaturapaciente) {
		this.assinaturapaciente = assinaturapaciente;
	}
	public String getAssinaturaprofissional() {
		return assinaturaprofissional;
	}
	public void setAssinaturaprofissional(String assinaturaprofissional) {
		this.assinaturaprofissional = assinaturaprofissional;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
		
	

}
