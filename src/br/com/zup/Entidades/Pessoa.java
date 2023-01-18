package br.com.zup.Entidades;

public abstract class Pessoa {

    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

// Classe Abstrata porque não será instanciada
