package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Ranking_Videojuego;

import java.util.List;

public interface Ranking_VideojuegoRepository {
    void crear(Ranking_Videojuego ranking_Videojuego);
    List<Ranking_Videojuego> getAll();
    void update(Ranking_Videojuego ranking_Videojuego);
    void delete(int id_ranking);
}
