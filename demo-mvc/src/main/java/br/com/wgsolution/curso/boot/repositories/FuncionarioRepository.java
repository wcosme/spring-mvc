package br.com.wgsolution.curso.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wgsolution.curso.boot.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	

}
