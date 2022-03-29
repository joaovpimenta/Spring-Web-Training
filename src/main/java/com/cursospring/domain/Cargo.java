package com.cursospring.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

/**
 * Aplicação com Spring Web para treino.
 * @author João Pimenta
 * @since 29/03/2022
 */

@SuppressWarnings("serial")
@Data @Entity @Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

	@NonNull @Column(name =  "nome", unique = true, length = 60)
	private String nome;

	@ManyToOne @JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;
}
