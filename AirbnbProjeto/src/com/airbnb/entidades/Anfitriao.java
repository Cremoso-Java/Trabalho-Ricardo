package com.airbnb.entidades;

public class Anfitriao extends Pessoa {
    private String endereco;

    public Anfitriao(String nome, int idade, String email, String endereco) {
        super(nome, idade, email);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Anfitrião: " + nome + ", Idade: " + idade + ", Email: " + email + ", Endereço: " + endereco);
    }
}
