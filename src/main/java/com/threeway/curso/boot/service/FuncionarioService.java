package com.threeway.curso.boot.service;

import java.util.List;

import com.threeway.curso.boot.domain.Funcionario;

public interface FuncionarioService {

	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario) throws Exception;

	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> BuscarTodos();

	List<Funcionario> buscarPorNome(String nome);

}
