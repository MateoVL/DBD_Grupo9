package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Compra;

import java.util.List;

public interface CompraRepository {
    void crear(Compra compra);
    List<Compra> getAll();
    void update(Compra compra);
    void delete(int id_compra);
}
