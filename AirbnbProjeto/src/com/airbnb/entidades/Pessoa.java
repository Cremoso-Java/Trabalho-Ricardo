package com.airbnb.entidades;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void exibirInformacoes();
}
