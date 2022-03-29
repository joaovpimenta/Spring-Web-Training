package com.cursospring.dao;

import org.springframework.stereotype.Repository;

import com.cursospring.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
