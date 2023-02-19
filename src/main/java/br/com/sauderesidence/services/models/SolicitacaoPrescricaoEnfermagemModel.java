package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class SolicitacaoPrescricaoEnfermagemModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int tipo;
	private int idprofissionalsolicitante;
	private int idpaciente;
	private String datasolicitacao;
	private String nmmaterial;
	private String quantidade;
	private String frequencia;
	private String posologia;
	private String via;
	private String duracao;
	private String observacao;
	private String justificativa;
	private String status;
	
	private int idadmission;
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getIdprofissionalsolicitante() {
		return idprofissionalsolicitante;
	}
	public void setIdprofissionalsolicitante(int idprofissionalsolicitante) {
		this.idprofissionalsolicitante = idprofissionalsolicitante;
	}
	public int getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(int idpaciente) {
		this.idpaciente = idpaciente;
	}
	public String getDatasolicitacao() {
		return datasolicitacao;
	}
	public void setDatasolicitacao(String datasolicitacao) {
		this.datasolicitacao = datasolicitacao;
	}
	public String getNmmaterial() {
		return nmmaterial;
	}
	public void setNmmaterial(String nmmaterial) {
		this.nmmaterial = nmmaterial;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public String getPosologia() {
		return posologia;
	}
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}	

}
