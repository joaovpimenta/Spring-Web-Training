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
import lombok.NonNull;

/**
 * Aplicação com Spring Web para estudo.
 * @author João Pimenta
 * @since 29/03/2022
 */

@SuppressWarnings("serial")
@Data @Entity @Table(name = "FUNCINARIOS")
public class Funcionario extends AbstractEntity<Long> {

	@NonNull @Column(unique = true)
	private String nome;

	@NonNull @Column(unique = true, columnDefinition = "DECIMAL (7,2) DEFAULT 0.00")
	private BigDecimal salario;

	@NonNull @Column(name = "data_entrada", columnDefinition = "DATE")
	private LocalDate dataEntrada;

	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;

	@NonNull @OneToOne(cascade = CascadeType.ALL) @JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;

	@NonNull @ManyToOne @JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;
	
	

}
