package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego;

import java.util.List;

public interface VideojuegoRepository {
    void crear(Videojuego videojuego);
    List<Videojuego> getAll();
    void update(Videojuego videojuego);
    void delete(int id_videojuego);
}
