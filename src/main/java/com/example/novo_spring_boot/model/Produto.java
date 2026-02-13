package com.example.novo_spring_boot.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    public Produto(){}

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor para Testes e Update (produto existente)
    public Produto(Long id, String nome, Double preco) {
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    }

    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
