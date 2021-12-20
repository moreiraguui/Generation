package com.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogPessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario); //"usuario" é o atributo da classe model usuario.
	
	public List <Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
