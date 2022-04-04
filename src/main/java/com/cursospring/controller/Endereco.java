package com.cursospring.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import com.cursospring.domain.AbstractEntity;
import com.cursospring.domain.UF;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

/**
 * Aplicação com Spring Web para treino.
 * 
 * @author João Pimenta
 * @since 29/03/2022
 */
@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

	@NonNull
	@Column
	private String logradouro;

	@NonNull
	@Column
	private String bairro;

	@NonNull
	@Column
	private String cidade;

	@NonNull
	@Column(length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;

	@NonNull
	@Column(length = 9)
	private String cep;

	@NonNull
	@Column(length = 5)
	private String numero;

	@Nullable
	private String complemento;
}
