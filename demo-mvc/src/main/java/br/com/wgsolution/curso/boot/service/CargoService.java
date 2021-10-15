package br.com.wgsolution.curso.boot.service;

import java.util.List;

import br.com.wgsolution.curso.boot.domain.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	void editar(Cargo cargo);
	void exluir(Long id);
	Cargo buscaPorId(Long id);
	List<Cargo> buscarTodos();

}
