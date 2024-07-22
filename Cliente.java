package br.com.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cliente extends Pessoa{
	
	//criando metodo que ira salvar os dados do cliente no banco de dados
	public void salvar() {
		try(Connection connector = DB_connector.conectar()) {
			
			PreparedStatement smt = connector.prepareStatement
					("insert into CLIENTE(NOME,TELEFONE,EMAIL,IDADE) values(?,?,?,?);");
			
			smt.setString(1, getNome());
			smt.setString(2, getTelefone());
			smt.setString(3, getEmail());
			smt.setInt(4, getIdade());
			smt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
}
