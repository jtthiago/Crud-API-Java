package com.haubrick.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haubrick.crud.model.Produto;
import com.haubrick.crud.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> obterTodos(){
		return produtoRepository.obterTodos();
	}
	
	public Optional<Produto> obterPorId(Integer id){
		return produtoRepository.obterPorId(id);
	}
	
	public Produto adicionar(Produto produto) {
		return produtoRepository.adicionar(produto);
	}
	
	public Produto atualizarPorId(Integer id, Produto produtoAtualizado) {
		return produtoRepository.atualizarPorId(id, produtoAtualizado);
}
	
	public  void deletar(Integer id) {
		 produtoRepository.deletar(id);
	}

}