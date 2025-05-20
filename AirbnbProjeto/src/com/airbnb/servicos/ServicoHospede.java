package com.airbnb.servicos;

import com.airbnb.entidades.Hospede;
import com.airbnb.repositorios.RepositorioHospede;

public class ServicoHospede extends ServicoPessoa {
    private RepositorioHospede repositorio;

    public ServicoHospede(RepositorioHospede repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrarHospede(Hospede hospede) {
        repositorio.adicionar(hospede);
    }

    public Hospede buscarHospedePorEmail(String email) {
        return repositorio.buscarPorEmail(email);
    }
}
