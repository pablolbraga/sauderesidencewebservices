package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class ExameModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int idimagem;
	private int idexame;
	private String nmexame;
	private String datareq;
	private String dataprogres;
	private String datarealres;
	private String nmsolicitante;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdimagem() {
		return idimagem;
	}
	public void setIdimagem(int idimagem) {
		this.idimagem = idimagem;
	}
	public int getIdexame() {
		return idexame;
	}
	public void setIdexame(int idexame) {
		this.idexame = idexame;
	}
	public String getNmexame() {
		return nmexame;
	}
	public void setNmexame(String nmexame) {
		this.nmexame = nmexame;
	}
	public String getDatareq() {
		return datareq;
	}
	public void setDatareq(String datareq) {
		this.datareq = datareq;
	}
	public String getDataprogres() {
		return dataprogres;
	}
	public void setDataprogres(String dataprogres) {
		this.dataprogres = dataprogres;
	}
	public String getDatarealres() {
		return datarealres;
	}
	public void setDatarealres(String datarealres) {
		this.datarealres = datarealres;
	}
	public String getNmsolicitante() {
		return nmsolicitante;
	}
	public void setNmsolicitante(String nmsolicitante) {
		this.nmsolicitante = nmsolicitante;
	}
	
	

}
