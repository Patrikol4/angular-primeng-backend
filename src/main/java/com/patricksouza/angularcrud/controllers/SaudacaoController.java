package com.patricksouza.angularcrud.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patricksouza.angularcrud.services.SaudacaoService;

@RestController
public class SaudacaoController {

	public static final String template = "Olá, %s!";
	private final AtomicLong contador = new AtomicLong();

	@GetMapping("/saudacao")
	public SaudacaoService saudacao(@RequestParam(value = "nome", defaultValue = "Mensagem Padrao dizendo que funcionou") String nome) {
		return new SaudacaoService(contador.incrementAndGet(), String.format(template, nome));
	}
}
