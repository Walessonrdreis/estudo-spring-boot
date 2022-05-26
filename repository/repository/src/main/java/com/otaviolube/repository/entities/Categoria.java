package com.otaviolube.repository.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "category")

public class Categoria {

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Postagem postagem;

    public Categoria(){

    }

  /*  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
*/
}
