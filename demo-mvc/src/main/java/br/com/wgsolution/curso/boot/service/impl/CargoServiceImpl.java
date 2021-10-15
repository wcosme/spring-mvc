package br.com.wgsolution.curso.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wgsolution.curso.boot.domain.Cargo;
import br.com.wgsolution.curso.boot.repositories.CargoRepository;
import br.com.wgsolution.curso.boot.service.CargoService;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService{
	
	@Autowired
	private CargoRepository repository;

	@Override
	public void salvar(Cargo cargo) {
		repository.save(cargo);
		
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional(readOnly = true)
	@Override
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
