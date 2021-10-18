package br.com.wgsolution.curso.boot.domain.dto;

import java.util.List;

import br.com.wgsolution.curso.boot.domain.Cargo;
import lombok.Data;

@Data
public class DepartamentoDTO {

	private String nome;
	private List<Cargo> cargos;

}
