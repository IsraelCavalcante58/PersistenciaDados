package com.persistenciaDados.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity


@Table(name = "T_KEY")
public class Key {


    @Id
    @Column (name= "cd_key")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "vl_key")
    private String chave;

    @Column (name = "disponivel")
    private Boolean disponivel;

    @Column (name = "dt_ativacao")
    private LocalDateTime dataAtivacao;

    @Column (name = "dt_validade")
    private LocalDateTime dataValidade;

    @Column (name = "tmp_duracao_dia")
    private int tempoDuracaoDia;





}
