package model.repository;

public abstract class Produto {

	
	protected String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
}
