package br.com.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DB_connector {
	
	//Criando conexão da aplicação com o banco de dados
	public static String URL = "jdbc:mysql://localhost:3306/APP_PEDIDO";
	public static String USER = "aluno";
	public static String PASSWORD = "toor";
	
	//Tratamento de erros para a conexão
	
	public static Connection conectar() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
}
