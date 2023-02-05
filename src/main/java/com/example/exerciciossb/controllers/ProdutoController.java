package com.example.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Produto;
import com.example.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	/*@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		
				
		produtoRepository.save(produto);
		return produto;
	}*/
	
	/* @PostMapping */
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam (value = "nome", required = false) String nome,
			@RequestParam (value = "preco", required = false) double preco,
			@RequestParam (value = "desconto", required = false) double desconto) {
		
		Produto produto = new Produto(nome, preco, desconto);
		
		produtoRepository.save(produto);
		return produto;
	}
	
	
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina (@PathVariable int numeroPagina) {
		
		Pageable page = PageRequest.of(0, 3);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContaining(parteNome);
	}
	
	
	@GetMapping(path = "/{id}")
	public Optional<Produto>  obterProdutoPorId (@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	/*
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto; } */
	
	@DeleteMapping(path = "/{id}") 
		public void excluirProduto(@PathVariable int id) {
			produtoRepository.deleteById(id);
		} 
	}
	
	
	
	

