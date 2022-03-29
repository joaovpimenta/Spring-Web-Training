package com.cursospring.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

/**
 * Aplicação com Spring Web para estudo.
 * @author João Pimenta
 * @since 29/03/2022
 */

@SuppressWarnings("serial")
@Data @Entity @Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

	@NonNull @Column(name =  "nome", unique = true, length = 60)
	private String nome;

	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

}
