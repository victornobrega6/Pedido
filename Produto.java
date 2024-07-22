package br.com.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Produto {
	private String descricao;
	private double valor;
	
	
	//Metodo que ira salvar os produtos no banco de dados
	public void salvar() {
		
		
		//trycatch trata exceçoes(erros)
		try(Connection connector = DB_connector.conectar()) {
			
			PreparedStatement smt = connector.prepareStatement
					("insert into PRODUTOS(descricao, valor) values(?,?);");
			
			smt.setString(1, descricao); // o numero da a posição 
			smt.setDouble(2, valor);
			smt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
			
		
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
