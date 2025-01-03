package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Tienda;

import java.util.List;

public interface TiendaRepository {
    void crear(Tienda tienda);
    List<Tienda> getAll();
    void update(Tienda tienda);
    void delete(int id_tienda);
}
