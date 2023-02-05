package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Cliente;



@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente (28, "Pedro", "123.456.789.-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name= "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333.-44");
	}
	

}