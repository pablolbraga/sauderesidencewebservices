package br.com.sauderesidence.services.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sauderesidence.services.conexoes.Conexao;
import br.com.sauderesidence.services.models.ExameModel;

public class ExameController {
	
	public List<ExameModel> listarExamePorAdmissao(int idadmission) throws SQLException{
	
		StringBuilder sql = new StringBuilder();
		sql.append(""
				+ "SELECT "
				+ "A.ID, "
				+ "A.IDTESTSAMPLE, "
				+ "E.IDIMAGE, "
				+ "A.SCTEST AS CODEXAME, "
				+ "B.CODENAME AS NMEXAME, "
				+ "TO_CHAR(A.REQUESTDATE, 'DD/MM/YYYY HH24:MI:SS') AS REQ_EXAME, "
				+ "TO_CHAR(A.PROGRESULTDATE, 'DD/MM/YYYY HH24:MI:SS') AS PROG_RESULTADO, "
				+ "TO_CHAR(A.REALRESULTDATE, 'DD/MM/YYYY HH24:MI:SS') AS REAL_RESULTADO, "
				+ "C.NAME AS PROF_SOLICITANTE "
				+ "FROM "
				+ "CAPTEST A "
				+ "INNER JOIN SCCCODE B ON B.ID = A.SCTEST "
				+ "INNER JOIN GLBPERSON C ON C.ID = A.IDPROFESSIONAL "
				+ "INNER JOIN CAPTESTSAMPLE E ON E.ID = A.IDTESTSAMPLE "
				+ "WHERE "
				+ "A.LIBERATED = 1 "
				+ "AND A.IDTESTSAMPLE = (SELECT MAX(D.ID) FROM CAPTESTSAMPLE D WHERE D.IDADMISSION = ?) "
				+ "ORDER BY "
				+ "A.ID DESC");
		PreparedStatement pst = Conexao.abrirConexaoOracle().prepareStatement(sql.toString());
		pst.setInt(1, idadmission);
		ResultSet rs = pst.executeQuery();
		List<ExameModel> lista = new ArrayList<>();
		while(rs.next()) {
			ExameModel ex = new ExameModel();
			ex.setId(rs.getInt("ID"));
			ex.setIdimagem(rs.getInt("IDIMAGE"));
			ex.setIdexame(rs.getInt("CODEXAME"));
			ex.setNmexame(rs.getString("NMEXAME"));
			ex.setDatareq(rs.getString("REQ_EXAME") == null ? "" : rs.getString("REQ_EXAME"));
			ex.setDataprogres(rs.getString("PROG_RESULTADO") == null ? "" : rs.getString("PROG_RESULTADO"));
			ex.setDatarealres(rs.getString("REAL_RESULTADO") == null ? "" : rs.getString("REAL_RESULTADO"));
			ex.setNmsolicitante(rs.getString("PROF_SOLICITANTE") == null ? "" : rs.getString("PROF_SOLICITANTE"));
			lista.add(ex);
		}
		pst.close();
		return lista;
		
	}

}
