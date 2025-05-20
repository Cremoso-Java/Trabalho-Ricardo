package com.airbnb.repositorios;

import com.airbnb.entidades.Hospede;
import java.util.ArrayList;
import java.util.List;

public class RepositorioHospede implements IRepositorio<Hospede> {
    private List<Hospede> hospedes = new ArrayList<>();

    public void adicionar(Hospede hospede) {
        hospedes.add(hospede);
    }

    public Hospede buscarPorEmail(String email) {
        for (Hospede h : hospedes) {
            if (h.getEmail().equals(email)) return h;
        }
        return null;
    }

    public List<Hospede> listarTodos() {
        return hospedes;
    }
}
