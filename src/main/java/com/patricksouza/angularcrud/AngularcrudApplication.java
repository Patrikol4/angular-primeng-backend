package com.patricksouza.angularcrud;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.patricksouza.angularcrud.domain.Usuario;
import com.patricksouza.angularcrud.repositories.UsuarioRepository;

@SpringBootApplication
@RestController


public class AngularcrudApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(AngularcrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario(null, "patrick souza", "patricksouza", "123");
		Usuario u2 = new Usuario(null, "jose silva", "josesilva", "123");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));

	}

}
