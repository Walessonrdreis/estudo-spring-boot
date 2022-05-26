package com.otaviolube.repository.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String subtitulo;
    private String tema;

    @OneToOne(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        mappedBy = "projetos")
        private Estudante estudante;

    
}
