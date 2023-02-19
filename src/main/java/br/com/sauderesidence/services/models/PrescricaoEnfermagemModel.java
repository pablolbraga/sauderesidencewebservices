package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class PrescricaoEnfermagemModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int idpatient;
	private int idprescricao;
	private int idadmission;
	private String nmpaciente;
	private int idproduto;
	private String nmproduto;
	private String quantidade;
	private String unidmed;
	private String frequencia;
	private String nmprocedimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(int idpatient) {
		this.idpatient = idpatient;
	}
	public int getIdprescricao() {
		return idprescricao;
	}
	public void setIdprescricao(int idprescricao) {
		this.idprescricao = idprescricao;
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
	public int getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	public String getNmproduto() {
		return nmproduto;
	}
	public void setNmproduto(String nmproduto) {
		this.nmproduto = nmproduto;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidmed() {
		return unidmed;
	}
	public void setUnidmed(String unidmed) {
		this.unidmed = unidmed;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public String getNmprocedimento() {
		return nmprocedimento;
	}
	public void setNmprocedimento(String nmprocedimento) {
		this.nmprocedimento = nmprocedimento;
	}
	
	

}
