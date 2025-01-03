package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void crear(Usuario usuario);
    List<Usuario> getAll();
    void update(Usuario usuario);
    void delete(int id_usuario);
}
