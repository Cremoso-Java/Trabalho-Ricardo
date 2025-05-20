package com.airbnb.repositorios;

import com.airbnb.entidades.Anfitriao;
import java.util.ArrayList;
import java.util.List;

public class RepositorioAnfitriao implements IRepositorio<Anfitriao> {
    private List<Anfitriao> anfitrioes = new ArrayList<>();

    public void adicionar(Anfitriao anfitriao) {
        anfitrioes.add(anfitriao);
    }

    public Anfitriao buscarPorEmail(String email) {
        for (Anfitriao a : anfitrioes) {
            if (a.getEmail().equals(email)) return a;
        }
        return null;
    }

    public List<Anfitriao> listarTodos() {
        return anfitrioes;
    }
}
