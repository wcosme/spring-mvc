package br.com.wgsolution.curso.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.wgsolution.curso.boot.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;

	@GetMapping("/cadastrar")
	public String cadastrar() {
		
		
		
		
		return "/departamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}
}
