package com.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Aplicação com Spring Web para estudo.
 * @author João Pimenta
 * @since 29/03/2022
 */

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departamento/cadastro";
	}

	@GetMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}
}
