package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class EquipamentoModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idequipamento;
	private String nome;
	private int quantidade;
	
	public int getIdequipamento() {
		return idequipamento;
	}
	public void setIdequipamento(int idequipamento) {
		this.idequipamento = idequipamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
