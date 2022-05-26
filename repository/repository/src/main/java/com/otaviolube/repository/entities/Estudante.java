package com.otaviolube.repository.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudantes")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String matricula;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projeto_id",nullable = false)//@JoinColumn indica qual é a coluna, na tabela do banco de dados, em que o id usado para associar as entidades está
    private Projeto projeto;

    //fazer gets e sets
}
