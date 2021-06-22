package com.patricksouza.angularcrud.services;

public class SaudacaoService {
	
	private final long id;
	private final String conteudo;
	
	public SaudacaoService(long id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
	}
	
	public long getId() {
		return id;
	}
	
	public String getConteudo() {
		return conteudo;
	}

}
