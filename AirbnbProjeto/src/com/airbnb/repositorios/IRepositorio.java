package com.airbnb.repositorios;

import com.airbnb.entidades.Pessoa;
import java.util.List;

public interface IRepositorio<T extends Pessoa> {
    void adicionar(T pessoa);
    T buscarPorEmail(String email);
    List<T> listarTodos();
}
