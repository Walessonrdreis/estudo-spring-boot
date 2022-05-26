package com.otaviolube.repository.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pessoa {
    private long id;
    private String nome;
    private LocalDate dataNascimento;

    private Pessoa(){//construtor da classe

    }
    //construtor publico para inicializar a classe, sobrescrever esse construtor 
    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)//a estrategia de geração do nosso id, será baseado na sequencia de nossos id
    @Column(name = "pessoa_id")
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    @Column
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Column
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    //Sobrescrita do método toString, sobrecarregar, porque? porque eu quero que o toString dessa classe faça algo diferente, ele vai dar um retorno de todos os dados da pessoa
    @Override
    public String toString(){
        return "Pessoa { " + 
        "id= " + id + 
        ", nome = " + nome + ", data de nascimento =  " + dataNascimento + "}" ;
    }

}
