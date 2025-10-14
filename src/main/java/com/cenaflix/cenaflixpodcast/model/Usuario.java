/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cenaflix.cenaflixpodcast.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Carlos Borges
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_usuario;
    private String senha;
    private String tipo; // "Administrador", "Operador" ou "Usuário"
    
    public Usuario(){
        
    }

    public Usuario(String nome, String senha, String tipo) {
        this.nome_usuario = nome;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getNome() { 
        return nome_usuario; 
    }
    public String getSenha() {
        return senha; 
    }
    public String getTipo() {
        return tipo; 
    }

    public void setNome(String nome) {
        this.nome_usuario = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

