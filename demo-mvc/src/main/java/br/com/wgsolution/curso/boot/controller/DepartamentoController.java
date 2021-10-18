package br.com.wgsolution.curso.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.wgsolution.curso.boot.domain.Departamento;
import br.com.wgsolution.curso.boot.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;

	@GetMapping("/cadastrar")
	public String cadastrar(Departamento departamento) {	
		
		return "/departamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("departamentos", service.buscarTodos());
		
		return "/departamento/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Departamento departamento) {		
		service.salvar(departamento);
		
		return "redirect:/departamentos/cadastrar";
		
	}
	
	@RequestMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("departamento", service.buscaPorId(id));
		
		return "/departamento/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Departamento departamento) {
		service.editar(departamento);
		
		return "redirect:/departamentos/cadastrar";
	}
	
	
	@DeleteMapping("/excluir/{id}")
	public void excluir(@PathVariable("id") Long id, ModelMap model) {
		
	}
	
	
}
