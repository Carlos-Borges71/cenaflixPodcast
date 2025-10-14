/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cenaflix.cenaflixpodcast.model;

import jakarta.persistence.*;

/**
 *
 * @author Carlos Borges
 */
@Entity
@Table(name = "podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nome_episodio;
    private int numero_episodio;
    private double duracao;
    private String url;
    
    public Podcast(){
        
    }

    public Podcast( String produtor, String nome_episodio, int numero_episodio, double duracao, String url) {
       
        this.produtor = produtor;
        this.nome_episodio = nome_episodio;
        this.numero_episodio = numero_episodio;
        this.duracao = duracao;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getNome_episodio() {
        return nome_episodio;
    }

    public int getNumero_episodio() {
        return numero_episodio;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public void setNome_episodio(String nome_episodio) {
        this.nome_episodio = nome_episodio;
    }

    public void setNumero(int numero_episodio) {
        this.numero_episodio = numero_episodio;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
