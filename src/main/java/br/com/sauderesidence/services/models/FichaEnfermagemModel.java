package br.com.sauderesidence.services.models;

import java.io.Serializable;

public class FichaEnfermagemModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idadmission;
	private int idprofessional;
	private int idcapconsult;
	private int idprofagenda;
	private String datainicio;
	private String datafim;
	private String acompanhante;
	private String hospital;
	private int cuidadobanho;
	private int cuidadovestir;
	private int cuidadotransferencia;
	private int cuidadocontinencia;
	private int cuidadoalimentacao;
	private int utilizacaotqt;
	private int utilizacaocne;
	private int utilizacaogt;
	private int utilizacaocvd;
	private int utilizacaooutros;
	private String utilizacaooutrostexto;
	private int oxigenoterapiacilindro;
	private int oxigenoterapiaconcentrador;
	private int oxigenoterapiacontinuo;
	private int oxigenoterapianao;
	private int ventilacaomecanica;
	private String ventilacaomecanicaequipamento;
	private int pamax;
	private int pamin;
	private int feridapressao;
	private int feridavasculogencia;
	private int feridacirurgia;
	private String feridaoutros;
	private int diag001;
	private int diag002;
	private int diag003;
	private int diag004;
	private int diag005;
	private int diag006;
	private int diag007;
	private int diag008;
	private int diag009;
	private int diag010;
	private int diag011;
	private int diag012;
	private int diag013;
	private int diag014;
	private int diag015;
	private int proc001;
	private int proc002;
	private int proc003;
	private int proc004;
	private int proc005;
	private int proc006;
	private int proc007;
	private int proc008;
	private int procoutros;
	private String procoutrostexto;
	private int cuid001;
	private int cuid002;
	private int cuid003;
	private int cuid004;
	private int cuid005;
	private int cuid006;
	private int cuid007;
	private int cuid008;
	private int cuidoutros;
	private String cuidoutrostexto;
	private int bradenpercepcaosensorial;
	private int bradenumidade;
	private int bradenatividade;
	private int bradenmobilidade;
	private int bradennutricao;
	private int bradenficcao;
	private String observacao;
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
	public String getAcompanhante() {
		return acompanhante;
	}
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public int getCuidadobanho() {
		return cuidadobanho;
	}
	public void setCuidadobanho(int cuidadobanho) {
		this.cuidadobanho = cuidadobanho;
	}
	public int getCuidadovestir() {
		return cuidadovestir;
	}
	public void setCuidadovestir(int cuidadovestir) {
		this.cuidadovestir = cuidadovestir;
	}
	public int getCuidadotransferencia() {
		return cuidadotransferencia;
	}
	public void setCuidadotransferencia(int cuidadotransferencia) {
		this.cuidadotransferencia = cuidadotransferencia;
	}
	public int getCuidadocontinencia() {
		return cuidadocontinencia;
	}
	public void setCuidadocontinencia(int cuidadocontinencia) {
		this.cuidadocontinencia = cuidadocontinencia;
	}
	public int getCuidadoalimentacao() {
		return cuidadoalimentacao;
	}
	public void setCuidadoalimentacao(int cuidadoalimentacao) {
		this.cuidadoalimentacao = cuidadoalimentacao;
	}
	public int getUtilizacaotqt() {
		return utilizacaotqt;
	}
	public void setUtilizacaotqt(int utilizacaotqt) {
		this.utilizacaotqt = utilizacaotqt;
	}
	public int getUtilizacaocne() {
		return utilizacaocne;
	}
	public void setUtilizacaocne(int utilizacaocne) {
		this.utilizacaocne = utilizacaocne;
	}
	public int getUtilizacaogt() {
		return utilizacaogt;
	}
	public void setUtilizacaogt(int utilizacaogt) {
		this.utilizacaogt = utilizacaogt;
	}
	public int getUtilizacaocvd() {
		return utilizacaocvd;
	}
	public void setUtilizacaocvd(int utilizacaocvd) {
		this.utilizacaocvd = utilizacaocvd;
	}
	public int getUtilizacaooutros() {
		return utilizacaooutros;
	}
	public void setUtilizacaooutros(int utilizacaooutros) {
		this.utilizacaooutros = utilizacaooutros;
	}
	public String getUtilizacaooutrostexto() {
		return utilizacaooutrostexto;
	}
	public void setUtilizacaooutrostexto(String utilizacaooutrostexto) {
		this.utilizacaooutrostexto = utilizacaooutrostexto;
	}
	public int getOxigenoterapiacilindro() {
		return oxigenoterapiacilindro;
	}
	public void setOxigenoterapiacilindro(int oxigenoterapiacilindro) {
		this.oxigenoterapiacilindro = oxigenoterapiacilindro;
	}
	public int getOxigenoterapiaconcentrador() {
		return oxigenoterapiaconcentrador;
	}
	public void setOxigenoterapiaconcentrador(int oxigenoterapiaconcentrador) {
		this.oxigenoterapiaconcentrador = oxigenoterapiaconcentrador;
	}
	public int getOxigenoterapiacontinuo() {
		return oxigenoterapiacontinuo;
	}
	public void setOxigenoterapiacontinuo(int oxigenoterapiacontinuo) {
		this.oxigenoterapiacontinuo = oxigenoterapiacontinuo;
	}
	public int getOxigenoterapianao() {
		return oxigenoterapianao;
	}
	public void setOxigenoterapianao(int oxigenoterapianao) {
		this.oxigenoterapianao = oxigenoterapianao;
	}
	public int getVentilacaomecanica() {
		return ventilacaomecanica;
	}
	public void setVentilacaomecanica(int ventilacaomecanica) {
		this.ventilacaomecanica = ventilacaomecanica;
	}
	public String getVentilacaomecanicaequipamento() {
		return ventilacaomecanicaequipamento;
	}
	public void setVentilacaomecanicaequipamento(String ventilacaomecanicaequipamento) {
		this.ventilacaomecanicaequipamento = ventilacaomecanicaequipamento;
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
	public int getFeridapressao() {
		return feridapressao;
	}
	public void setFeridapressao(int feridapressao) {
		this.feridapressao = feridapressao;
	}
	public int getFeridavasculogencia() {
		return feridavasculogencia;
	}
	public void setFeridavasculogencia(int feridavasculogencia) {
		this.feridavasculogencia = feridavasculogencia;
	}
	public int getFeridacirurgia() {
		return feridacirurgia;
	}
	public void setFeridacirurgia(int feridacirurgia) {
		this.feridacirurgia = feridacirurgia;
	}
	public String getFeridaoutros() {
		return feridaoutros;
	}
	public void setFeridaoutros(String feridaoutros) {
		this.feridaoutros = feridaoutros;
	}
	public int getDiag001() {
		return diag001;
	}
	public void setDiag001(int diag001) {
		this.diag001 = diag001;
	}
	public int getDiag002() {
		return diag002;
	}
	public void setDiag002(int diag002) {
		this.diag002 = diag002;
	}
	public int getDiag003() {
		return diag003;
	}
	public void setDiag003(int diag003) {
		this.diag003 = diag003;
	}
	public int getDiag004() {
		return diag004;
	}
	public void setDiag004(int diag004) {
		this.diag004 = diag004;
	}
	public int getDiag005() {
		return diag005;
	}
	public void setDiag005(int diag005) {
		this.diag005 = diag005;
	}
	public int getDiag006() {
		return diag006;
	}
	public void setDiag006(int diag006) {
		this.diag006 = diag006;
	}
	public int getDiag007() {
		return diag007;
	}
	public void setDiag007(int diag007) {
		this.diag007 = diag007;
	}
	public int getDiag008() {
		return diag008;
	}
	public void setDiag008(int diag008) {
		this.diag008 = diag008;
	}
	public int getDiag009() {
		return diag009;
	}
	public void setDiag009(int diag009) {
		this.diag009 = diag009;
	}
	public int getDiag010() {
		return diag010;
	}
	public void setDiag010(int diag010) {
		this.diag010 = diag010;
	}
	public int getDiag011() {
		return diag011;
	}
	public void setDiag011(int diag011) {
		this.diag011 = diag011;
	}
	public int getDiag012() {
		return diag012;
	}
	public void setDiag012(int diag012) {
		this.diag012 = diag012;
	}
	public int getDiag013() {
		return diag013;
	}
	public void setDiag013(int diag013) {
		this.diag013 = diag013;
	}
	public int getDiag014() {
		return diag014;
	}
	public void setDiag014(int diag014) {
		this.diag014 = diag014;
	}
	public int getDiag015() {
		return diag015;
	}
	public void setDiag015(int diag015) {
		this.diag015 = diag015;
	}
	public int getProc001() {
		return proc001;
	}
	public void setProc001(int proc001) {
		this.proc001 = proc001;
	}
	public int getProc002() {
		return proc002;
	}
	public void setProc002(int proc002) {
		this.proc002 = proc002;
	}
	public int getProc003() {
		return proc003;
	}
	public void setProc003(int proc003) {
		this.proc003 = proc003;
	}
	public int getProc004() {
		return proc004;
	}
	public void setProc004(int proc004) {
		this.proc004 = proc004;
	}
	public int getProc005() {
		return proc005;
	}
	public void setProc005(int proc005) {
		this.proc005 = proc005;
	}
	public int getProc006() {
		return proc006;
	}
	public void setProc006(int proc006) {
		this.proc006 = proc006;
	}
	public int getProc007() {
		return proc007;
	}
	public void setProc007(int proc007) {
		this.proc007 = proc007;
	}
	public int getProc008() {
		return proc008;
	}
	public void setProc008(int proc008) {
		this.proc008 = proc008;
	}
	public int getProcoutros() {
		return procoutros;
	}
	public void setProcoutros(int procoutros) {
		this.procoutros = procoutros;
	}
	public String getProcoutrostexto() {
		return procoutrostexto;
	}
	public void setProcoutrostexto(String procoutrostexto) {
		this.procoutrostexto = procoutrostexto;
	}
	public int getCuid001() {
		return cuid001;
	}
	public void setCuid001(int cuid001) {
		this.cuid001 = cuid001;
	}
	public int getCuid002() {
		return cuid002;
	}
	public void setCuid002(int cuid002) {
		this.cuid002 = cuid002;
	}
	public int getCuid003() {
		return cuid003;
	}
	public void setCuid003(int cuid003) {
		this.cuid003 = cuid003;
	}
	public int getCuid004() {
		return cuid004;
	}
	public void setCuid004(int cuid004) {
		this.cuid004 = cuid004;
	}
	public int getCuid005() {
		return cuid005;
	}
	public void setCuid005(int cuid005) {
		this.cuid005 = cuid005;
	}
	public int getCuid006() {
		return cuid006;
	}
	public void setCuid006(int cuid006) {
		this.cuid006 = cuid006;
	}
	public int getCuid007() {
		return cuid007;
	}
	public void setCuid007(int cuid007) {
		this.cuid007 = cuid007;
	}
	public int getCuid008() {
		return cuid008;
	}
	public void setCuid008(int cuid008) {
		this.cuid008 = cuid008;
	}
	public int getCuidoutros() {
		return cuidoutros;
	}
	public void setCuidoutros(int cuidoutros) {
		this.cuidoutros = cuidoutros;
	}
	public String getCuidoutrostexto() {
		return cuidoutrostexto;
	}
	public void setCuidoutrostexto(String cuidoutrostexto) {
		this.cuidoutrostexto = cuidoutrostexto;
	}
	public int getBradenpercepcaosensorial() {
		return bradenpercepcaosensorial;
	}
	public void setBradenpercepcaosensorial(int bradenpercepcaosensorial) {
		this.bradenpercepcaosensorial = bradenpercepcaosensorial;
	}
	public int getBradenumidade() {
		return bradenumidade;
	}
	public void setBradenumidade(int bradenumidade) {
		this.bradenumidade = bradenumidade;
	}
	public int getBradenatividade() {
		return bradenatividade;
	}
	public void setBradenatividade(int bradenatividade) {
		this.bradenatividade = bradenatividade;
	}
	public int getBradenmobilidade() {
		return bradenmobilidade;
	}
	public void setBradenmobilidade(int bradenmobilidade) {
		this.bradenmobilidade = bradenmobilidade;
	}
	public int getBradennutricao() {
		return bradennutricao;
	}
	public void setBradennutricao(int bradennutricao) {
		this.bradennutricao = bradennutricao;
	}
	public int getBradenficcao() {
		return bradenficcao;
	}
	public void setBradenficcao(int bradenficcao) {
		this.bradenficcao = bradenficcao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
