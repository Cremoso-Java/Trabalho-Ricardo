package com.airbnb.servicos;

import com.airbnb.entidades.Pessoa;

public class ServicoPessoa {
    public void atualizarEmail(Pessoa pessoa, String novoEmail) {
        pessoa.setEmail(novoEmail);
    }

    public void atualizarIdade(Pessoa pessoa, int novaIdade) {
        pessoa.setIdade(novaIdade);
    }
}
