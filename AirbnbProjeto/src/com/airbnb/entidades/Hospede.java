package com.airbnb.entidades;

public class Hospede extends Pessoa {
    private String formaPagamento;

    public Hospede(String nome, int idade, String email, String formaPagamento) {
        super(nome, idade, email);
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Hóspede: " + nome + ", Idade: " + idade + ", Email: " + email + ", Pagamento: " + formaPagamento);
    }
}
