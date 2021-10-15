package br.com.wgsolution.curso.boot.service;

import java.util.List;

import br.com.wgsolution.curso.boot.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	void editar(Funcionario funcionario);
	void exluir(Long id);
	List<Funcionario> buscarTodos();

}
