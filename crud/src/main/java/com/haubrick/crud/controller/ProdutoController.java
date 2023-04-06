package com.haubrick.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haubrick.crud.model.Produto;
import com.haubrick.crud.services.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> obterTodos(){
		return produtoService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> obterPorId(@PathVariable Integer id){
		return produtoService.obterPorId(id);
	}
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoService.adicionar(produto);
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Integer id) {
		produtoService.deletar(id);
		return "Produto com id:" + id + " foi deletado com sucesso!";
	}
	
	
	@PutMapping("/{id}")
	public Produto atualizarPorId(@RequestBody Produto produto, @PathVariable Integer id) {
		return produtoService.atualizarPorId(id, produto);
	}
}
