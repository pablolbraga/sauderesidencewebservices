package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class IntercorrenciaModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int grauurgencia;
	private int classificacao;
	private int tipointercorrencia;
	private String dataevento;
	private String datamaxima;
	private String horamaxima;
	private String nmprofissional;
	private String registroprofissional;
	private String descricao;
	private String acaotomada;
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getGrauurgencia() {
		return grauurgencia;
	}
	public void setGrauurgencia(int grauurgencia) {
		this.grauurgencia = grauurgencia;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public int getTipointercorrencia() {
		return tipointercorrencia;
	}
	public void setTipointercorrencia(int tipointercorrencia) {
		this.tipointercorrencia = tipointercorrencia;
	}
	public String getDataevento() {
		return dataevento;
	}
	public void setDataevento(String dataevento) {
		this.dataevento = dataevento;
	}
	public String getDatamaxima() {
		return datamaxima;
	}
	public void setDatamaxima(String datamaxima) {
		this.datamaxima = datamaxima;
	}
	public String getHoramaxima() {
		return horamaxima;
	}
	public void setHoramaxima(String horamaxima) {
		this.horamaxima = horamaxima;
	}
	public String getNmprofissional() {
		return nmprofissional;
	}
	public void setNmprofissional(String nmprofissional) {
		this.nmprofissional = nmprofissional;
	}
	public String getRegistroprofissional() {
		return registroprofissional;
	}
	public void setRegistroprofissional(String registroprofissional) {
		this.registroprofissional = registroprofissional;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAcaotomada() {
		return acaotomada;
	}
	public void setAcaotomada(String acaotomada) {
		this.acaotomada = acaotomada;
	}
	
	

}
