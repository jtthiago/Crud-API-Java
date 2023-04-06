package com.haubrick.crud.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import com.haubrick.crud.model.Produto;
import com.haubrick.crud.model.exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository {
	
	private ArrayList<Produto> produtos = new ArrayList<>();
	private Integer ultimoId = 0;
	
	public List<Produto> obterTodos(){
		return produtos;
	}
	
	public Optional<Produto> obterPorId(Integer id){
		return produtos.stream()
				.filter(produto -> produto.getId() == id)
				.findFirst();
	}
	
	public Produto adicionar(Produto produto) {
		ultimoId++;
		
		produto.setId(ultimoId);
		produtos.add(produto);
		
		return produto;
	}
	
	public Produto atualizarPorId(Integer id, Produto produtoAtualizado) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produtoExistente = produtos.get(i);
			if (produtoExistente.getId() == id) {
				produtoAtualizado.setId(id);
				produtos.set(i, produtoAtualizado);
				return produtoAtualizado;
			}
		}
		
		if(produtos.isEmpty()) {
			throw new ResourceNotFoundException("Produto não encontrado");
		}
		
		return null; // ou lançar uma exceção indicando que o produto não foi encontrado
	}
	
	public void deletar(Integer id) {
		produtos.removeIf(produto -> produto.getId() == id);
	}
	
	
}
