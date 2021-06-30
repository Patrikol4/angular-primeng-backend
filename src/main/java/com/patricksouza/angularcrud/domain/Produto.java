package com.patricksouza.angularcrud.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo nome é obrigatório")
	@Length(min = 10, max = 120, message = "O nome deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo Descricao é obrigatório")
	private String descricao;
	
	@NotEmpty(message = "Campo Preco é obrigatório")
	private String preco;
	
	public Produto() {
		super();
	}
	
	public Produto(Integer id, String nome, String descricao, String preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco){
		this.preco = preco;
	}
}
