package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class SolicitacaoProcedimentoEnfermagemModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nmsolicitante;
	private int idadmission;
	private String nmpaciente;
	private int tipoalteracao;
	private String procedimento;
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
	public String getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
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
