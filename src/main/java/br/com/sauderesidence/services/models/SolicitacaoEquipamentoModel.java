package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class SolicitacaoEquipamentoModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nmsolicitante;
	private int idadmission;
	private int idusuario;
	private int idpaciente;
	private int idperson;
	private String nmpaciente;
	private int tipoalteracao;
	private String equipamento;
	private String observacao;
	private String justificativa;
	
	public String getNmsolicitante() {
		return nmsolicitante;
	}
	public void setNmsolicitante(String nmsolicitante) {
		this.nmsolicitante = nmsolicitante;
	}
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
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
	public int getTipoalteracao() {
		return tipoalteracao;
	}
	public void setTipoalteracao(int tipoalteracao) {
		this.tipoalteracao = tipoalteracao;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
	

}
