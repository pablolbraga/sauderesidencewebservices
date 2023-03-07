package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class FichaNutricaoModel implements Serializable {
	
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
	private String acompanhante;
	private String grupohas;
	private String grupodiabetes;
	private String grupodislipidemia;
	private String grupoimobilidade;
	private String grupoobesidade;
	private String grupodesnutricao;
	private String grupooutros;
	private int nutricao;
	private int nutricaotipoenteral;
	private String nutricaotipoenteraloutros;
	private int dietaenteral;
	private String dietaenteralentupimento;
	private int dietaindustipo;
	private String dietaindustmanipqtde;
	private String dietaindustmanipdesc;
	private String dietaindustprontaqtde;
	private String dietaindustprontadesc;
	private String dietaindustprontafab;
	private int dietaindustfornecedor;
	private int avalsubjingesta;
	private int avalsubjpesotipo;
	private String avalsubjpesoqtde;
	private String avalsubjpesotempo;
	private String avalsubjsintomadiarreia;
	private String avalsubjsintomahiporexia;
	private String avalsubjsintomaconstipacao;
	private String avalsubjsintomaoutros;
	private String avalsubjritmointestinal;
	private String avalantroaj;
	private String avalantropeso;
	private String avalantrocircabd;
	private String avalantroimc;
	private String avalantrocp;
	private String avalantroidade;
	private String avalantrodct;
	private String avalantrocb;
	private String avalantrocmb;
	private String avalantroaltura;
	private int diagnutriabaixo65;
	private int diagnutriacima65;
	private String diagnutridesc;
	private String manterconduta;
	private String conduta;
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
	public String getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	public String getGrupohas() {
		return grupohas;
	}
	public void setGrupohas(String grupohas) {
		this.grupohas = grupohas;
	}
	public String getGrupodiabetes() {
		return grupodiabetes;
	}
	public void setGrupodiabetes(String grupodiabetes) {
		this.grupodiabetes = grupodiabetes;
	}
	public String getGrupodislipidemia() {
		return grupodislipidemia;
	}
	public void setGrupodislipidemia(String grupodislipidemia) {
		this.grupodislipidemia = grupodislipidemia;
	}
	public String getGrupoimobilidade() {
		return grupoimobilidade;
	}
	public void setGrupoimobilidade(String grupoimobilidade) {
		this.grupoimobilidade = grupoimobilidade;
	}
	public String getGrupoobesidade() {
		return grupoobesidade;
	}
	public void setGrupoobesidade(String grupoobesidade) {
		this.grupoobesidade = grupoobesidade;
	}
	public String getGrupodesnutricao() {
		return grupodesnutricao;
	}
	public void setGrupodesnutricao(String grupodesnutricao) {
		this.grupodesnutricao = grupodesnutricao;
	}
	public String getGrupooutros() {
		return grupooutros;
	}
	public void setGrupooutros(String grupooutros) {
		this.grupooutros = grupooutros;
	}
	public int getNutricao() {
		return nutricao;
	}
	public void setNutricao(int nutricao) {
		this.nutricao = nutricao;
	}
	public int getNutricaotipoenteral() {
		return nutricaotipoenteral;
	}
	public void setNutricaotipoenteral(int nutricaotipoenteral) {
		this.nutricaotipoenteral = nutricaotipoenteral;
	}
	public String getNutricaotipoenteraloutros() {
		return nutricaotipoenteraloutros;
	}
	public void setNutricaotipoenteraloutros(String nutricaotipoenteraloutros) {
		this.nutricaotipoenteraloutros = nutricaotipoenteraloutros;
	}
	public int getDietaenteral() {
		return dietaenteral;
	}
	public void setDietaenteral(int dietaenteral) {
		this.dietaenteral = dietaenteral;
	}
	public String getDietaenteralentupimento() {
		return dietaenteralentupimento;
	}
	public void setDietaenteralentupimento(String dietaenteralentupimento) {
		this.dietaenteralentupimento = dietaenteralentupimento;
	}
	public int getDietaindustipo() {
		return dietaindustipo;
	}
	public void setDietaindustipo(int dietaindustipo) {
		this.dietaindustipo = dietaindustipo;
	}
	public String getDietaindustmanipqtde() {
		return dietaindustmanipqtde;
	}
	public void setDietaindustmanipqtde(String dietaindustmanipqtde) {
		this.dietaindustmanipqtde = dietaindustmanipqtde;
	}
	public String getDietaindustmanipdesc() {
		return dietaindustmanipdesc;
	}
	public void setDietaindustmanipdesc(String dietaindustmanipdesc) {
		this.dietaindustmanipdesc = dietaindustmanipdesc;
	}
	public String getDietaindustprontaqtde() {
		return dietaindustprontaqtde;
	}
	public void setDietaindustprontaqtde(String dietaindustprontaqtde) {
		this.dietaindustprontaqtde = dietaindustprontaqtde;
	}
	public String getDietaindustprontadesc() {
		return dietaindustprontadesc;
	}
	public void setDietaindustprontadesc(String dietaindustprontadesc) {
		this.dietaindustprontadesc = dietaindustprontadesc;
	}
	public String getDietaindustprontafab() {
		return dietaindustprontafab;
	}
	public void setDietaindustprontafab(String dietaindustprontafab) {
		this.dietaindustprontafab = dietaindustprontafab;
	}
	public int getDietaindustfornecedor() {
		return dietaindustfornecedor;
	}
	public void setDietaindustfornecedor(int dietaindustfornecedor) {
		this.dietaindustfornecedor = dietaindustfornecedor;
	}
	public int getAvalsubjingesta() {
		return avalsubjingesta;
	}
	public void setAvalsubjingesta(int avalsubjingesta) {
		this.avalsubjingesta = avalsubjingesta;
	}
	public int getAvalsubjpesotipo() {
		return avalsubjpesotipo;
	}
	public void setAvalsubjpesotipo(int avalsubjpesotipo) {
		this.avalsubjpesotipo = avalsubjpesotipo;
	}
	public String getAvalsubjpesoqtde() {
		return avalsubjpesoqtde;
	}
	public void setAvalsubjpesoqtde(String avalsubjpesoqtde) {
		this.avalsubjpesoqtde = avalsubjpesoqtde;
	}
	public String getAvalsubjpesotempo() {
		return avalsubjpesotempo;
	}
	public void setAvalsubjpesotempo(String avalsubjpesotempo) {
		this.avalsubjpesotempo = avalsubjpesotempo;
	}
	public String getAvalsubjsintomadiarreia() {
		return avalsubjsintomadiarreia;
	}
	public void setAvalsubjsintomadiarreia(String avalsubjsintomadiarreia) {
		this.avalsubjsintomadiarreia = avalsubjsintomadiarreia;
	}
	public String getAvalsubjsintomahiporexia() {
		return avalsubjsintomahiporexia;
	}
	public void setAvalsubjsintomahiporexia(String avalsubjsintomahiporexia) {
		this.avalsubjsintomahiporexia = avalsubjsintomahiporexia;
	}
	public String getAvalsubjsintomaconstipacao() {
		return avalsubjsintomaconstipacao;
	}
	public void setAvalsubjsintomaconstipacao(String avalsubjsintomaconstipacao) {
		this.avalsubjsintomaconstipacao = avalsubjsintomaconstipacao;
	}
	public String getAvalsubjsintomaoutros() {
		return avalsubjsintomaoutros;
	}
	public void setAvalsubjsintomaoutros(String avalsubjsintomaoutros) {
		this.avalsubjsintomaoutros = avalsubjsintomaoutros;
	}
	public String getAvalsubjritmointestinal() {
		return avalsubjritmointestinal;
	}
	public void setAvalsubjritmointestinal(String avalsubjritmointestinal) {
		this.avalsubjritmointestinal = avalsubjritmointestinal;
	}
	public String getAvalantroaj() {
		return avalantroaj;
	}
	public void setAvalantroaj(String avalantroaj) {
		this.avalantroaj = avalantroaj;
	}
	public String getAvalantropeso() {
		return avalantropeso;
	}
	public void setAvalantropeso(String avalantropeso) {
		this.avalantropeso = avalantropeso;
	}
	public String getAvalantrocircabd() {
		return avalantrocircabd;
	}
	public void setAvalantrocircabd(String avalantrocircabd) {
		this.avalantrocircabd = avalantrocircabd;
	}
	public String getAvalantroimc() {
		return avalantroimc;
	}
	public void setAvalantroimc(String avalantroimc) {
		this.avalantroimc = avalantroimc;
	}
	public String getAvalantrocp() {
		return avalantrocp;
	}
	public void setAvalantrocp(String avalantrocp) {
		this.avalantrocp = avalantrocp;
	}
	public String getAvalantroidade() {
		return avalantroidade;
	}
	public void setAvalantroidade(String avalantroidade) {
		this.avalantroidade = avalantroidade;
	}
	public String getAvalantrodct() {
		return avalantrodct;
	}
	public void setAvalantrodct(String avalantrodct) {
		this.avalantrodct = avalantrodct;
	}
	public String getAvalantrocb() {
		return avalantrocb;
	}
	public void setAvalantrocb(String avalantrocb) {
		this.avalantrocb = avalantrocb;
	}
	public String getAvalantrocmb() {
		return avalantrocmb;
	}
	public void setAvalantrocmb(String avalantrocmb) {
		this.avalantrocmb = avalantrocmb;
	}
	public String getAvalantroaltura() {
		return avalantroaltura;
	}
	public void setAvalantroaltura(String avalantroaltura) {
		this.avalantroaltura = avalantroaltura;
	}
	public int getDiagnutriabaixo65() {
		return diagnutriabaixo65;
	}
	public void setDiagnutriabaixo65(int diagnutriabaixo65) {
		this.diagnutriabaixo65 = diagnutriabaixo65;
	}
	public int getDiagnutriacima65() {
		return diagnutriacima65;
	}
	public void setDiagnutriacima65(int diagnutriacima65) {
		this.diagnutriacima65 = diagnutriacima65;
	}
	public String getDiagnutridesc() {
		return diagnutridesc;
	}
	public void setDiagnutridesc(String diagnutridesc) {
		this.diagnutridesc = diagnutridesc;
	}
	public String getManterconduta() {
		return manterconduta;
	}
	public void setManterconduta(String manterconduta) {
		this.manterconduta = manterconduta;
	}
	public String getConduta() {
		return conduta;
	}
	public void setConduta(String conduta) {
		this.conduta = conduta;
	}
	
	

}
