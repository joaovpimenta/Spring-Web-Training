package com.cursospring.dao;

import java.util.List;

import com.cursospring.domain.Cargo;

public interface CargoDao {

	public void save(Cargo cargo);

	public void update(Cargo cargo);

	public void delete(Long id);

	public Cargo findById(Long id);

	public List<Cargo> findAll();

}
