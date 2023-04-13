package br.com.alura.estoque.dao;


import br.com.alura.estoque.modelo.Produto;

import java.util.List;

public interface ProdutoDao {
	public List<Produto> lista();
	public Produto getProduto(Integer id);
}
