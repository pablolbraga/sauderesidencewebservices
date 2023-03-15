package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class FichaTecnicoBaseModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private int idcapconsult;
	private int idprofagenda;
	private String datainicio;
	private String datafim;
	private String assinaturapaciente;
	private String assinaturaprofissional;
	private String latitude;
	private String longitude;
	private int tipochamada;
	private int administracaomed;
	private int administracaomediv;
	private int administracaomedim;
	private int administracaomedsc;
	private int clister;
	private int curativo;
	private int cateterismovesicalalivio;
	private int cateterismovericalurina;
	private int cuidadogerais;
	private int ecg;
	private int puncao;
	private int retiradapontos;
	private String outrosprocedimentos;
	private String abd;
	private String algodao;
	private String agulha;
	private String alcool;
	private String atadura;
	private String cateter;
	private String equipo;
	private String extensor1via;
	private String extensor2via;
	private String gazeacolchoada;
	private String gazeembebida;
	private String gazeesteril;
	private String heparina;
	private String ivfix;
	private String jelco;
	private String bisturi;
	private String luvaesteril;
	private String luvaprocedimento;
	private String mascara;
	private String micropore2510;
	private String micropore5010;
	private String scalp;
	private String seringa;
	private String sorofisiologico;
	private String outrosmateriais;
	private String medicamentos;
	private String evolucao;
	public int getIdadmission() {
		return idadmission;
	}
	public void setIdadmission(int idadmission) {
		this.idadmission = idadmission;
	}
	public int getIdprofessional() {
		return idprofessional;
	}
	public void setIdprofessional(int idprofessional) {
		this.idprofessional = idprofessional;
	}
	public int getIdcapconsult() {
		return idcapconsult;
	}
	public void setIdcapconsult(int idcapconsult) {
		this.idcapconsult = idcapconsult;
	}
	public int getIdprofagenda() {
		return idprofagenda;
	}
	public void setIdprofagenda(int idprofagenda) {
		this.idprofagenda = idprofagenda;
	}
	public String getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	public String getDatafim() {
		return datafim;
	}
	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}
	public String getAssinaturapaciente() {
		return assinaturapaciente;
	}
	public void setAssinaturapaciente(String assinaturapaciente) {
		this.assinaturapaciente = assinaturapaciente;
	}
	public String getAssinaturaprofissional() {
		return assinaturaprofissional;
	}
	public void setAssinaturaprofissional(String assinaturaprofissional) {
		this.assinaturaprofissional = assinaturaprofissional;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getTipochamada() {
		return tipochamada;
	}
	public void setTipochamada(int tipochamada) {
		this.tipochamada = tipochamada;
	}
	public int getAdministracaomed() {
		return administracaomed;
	}
	public void setAdministracaomed(int administracaomed) {
		this.administracaomed = administracaomed;
	}
	public int getAdministracaomediv() {
		return administracaomediv;
	}
	public void setAdministracaomediv(int administracaomediv) {
		this.administracaomediv = administracaomediv;
	}
	public int getAdministracaomedim() {
		return administracaomedim;
	}
	public void setAdministracaomedim(int administracaomedim) {
		this.administracaomedim = administracaomedim;
	}
	public int getAdministracaomedsc() {
		return administracaomedsc;
	}
	public void setAdministracaomedsc(int administracaomedsc) {
		this.administracaomedsc = administracaomedsc;
	}
	public int getClister() {
		return clister;
	}
	public void setClister(int clister) {
		this.clister = clister;
	}
	public int getCurativo() {
		return curativo;
	}
	public void setCurativo(int curativo) {
		this.curativo = curativo;
	}
	public int getCateterismovesicalalivio() {
		return cateterismovesicalalivio;
	}
	public void setCateterismovesicalalivio(int cateterismovesicalalivio) {
		this.cateterismovesicalalivio = cateterismovesicalalivio;
	}
	public int getCateterismovericalurina() {
		return cateterismovericalurina;
	}
	public void setCateterismovericalurina(int cateterismovericalurina) {
		this.cateterismovericalurina = cateterismovericalurina;
	}
	public int getCuidadogerais() {
		return cuidadogerais;
	}
	public void setCuidadogerais(int cuidadogerais) {
		this.cuidadogerais = cuidadogerais;
	}
	public int getEcg() {
		return ecg;
	}
	public void setEcg(int ecg) {
		this.ecg = ecg;
	}
	public int getPuncao() {
		return puncao;
	}
	public void setPuncao(int puncao) {
		this.puncao = puncao;
	}
	public int getRetiradapontos() {
		return retiradapontos;
	}
	public void setRetiradapontos(int retiradapontos) {
		this.retiradapontos = retiradapontos;
	}
	public String getOutrosprocedimentos() {
		return outrosprocedimentos;
	}
	public void setOutrosprocedimentos(String outrosprocedimentos) {
		this.outrosprocedimentos = outrosprocedimentos;
	}
	public String getAbd() {
		return abd;
	}
	public void setAbd(String abd) {
		this.abd = abd;
	}
	public String getAlgodao() {
		return algodao;
	}
	public void setAlgodao(String algodao) {
		this.algodao = algodao;
	}
	public String getAgulha() {
		return agulha;
	}
	public void setAgulha(String agulha) {
		this.agulha = agulha;
	}
	public String getAlcool() {
		return alcool;
	}
	public void setAlcool(String alcool) {
		this.alcool = alcool;
	}
	public String getAtadura() {
		return atadura;
	}
	public void setAtadura(String atadura) {
		this.atadura = atadura;
	}
	public String getCateter() {
		return cateter;
	}
	public void setCateter(String cateter) {
		this.cateter = cateter;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getExtensor1via() {
		return extensor1via;
	}
	public void setExtensor1via(String extensor1via) {
		this.extensor1via = extensor1via;
	}
	public String getExtensor2via() {
		return extensor2via;
	}
	public void setExtensor2via(String extensor2via) {
		this.extensor2via = extensor2via;
	}
	public String getGazeacolchoada() {
		return gazeacolchoada;
	}
	public void setGazeacolchoada(String gazeacolchoada) {
		this.gazeacolchoada = gazeacolchoada;
	}
	public String getGazeembebida() {
		return gazeembebida;
	}
	public void setGazeembebida(String gazeembebida) {
		this.gazeembebida = gazeembebida;
	}
	public String getGazeesteril() {
		return gazeesteril;
	}
	public void setGazeesteril(String gazeesteril) {
		this.gazeesteril = gazeesteril;
	}
	public String getHeparina() {
		return heparina;
	}
	public void setHeparina(String heparina) {
		this.heparina = heparina;
	}
	public String getIvfix() {
		return ivfix;
	}
	public void setIvfix(String ivfix) {
		this.ivfix = ivfix;
	}
	public String getJelco() {
		return jelco;
	}
	public void setJelco(String jelco) {
		this.jelco = jelco;
	}
	public String getBisturi() {
		return bisturi;
	}
	public void setBisturi(String bisturi) {
		this.bisturi = bisturi;
	}
	public String getLuvaesteril() {
		return luvaesteril;
	}
	public void setLuvaesteril(String luvaesteril) {
		this.luvaesteril = luvaesteril;
	}
	public String getLuvaprocedimento() {
		return luvaprocedimento;
	}
	public void setLuvaprocedimento(String luvaprocedimento) {
		this.luvaprocedimento = luvaprocedimento;
	}
	public String getMascara() {
		return mascara;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	public String getMicropore2510() {
		return micropore2510;
	}
	public void setMicropore2510(String micropore2510) {
		this.micropore2510 = micropore2510;
	}
	public String getMicropore5010() {
		return micropore5010;
	}
	public void setMicropore5010(String micropore5010) {
		this.micropore5010 = micropore5010;
	}
	public String getScalp() {
		return scalp;
	}
	public void setScalp(String scalp) {
		this.scalp = scalp;
	}
	public String getSeringa() {
		return seringa;
	}
	public void setSeringa(String seringa) {
		this.seringa = seringa;
	}
	public String getSorofisiologico() {
		return sorofisiologico;
	}
	public void setSorofisiologico(String sorofisiologico) {
		this.sorofisiologico = sorofisiologico;
	}
	public String getOutrosmateriais() {
		return outrosmateriais;
	}
	public void setOutrosmateriais(String outrosmateriais) {
		this.outrosmateriais = outrosmateriais;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getEvolucao() {
		return evolucao;
	}
	public void setEvolucao(String evolucao) {
		this.evolucao = evolucao;
	}
	
	
	
	
}
