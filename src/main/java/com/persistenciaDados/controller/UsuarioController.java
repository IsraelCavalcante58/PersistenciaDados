package com.persistenciaDados.controller;

import com.persistenciaDados.model.Usuario;
import com.persistenciaDados.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    UsuarioService service;

    // Endpoints do usuário
    // Post para criar o usuário

    @PostMapping("/criar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }
}
