package com.cursospring.service;

import java.util.List;

import com.cursospring.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPorId(Long id);

	List<Departamento> buscarTodos();

	Boolean departamentoTemCargo(Long id);

}
