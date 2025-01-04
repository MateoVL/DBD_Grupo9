package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Contenido_Listas;

import java.util.List;

public interface Contenido_ListasRepository {
    void crear(Contenido_Listas contenido_Listas);
    List<Contenido_Listas> getAll();
    //void update(Contenido_Listas contenido_Listas);
    void delete(int id_lista, int id_videojuego);
}
