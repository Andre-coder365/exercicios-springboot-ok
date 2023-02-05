package com.example.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String nome;
	
	private double preco;
	
	
	private double desconto;
		
	
	public Produto() {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	
	

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
