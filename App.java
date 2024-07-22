package br.com.App;

import br.com.Classes.Cliente;
import br.com.Classes.Pedido;
import br.com.Classes.Produto;
import br.com.Classes.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		Scanner input = new Scanner(System.in);
		
		
		pedido.cliente = cliente;
		
		System.out.println("Digite o número do pedido: ");
		pedido.setNumero(input.nextInt());
		input.nextLine();
		
		System.out.println("-----------------");
		
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(input.nextLine());
		System.out.println("Digite o telefone do cliente: ");
		cliente.setTelefone(input.nextLine());
		System.out.println("Digite o email do cliente: ");
		cliente.setEmail(input.nextLine());
		System.out.println("Digite a idade do cliente: ");
		cliente.setIdade(input.nextInt());
		input.nextLine();
		cliente.salvar();
		
		System.out.println("-----------------");
		
		System.out.println("Digite a descrição do produto: ");
		produto1.setDescricao(input.nextLine());
		System.out.println("Digite o valor do produto: ");
		produto1.setValor(input.nextDouble());
		input.nextLine();
		produto1.salvar();
		
		
		System.out.println("Digite a descrição do produto: ");
		produto2.setDescricao(input.nextLine());
		System.out.println("Digite o valor do produto: ");
		produto2.setValor(input.nextDouble());
		input.nextLine();
		produto2.salvar();
		
		System.out.println("Digite a descrição do produto: ");
		produto3.setDescricao(input.nextLine());
		System.out.println("Digite o valor do produto: ");
		produto3.setValor(input.nextDouble());
		input.nextLine();
		produto3.salvar();
		
		
		
		
		pedido.total = produto1.getValor() + produto2.getValor() + produto3.getValor();
		
		pedido.produtos.add(produto3);
		pedido.produtos.add(produto1);
		pedido.produtos.add(produto1);
		pedido.produtos.add(produto2);
		pedido.mostrarPedido();
		System.out.println("TOTAL: R$ " + pedido.total);
		
		
	}

}
