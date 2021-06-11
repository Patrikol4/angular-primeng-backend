package com.patricksouza.angularcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patricksouza.angularcrud.domain.Usuario;

@Repository

	public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
		
	}

