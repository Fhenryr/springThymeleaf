package com.threeway.curso.boot.service;

import java.util.List;

import com.threeway.curso.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> BuscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
	
}
