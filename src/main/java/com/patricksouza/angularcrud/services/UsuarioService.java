package com.patricksouza.angularcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patricksouza.angularcrud.domain.Usuario;
import com.patricksouza.angularcrud.exceptions.ObjectNotFoundException;
import com.patricksouza.angularcrud.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id:  " + id + "Do Tipo : " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {

		return repository.findAll();
	}
}
