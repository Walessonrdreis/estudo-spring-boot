package com.otaviolube.repository.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Carro {

    private long id;
    private String nome;
    @Id//anotação de chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
 
}
