package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego_Usuario;

import java.util.List;

public interface Videojuego_UsuarioRepository {
    void crear(Videojuego_Usuario videojuego_Usuario);
    List<Videojuego_Usuario> getAll();
    //void update(Videojuego_Usuario videojuego_Usuario);
    void delete(int id_videojuego, int id_usuario);
}
