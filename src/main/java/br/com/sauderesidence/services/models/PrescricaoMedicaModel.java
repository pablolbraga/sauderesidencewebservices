package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class PrescricaoMedicaModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int idproduto;
	private String nmproduto;
	private String quantidade;
	private String unidmed;
	private String frequencia;
	private String instrucao;
	private String horario;
	private String via;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getInstrucao() {
		return instrucao;
	}
	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	
	

}
