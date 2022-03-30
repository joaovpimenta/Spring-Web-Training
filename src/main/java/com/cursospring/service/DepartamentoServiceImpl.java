package com.cursospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursospring.dao.DepartamentoDao;
import com.cursospring.domain.Departamento;

@Service @Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	DepartamentoDao departamentoDao;

	@Override
	public void salvar(Departamento departamento) {
		departamentoDao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		departamentoDao.update(departamento);
	}

	@Override
	public void excluir(Long id) {
		departamentoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		return departamentoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return departamentoDao.findAll();
	}

}
