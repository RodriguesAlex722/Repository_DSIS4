package br.edu.ifsp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Conexao {

	private String url = "jdbc:mysql://localhost:3306/dsi";
	private String user = "root";
	private String password = "";

	private static Connection conexao = null;
	
	private Conexao() {
		
		try {		
			// 1º - É necessário carregar o driver no projeto
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Carregando driver JDBC ...");
			
			// 2º - Estabeleço uma conexão com o BD
			conexao = 
				DriverManager.getConnection(url, user, password);
			System.out.println("Abrindo conexao ...");
			
		} catch(ClassNotFoundException cnfex) {
			System.out.println("Erro ao carregar o driver de conexao");
			
		} catch(SQLException sqlex) {
			System.out.println("Problema ao estabelecer conexao com o BD");
		}
	}
	
	//Singleton - getInstance()
	public static Connection obterConexao() {
		
		if(conexao == null) {
			// criar a conexao
			new Conexao();
		}
		
		// retorno o atributo
		return conexao;
	}
	
	
	public static Connection fecharConexao() {
		try {
			// 3º - Fechar a conexão
			if(conexao != null) {
				conexao.close();
				System.out.println("Fechando conexao ...");	
			}
			
		} catch(SQLException sqlex) {
				
			System.out.println("Problema ao fechar a conexao com o BD");
		}
		return conexao;
	}
}
