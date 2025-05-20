package com.airbnb.servicos;

import com.airbnb.entidades.Anfitriao;
import com.airbnb.repositorios.RepositorioAnfitriao;

public class ServicoAnfitriao extends ServicoPessoa {
    private RepositorioAnfitriao repositorio;

    public ServicoAnfitriao(RepositorioAnfitriao repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrarAnfitriao(Anfitriao anfitriao) {
        repositorio.adicionar(anfitriao);
    }

    public Anfitriao buscarAnfitriaoPorEmail(String email) {
        return repositorio.buscarPorEmail(email);
    }
}
