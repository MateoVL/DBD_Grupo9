package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Categoria;

import java.util.List;

public interface CategoriaRepository {
    void crear(Categoria categoria);
    List<Categoria> getAll();
    void update(Categoria categoria);
    void delete(int id_categoria);
}
