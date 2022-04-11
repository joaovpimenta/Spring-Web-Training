package com.cursospring.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cursospring.controller.Endereco;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Aplicação com Spring Web para estudo.
 * 
 * @author João Pimenta
 * @since 29/03/2022
 */

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "FUNCINARIOS")
public class Funcionario extends AbstractEntity<Long> {

	@Column(unique = true, nullable = false)
	private String nome;

	@Column(unique = true, nullable = false, columnDefinition = "DECIMAL (7,2) DEFAULT 0.00")
	private BigDecimal salario;

	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;

	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk", nullable = false)
	private Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "cargo_id_fk", nullable = false)
	private Cargo cargo;

}
