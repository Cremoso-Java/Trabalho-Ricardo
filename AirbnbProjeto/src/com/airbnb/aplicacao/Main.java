package com.airbnb.aplicacao;

import com.airbnb.entidades.Anfitriao;
import com.airbnb.entidades.Hospede;
import com.airbnb.repositorios.RepositorioAnfitriao;
import com.airbnb.repositorios.RepositorioHospede;
import com.airbnb.servicos.ServicoAnfitriao;
import com.airbnb.servicos.ServicoHospede;

public class Main {
    public static void main(String[] args) {
        RepositorioHospede repoHospede = new RepositorioHospede();
        ServicoHospede servicoHospede = new ServicoHospede(repoHospede);
        Hospede h1 = new Hospede("Carlos", 25, "carlos@email.com", "Cartão");
        servicoHospede.cadastrarHospede(h1);
        h1.exibirInformacoes();

        RepositorioAnfitriao repoAnfitriao = new RepositorioAnfitriao();
        ServicoAnfitriao servicoAnfitriao = new ServicoAnfitriao(repoAnfitriao);
        Anfitriao a1 = new Anfitriao("Maria", 30, "maria@email.com", "Rua das Flores");
        servicoAnfitriao.cadastrarAnfitriao(a1);
        a1.exibirInformacoes();
    }
}
