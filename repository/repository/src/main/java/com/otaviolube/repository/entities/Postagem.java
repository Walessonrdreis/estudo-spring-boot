package com.otaviolube.repository.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "post")

public class Postagem {

    @OneToOne(mappedBy = "category")
    private Set<Categoria> categorias;//Assim eu tenho um conjunto de categorias que estão relacionadas a uma postagem
    //e uma postagem pode ter muitas categorias 
    @ManyToMany
    private Set<Autor> autores;
  

}
