package br.com.wgsolution.curso.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wgsolution.curso.boot.domain.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
	

}
