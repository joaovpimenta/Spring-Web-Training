package com.cursospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursospring.dao.CargoDao;
import com.cursospring.dao.CargoDaoImpl;
import com.cursospring.domain.Cargo;

@Service
@Transactional
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoDao cargoDao;
	CargoDaoImpl cargoDaoImpl;

	@Override
	public void salvar(Cargo cargo) {
		cargoDao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		cargoDao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		cargoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return cargoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return cargoDao.findAll();
	}

}
