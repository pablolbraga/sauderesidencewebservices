package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.IntercorrenciaModel;

public class IntercorrenciaController {
	
	public boolean inserirIntercorrencia(IntercorrenciaModel ic) throws SQLException {
		
		try {
			StringBuilder textoIntercorrencia = new StringBuilder();
			textoIntercorrencia
			.append("Profissional: ").append(ic.getNmprofissional())
			.append("\n")
			.append("Nr. Registro: ").append(ic.getRegistroprofissional())
			.append("\n")
			.append("Data Registro: ").append(ic.getDataevento())
			.append("\n")
			.append("Observação: ").append(ic.getDescricao()).append("<br>");
			
			// Inserindo texto da intercorrencia
			StringBuilder sqlTexto = new StringBuilder();
			sqlTexto.append("INSERT INTO GLBTEXT (TEXT) VALUES (?)");
			PreparedStatement pstTexto = Conexao.abrirConexaoOracle().prepareStatement(sqlTexto.toString());
			pstTexto.setString(1, textoIntercorrencia.toString());
			pstTexto.execute();
			
			// Retorna o código da intercorrencia
			StringBuilder sqlInter = new StringBuilder();
			sqlInter.append("SELECT * FROM (SELECT * FROM GLBTEXT ORDER BY ID DESC) WHERE ROWNUM = 1");
			PreparedStatement pstInter = Conexao.abrirConexaoOracle().prepareStatement(sqlInter.toString());
			ResultSet rs = pstInter.executeQuery();
			int codigoInter = 0;
			while(rs.next()) {
				codigoInter = rs.getInt("ID");
			}
			
			// Inserindo ações tomadas
			StringBuilder textoAcaoTomada = new StringBuilder();
			textoAcaoTomada
			.append("Profissional: ").append(ic.getNmprofissional())
			.append("\n")
			.append("Nr. Registro: ").append(ic.getRegistroprofissional())
			.append("\n")
			.append("Data Registro: ").append(ic.getDataevento())
			.append("\n")
			.append("Observação: ").append(ic.getAcaotomada()).append("<br>");
			
			StringBuilder sqlTextoAcaoTomada = new StringBuilder();
			sqlTextoAcaoTomada.append("INSERT INTO GLBTEXT (TEXT) VALUES (?)");
			PreparedStatement pstTextoAcaoTomada = Conexao.abrirConexaoOracle().prepareStatement(sqlTextoAcaoTomada.toString());
			pstTextoAcaoTomada.setString(1, textoAcaoTomada.toString());
			pstTextoAcaoTomada.execute();
			
			// Retorna o código da ação tomada
			StringBuilder sqlAcaoTomada = new StringBuilder();
			sqlAcaoTomada.append("SELECT * FROM (SELECT * FROM GLBTEXT ORDER BY ID DESC) WHERE ROWNUM = 1");
			PreparedStatement pstAcaoTomada = Conexao.abrirConexaoOracle().prepareStatement(sqlAcaoTomada.toString());
			ResultSet rsAcaoTomada = pstAcaoTomada.executeQuery();
			int codigoAcaoTomada = 0;
			while(rsAcaoTomada.next()) {
				codigoAcaoTomada = rsAcaoTomada.getInt("ID");
			}
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			// Inserir Intercorrencias
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO CAPINTERCURRENT ("
					+ "IDADMISSION, IDINTERCURRENTCFG, IDINTERCLASSIF, IDTEXT, IDTEXTTREAT, "
					+ "STATUS, STARTDATE, TIMESTAMPCTRTEXT, TIMESTAMPCTRTREAT, DEADLINE"
					+ ") VALUES ("
					+ "?, ?, ?, ?, ?, "
					+ "?, TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS'), TO_DATE(?, 'DD/MM/YYYY HH24:MI:SS')"
					+ ")");
			PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
			pst.setInt(1, ic.getIdadmission());
			pst.setInt(2, ic.getGrauurgencia());
			pst.setInt(3, ic.getTipointercorrencia());
			pst.setInt(4, codigoInter);
			pst.setInt(5, codigoAcaoTomada);
			pst.setInt(6, 0);
			pst.setString(7, ic.getDataevento());
			pst.setString(8, formato.format(new Date()));
			pst.setString(9, formato.format(new Date()));
			pst.setString(10, ic.getDatamaxima() + " " + ic.getHoramaxima() + ":00");
			pst.execute();
			pst.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
