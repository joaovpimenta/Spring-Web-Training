package com.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Aplicação com Spring Web para treino.
 * @author João Pimenta
 * @since 29/03/2022
 */

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "/home";
	}
}
