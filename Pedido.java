package br.com.Classes;

import java.util.ArrayList;
import java.util.List;


public class Pedido extends Pessoa{
	private int numero;
	public double total;
	public Cliente cliente;
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	
	/*
	 * criando um tipo de lista do tipo produto para acessar
	 * as descrilçoes dos produtos que serão pedidos
	 * 
	 */
	public List<Produto> produtos = new ArrayList<>();
	
	public void mostrarPedido() {
		
		
		System.out.println("_____________________________");
		System.out.println("Nº PEDIDO: " + numero);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Cliente: " + cliente.getTelefone());
		System.out.println("Cliente: " + cliente.getEmail());
		System.out.println("Cliente: " + cliente.getIdade());
		System.out.println("_____________________________");
		System.out.println("--ITENS DO PEDIDO--");
		System.out.println("_____________________________");
		for (Produto p : produtos) {
			System.out.println("-----"+ p.getDescricao());
		}
		System.out.println("_____________________________");
		//System.out.println("TOTAL: R$ " + total);
		
		
	}
}
