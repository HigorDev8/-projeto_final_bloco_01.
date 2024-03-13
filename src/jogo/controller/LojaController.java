package jogo.controller;

import java.util.ArrayList;
import java.util.List;

import model.repository.Jogo;
import model.repository.Produto;
import model.repository.RepositorioProdutos;

public class LojaController {

	private RepositorioProdutos repositorioProdutos;
	private List<Produto> carrinho;
	
	public LojaController(RepositorioProdutos repositorioProdutos) {
		this.repositorioProdutos = repositorioProdutos;
		this.carrinho = new ArrayList<>();
		
		inicializarProdutos();
	}

	private void inicializarProdutos() {
		
		repositorioProdutos.adicionarProduto(new Jogo("GTA 6", 399.99, "PS5"));
		repositorioProdutos.adicionarProduto(new Jogo("Red Dead Redemption 2", 129.99, "PS4"));
		repositorioProdutos.adicionarProduto(new Jogo("Crash Bandiccot", 59.99, "Switch"));
		repositorioProdutos.adicionarProduto(new Jogo("Fortnite", 0.0, "Multiplataforma"));
		repositorioProdutos.adicionarProduto(new Jogo("Call Of Duty: Black Ops Cold War", 249.99, "Xbox"));
		repositorioProdutos.adicionarProduto(new Jogo("FIFA 21", 89.99, "PC"));
		repositorioProdutos.adicionarProduto(new Jogo("NBA 2K21", 99.99, "PS5"));
		repositorioProdutos.adicionarProduto(new Jogo("Assassin's Creed Valhalla", 129.99, "PS4"));
		repositorioProdutos.adicionarProduto(new Jogo("Destiny 2", 0.0, "Multiplataforma"));
		repositorioProdutos.adicionarProduto(new Jogo("MLB the Show 21", 79.99, "Xbox"));
		repositorioProdutos.adicionarProduto(new Jogo("Marvel's Spider Man: Miles Morales", 179.99, "PS5"));
		repositorioProdutos.adicionarProduto(new Jogo("Demon's Souls", 109.99, "PS5"));
		repositorioProdutos.adicionarProduto(new Jogo("NBA 2K22", 149.99, "PS4"));
	}
	
	public void visualizarProdutos() {
		List<Produto> produtos = repositorioProdutos.ListarProdutos();
		if (produtos.isEmpty()) {
			System.out.println("Não há produtos disponiveis no momento.");
		}else {
			System.out.println("==== Lista de Produtos Disponíveis ====");
			for (Produto produto : produtos) {
				if (produto instanceof Jogo) {
					Jogo jogo = (Jogo) produto;
					System.out.println("Nome: " + jogo.getNome());
					System.out.println("Plataforma: " + jogo.getPlataforma());
					System.out.println("Preço: R$" + jogo.getPreco());
					System.out.println("--------------------------");
				}
				
			
			}
		}
	}
	
	public void adicionarJogoAoCarrinho(String nome) {
		Produto produto = repositorioProdutos.buscarProduto(nome);
		if (produto != null && produto instanceof Jogo) {
			carrinho.add(produto);
			System.out.println("Jogo adicionado ao carrinho.");
		}else {
			System.out.println("Jogo não encontrado");
		}
	}
	
	public void visualizarCarrinho() {
		if (carrinho.isEmpty()) {
			System.out.println("Carrinho vazio.");
		}else {
			System.out.println("==== Carrinho ====");
			for (Produto produto : carrinho) {
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: R$" + produto.getPreco());
				System.out.println("--------------------------");
			}
		}
	}
	
	public void finalizarCompra() {
		
	}
}

