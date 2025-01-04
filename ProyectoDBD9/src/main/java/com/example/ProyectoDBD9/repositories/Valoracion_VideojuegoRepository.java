package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion_Videojuego;

import java.util.List;

public interface Valoracion_VideojuegoRepository {
    void crear(Valoracion_Videojuego valoracion_Videojuego);
    List<Valoracion_Videojuego> getAll();
    //void update(Valoracion_Videojuego valoracion_Videojuego);
    void delete(int id_valoracion, int id_videojuego);
}
