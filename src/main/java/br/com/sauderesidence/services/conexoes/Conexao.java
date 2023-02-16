package br.com.sauderesidence.services.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;

public class Conexao {
	
	private static Connection CONN_ORA;
	private static final String DRIVER_ORA = "oracle.jdbc.OracleDriver";
	private static final String URL_ORA = "jdbc:oracle:thin:@192.168.0.3:1521:SRID";
	private static final String USER_ORA = "dbIwSaudeResid";
	private static final String PWD_ORA = "x";
	
	public static Connection abrirConexaoOracle() {
		try {
			TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
			TimeZone.setDefault(timeZone);
			Class.forName(DRIVER_ORA);
			CONN_ORA = DriverManager.getConnection(URL_ORA, USER_ORA, PWD_ORA);
			return CONN_ORA;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
