package br.com.wgsolution.curso.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wgsolution.curso.boot.domain.Departamento;
import br.com.wgsolution.curso.boot.repositories.DepartamentoRepository;
import br.com.wgsolution.curso.boot.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;

	@Override
	public void salvar(Departamento departamento) {
		repository.save(departamento);		
	}

	@Override
	public void editar(Departamento departamento) {
		
	}

	@Override
	public void exluir(Long id) {
		
	}

	@Override
	public List<Departamento> buscarTodos() {
		return repository.findAll();
	}

}
