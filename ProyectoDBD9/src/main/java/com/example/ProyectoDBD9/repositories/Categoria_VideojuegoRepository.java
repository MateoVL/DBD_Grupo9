package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Categoria_Videojuego;

import java.util.List;

public interface Categoria_VideojuegoRepository {
    void crear(Categoria_Videojuego categoria_Videojuego);
    List<Categoria_Videojuego> getAll();
    //void update(Categoria_Videojuego categoria_Videojuego);
    void delete(int id_categoria, int id_videojuego);
}
