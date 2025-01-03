package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Carro_Videojuego;

import java.util.List;

public interface Carro_VideojuegoRepository {
    void crear(Carro_Videojuego carro_Videojuego);
    List<Carro_Videojuego> getAll();
    void update(Carro_Videojuego carro_Videojuego);
    void delete(int id_carro);
}
