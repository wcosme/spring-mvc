package br.com.wgsolution.curso.boot.service;

import java.util.List;

import br.com.wgsolution.curso.boot.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	void editar(Departamento departamento);
	void exluir(Long id);
	List<Departamento> buscarTodos();
	Departamento buscaPorId(Long id);

}
