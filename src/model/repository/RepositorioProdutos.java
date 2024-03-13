package model.repository;

import java.util.List;

public interface RepositorioProdutos {

	void adicionarProduto(Produto produto);
	void removerProduto(String nome);
	Produto buscarProduto(String nome);
	List<Produto> ListarProdutos();
}
