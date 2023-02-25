package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class FichaMedicaModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private int idcapconsult;
	private int idprofagenda;
	private String datainicio;
	private String datafim;
	private String hd;
	private String acompanhante;
	private String situacaoclinica;
	private String justificativaatendimentodomiciliar;
	private int fisioterapiamotora;
	private int fisioterapiarespiratoria;
	private int nutricionista;
	private int fonoterapia;
	private int enfermagem;
	private int terapiaocupacional;
	private int psicologo;
	private String examefisico;
	private String antibiotico;
	private int nutricaooral;
	private int nutricaogt;
	private int nutricaocne;
	private int nutricaoiv;
	private int atividadevidadiaria;
	private int pamax;
	private int pamin;
	private String fc;
	private String fr;
	private int nivelconscienciarm;
	private int nivelconscienciarv;
	private int nivelconscienciaao;
	private int nivelconscienciapontos;
	private int ventilacaomecanica;
	private String ventilador;
	private int ostomiatraqueostomia;
	private int ostomiagastrostomia;
	private int ostomiacateternasoenteral;
	private int ostomiacistostomia;
	private int ostomiacolostomia;
	private String ostomiaoutros;
	private int aspiracaotraqueal;
	private int acessovenoso;
	private int suporteoxigeniocilindro;
	private int suporteoxigenioconcentrador;
	private int oxigenoterapia;
	private int solicitarexame;
	private int mudancaprescricao;
	private String problemas;
	private String orientacao;
	private String assinaturapaciente;
	private String assinaturaprofissional;
	private String latitude;
	private String longitude;
	
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
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public String getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	public String getSituacaoclinica() {
		return situacaoclinica;
	}
	public void setSituacaoclinica(String situacaoclinica) {
		this.situacaoclinica = situacaoclinica;
	}
	public String getJustificativaatendimentodomiciliar() {
		return justificativaatendimentodomiciliar;
	}
	public void setJustificativaatendimentodomiciliar(String justificativaatendimentodomiciliar) {
		this.justificativaatendimentodomiciliar = justificativaatendimentodomiciliar;
	}
	public int getFisioterapiamotora() {
		return fisioterapiamotora;
	}
	public void setFisioterapiamotora(int fisioterapiamotora) {
		this.fisioterapiamotora = fisioterapiamotora;
	}
	public int getFisioterapiarespiratoria() {
		return fisioterapiarespiratoria;
	}
	public void setFisioterapiarespiratoria(int fisioterapiarespiratoria) {
		this.fisioterapiarespiratoria = fisioterapiarespiratoria;
	}
	public int getNutricionista() {
		return nutricionista;
	}
	public void setNutricionista(int nutricionista) {
		this.nutricionista = nutricionista;
	}
	public int getFonoterapia() {
		return fonoterapia;
	}
	public void setFonoterapia(int fonoterapia) {
		this.fonoterapia = fonoterapia;
	}
	public int getEnfermagem() {
		return enfermagem;
	}
	public void setEnfermagem(int enfermagem) {
		this.enfermagem = enfermagem;
	}
	public int getTerapiaocupacional() {
		return terapiaocupacional;
	}
	public void setTerapiaocupacional(int terapiaocupacional) {
		this.terapiaocupacional = terapiaocupacional;
	}
	public int getPsicologo() {
		return psicologo;
	}
	public void setPsicologo(int psicologo) {
		this.psicologo = psicologo;
	}
	public String getExamefisico() {
		return examefisico;
	}
	public void setExamefisico(String examefisico) {
		this.examefisico = examefisico;
	}
	public String getAntibiotico() {
		return antibiotico;
	}
	public void setAntibiotico(String antibiotico) {
		this.antibiotico = antibiotico;
	}
	public int getNutricaooral() {
		return nutricaooral;
	}
	public void setNutricaooral(int nutricaooral) {
		this.nutricaooral = nutricaooral;
	}
	public int getNutricaogt() {
		return nutricaogt;
	}
	public void setNutricaogt(int nutricaogt) {
		this.nutricaogt = nutricaogt;
	}
	public int getNutricaocne() {
		return nutricaocne;
	}
	public void setNutricaocne(int nutricaocne) {
		this.nutricaocne = nutricaocne;
	}
	public int getNutricaoiv() {
		return nutricaoiv;
	}
	public void setNutricaoiv(int nutricaoiv) {
		this.nutricaoiv = nutricaoiv;
	}
	public int getAtividadevidadiaria() {
		return atividadevidadiaria;
	}
	public void setAtividadevidadiaria(int atividadevidadiaria) {
		this.atividadevidadiaria = atividadevidadiaria;
	}
	public int getPamax() {
		return pamax;
	}
	public void setPamax(int pamax) {
		this.pamax = pamax;
	}
	public int getPamin() {
		return pamin;
	}
	public void setPamin(int pamin) {
		this.pamin = pamin;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public int getNivelconscienciarm() {
		return nivelconscienciarm;
	}
	public void setNivelconscienciarm(int nivelconscienciarm) {
		this.nivelconscienciarm = nivelconscienciarm;
	}
	public int getNivelconscienciarv() {
		return nivelconscienciarv;
	}
	public void setNivelconscienciarv(int nivelconscienciarv) {
		this.nivelconscienciarv = nivelconscienciarv;
	}
	public int getNivelconscienciaao() {
		return nivelconscienciaao;
	}
	public void setNivelconscienciaao(int nivelconscienciaao) {
		this.nivelconscienciaao = nivelconscienciaao;
	}
	public int getNivelconscienciapontos() {
		return nivelconscienciapontos;
	}
	public void setNivelconscienciapontos(int nivelconscienciapontos) {
		this.nivelconscienciapontos = nivelconscienciapontos;
	}
	public int getVentilacaomecanica() {
		return ventilacaomecanica;
	}
	public void setVentilacaomecanica(int ventilacaomecanica) {
		this.ventilacaomecanica = ventilacaomecanica;
	}
	public String getVentilador() {
		return ventilador;
	}
	public void setVentilador(String ventilador) {
		this.ventilador = ventilador;
	}
	public int getOstomiatraqueostomia() {
		return ostomiatraqueostomia;
	}
	public void setOstomiatraqueostomia(int ostomiatraqueostomia) {
		this.ostomiatraqueostomia = ostomiatraqueostomia;
	}
	public int getOstomiagastrostomia() {
		return ostomiagastrostomia;
	}
	public void setOstomiagastrostomia(int ostomiagastrostomia) {
		this.ostomiagastrostomia = ostomiagastrostomia;
	}
	public int getOstomiacateternasoenteral() {
		return ostomiacateternasoenteral;
	}
	public void setOstomiacateternasoenteral(int ostomiacateternasoenteral) {
		this.ostomiacateternasoenteral = ostomiacateternasoenteral;
	}
	public int getOstomiacistostomia() {
		return ostomiacistostomia;
	}
	public void setOstomiacistostomia(int ostomiacistostomia) {
		this.ostomiacistostomia = ostomiacistostomia;
	}
	public int getOstomiacolostomia() {
		return ostomiacolostomia;
	}
	public void setOstomiacolostomia(int ostomiacolostomia) {
		this.ostomiacolostomia = ostomiacolostomia;
	}
	public String getOstomiaoutros() {
		return ostomiaoutros;
	}
	public void setOstomiaoutros(String ostomiaoutros) {
		this.ostomiaoutros = ostomiaoutros;
	}
	public int getAspiracaotraqueal() {
		return aspiracaotraqueal;
	}
	public void setAspiracaotraqueal(int aspiracaotraqueal) {
		this.aspiracaotraqueal = aspiracaotraqueal;
	}
	public int getAcessovenoso() {
		return acessovenoso;
	}
	public void setAcessovenoso(int acessovenoso) {
		this.acessovenoso = acessovenoso;
	}
	public int getSuporteoxigeniocilindro() {
		return suporteoxigeniocilindro;
	}
	public void setSuporteoxigeniocilindro(int suporteoxigeniocilindro) {
		this.suporteoxigeniocilindro = suporteoxigeniocilindro;
	}
	public int getSuporteoxigenioconcentrador() {
		return suporteoxigenioconcentrador;
	}
	public void setSuporteoxigenioconcentrador(int suporteoxigenioconcentrador) {
		this.suporteoxigenioconcentrador = suporteoxigenioconcentrador;
	}
	public int getOxigenoterapia() {
		return oxigenoterapia;
	}
	public void setOxigenoterapia(int oxigenoterapia) {
		this.oxigenoterapia = oxigenoterapia;
	}
	public int getSolicitarexame() {
		return solicitarexame;
	}
	public void setSolicitarexame(int solicitarexame) {
		this.solicitarexame = solicitarexame;
	}
	public int getMudancaprescricao() {
		return mudancaprescricao;
	}
	public void setMudancaprescricao(int mudancaprescricao) {
		this.mudancaprescricao = mudancaprescricao;
	}
	public String getProblemas() {
		return problemas;
	}
	public void setProblemas(String problemas) {
		this.problemas = problemas;
	}
	public String getOrientacao() {
		return orientacao;
	}
	public void setOrientacao(String orientacao) {
		this.orientacao = orientacao;
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

	
}
