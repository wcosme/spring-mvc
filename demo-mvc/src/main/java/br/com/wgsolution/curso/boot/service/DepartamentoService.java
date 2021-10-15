package br.com.wgsolution.curso.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wgsolution.curso.boot.repositories.DepartamentoRepository;

@Service @Transactional(readOnly = false)
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;

}
