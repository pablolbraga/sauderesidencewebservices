package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class SolicitacaoPrescricaoMedicaModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idusuariosolicitante;
	private String datasolicitacao;
	private int idpaciente;
	private String observacaosolicitante;
	private String justificativa;
	private String medicamento;
	private String dose;
	private String posologia;
	private String status;
	private String duracao;
	private String via;
	private int idadmission;
	private int tipoenvio;
	private int tipoalteracao;
	
	
	public int getIdusuariosolicitante() {
		return idusuariosolicitante;
	}
	public void setIdusuariosolicitante(int idusuariosolicitante) {
		this.idusuariosolicitante = idusuariosolicitante;
	}
	public String getDatasolicitacao() {
		return datasolicitacao;
	}
	public void setDatasolicitacao(String datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}
	public int getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}
	public String getObservacaosolicitante() {
		return observacaosolicitante;
	}
	public void setObservacaosolicitante(String observacaosolicitante) {
		this.observacaosolicitante = observacaosolicitante;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getPosologia() {
		return posologia;
	}
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getTipoenvio() {
		return tipoenvio;
	}
	public void setTipoenvio(int tipoenvio) {
		this.tipoenvio = tipoenvio;
	}
	public int getTipoalteracao() {
		return tipoalteracao;
	}
	public void setTipoalteracao(int tipoalteracao) {
		this.tipoalteracao = tipoalteracao;
	}
	
	
	

}
