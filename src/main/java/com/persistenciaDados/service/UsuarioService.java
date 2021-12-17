package com.persistenciaDados.service;

import com.persistenciaDados.model.Key;
import com.persistenciaDados.model.Usuario;
import com.persistenciaDados.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

    @Autowired
    KeyService keyService;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        Usuario login = usuarioRepository.findByLogin(usuario.getLogin());
        if (login != null) {
            System.out.println("Login já cadastrado: " + login);

            return null;
        }
        Key key = keyService.buscarPorKey(usuario.getKey().getChave());
        if (key != null && key.getDisponivel() == true) {
            key.setDisponivel(false);
            keyService.editarKey(key); // Key editada
            usuario.setKey(key);
            return usuarioRepository.save(usuario);
        }
        return null;
    }
}
