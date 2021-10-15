package br.com.wgsolution.curso.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wgsolution.curso.boot.domain.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long>{
	

}
