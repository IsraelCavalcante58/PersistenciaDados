package com.persistenciaDados.repository;

import com.persistenciaDados.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;



public interface UsuarioRepository  extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario> {
    Usuario findByLogin(String login);
}
