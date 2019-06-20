package com.example.phonebook.Modelo;

import java.io.Serializable;

public class Contato implements Serializable {

    private int id;
    private String numero;
    private String nome;
    private String email;
    private String imagem;
    private int excluido;

    public Contato(int id, String numero, String nome, String email, String imagem, int excluido) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.email = email;
        this.imagem = imagem;
        this.excluido = excluido;
    }

    public Contato() {
        this.id = 0;
        this.numero = "";
        this.nome = "";
        this.email = "";
        this.imagem = "";
        this.excluido = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getExcluido() {
        return excluido;
    }

    public void setExcluido(int excluido) {
        this.excluido = excluido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
