package com.cursospring.dao;

import org.springframework.stereotype.Repository;

import com.cursospring.domain.Cargo;

/**
 * Aplicação com Spring Web para treino.
 *
 * @author João Pimenta
 * @since 29/03/2022
 */

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
