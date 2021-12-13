package com.persistenciaDados.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "T_USUARIO")
public class Usuario {

    @Id
    @Column (name = "cd_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario")
    private String login;

    @Column(name = "senha_usuario")
    private String senha;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "cd_key", referencedColumnName = "cd_key")
    private Key key;


}
