package com.persistenciaDados.controller;

import com.persistenciaDados.model.Key;
import com.persistenciaDados.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/key")
public class KeyController {


    @Autowired
    KeyService service;



    @PostMapping("/criar")
    public Key criarKey(@RequestBody Key key) {
        return service.salvar(key);
    }
}
