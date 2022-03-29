package com.cursospring.dao;

import java.util.List;

import com.cursospring.domain.Departamento;

public interface DepartamentoDao {

	public void save(Departamento departamento);

	public void update(Departamento departamento);

	public void delete(Long id);

	public Departamento findById(Long id);

	public List<Departamento> findAll();

}
