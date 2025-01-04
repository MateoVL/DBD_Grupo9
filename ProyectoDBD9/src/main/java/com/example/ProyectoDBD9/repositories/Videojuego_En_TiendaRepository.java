package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego_En_Tienda;

import java.util.List;

public interface Videojuego_En_TiendaRepository {
    void crear(Videojuego_En_Tienda videojuego_En_Tienda);
    List<Videojuego_En_Tienda> getAll();
    void update(Videojuego_En_Tienda videojuego_En_Tienda);
    void delete(int id_videojuego, int id_tienda);
}
