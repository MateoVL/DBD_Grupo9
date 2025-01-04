package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion_Usuario;

import java.util.List;

public interface Valoracion_UsuarioRepository {
    void crear(Valoracion_Usuario valoracion_Usuario);
    List<Valoracion_Usuario> getAll();
    //void update(Valoracion_Usuario valoracion_Usuario);
    void delete(int id_valoracion, int id_usuario);
}
