package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class ProcedimentoEnfermagemModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idprocedimento;
	private int idprescricao;
	private String nmprocedimento;
	private String nmfrequencia;
	public int getIdprocedimento() {
		return idprocedimento;
	}
	public void setIdprocedimento(int idprocedimento) {
		this.idprocedimento = idprocedimento;
	}
	public int getIdprescricao() {
		return idprescricao;
	}
	public void setIdprescricao(int idprescricao) {
		this.idprescricao = idprescricao;
	}
	public String getNmprocedimento() {
		return nmprocedimento;
	}
	public void setNmprocedimento(String nmprocedimento) {
		this.nmprocedimento = nmprocedimento;
	}
	public String getNmfrequencia() {
		return nmfrequencia;
	}
	public void setNmfrequencia(String nmfrequencia) {
		this.nmfrequencia = nmfrequencia;
	}
	
	

}
