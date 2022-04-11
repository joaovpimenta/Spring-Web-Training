package com.cursospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.cursospring.domain.Departamento;
import com.cursospring.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

	@Autowired
	DepartamentoService departamentoService;

	@Override
	public Departamento convert(String source) {
		return (source.isEmpty()) ? null : departamentoService.buscarPorId(Long.valueOf(source));
	}

}
