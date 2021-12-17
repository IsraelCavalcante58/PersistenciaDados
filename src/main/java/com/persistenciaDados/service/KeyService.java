package com.persistenciaDados.service;

import com.persistenciaDados.model.Key;
import com.persistenciaDados.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyService {

    @Autowired
    KeyRepository keyRepository;

    public Key salvar(Key key){
        Key keySalva = keyRepository.findByChave(key.getChave());
        if (keySalva != null){
            System.out.println("Essa key já está no banco de dados.");
            return null;
        }
        key.setDisponivel(true);
        return keyRepository.save(key);
    }

    public Key buscarPorKey(String key){
        return keyRepository.findByChave(key);
    }

    public Key editarKey(Key keyEditada){
        Key keySalva = keyRepository.findByChave(keyEditada.getChave());
        keySalva.setDisponivel(keyEditada.getDisponivel());
        return keyRepository.save(keySalva);
    }
}
