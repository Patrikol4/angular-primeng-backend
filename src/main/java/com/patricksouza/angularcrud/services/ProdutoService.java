package com.patricksouza.angularcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patricksouza.angularcrud.domain.Produto;
import com.patricksouza.angularcrud.exceptions.ObjectNotFoundException;
import com.patricksouza.angularcrud.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto findById(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id:  " + id + "Do Tipo : " + Produto.class.getName()));
	}

	public List<Produto> findAll() {

		return repository.findAll();
	}

	public Produto update(Integer id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setDescricao(obj.getDescricao());
		newObj.setPreco(obj.getPreco());
		return repository.save(newObj);
	}

	public Produto create(Produto obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
}
