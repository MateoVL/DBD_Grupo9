package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Rol;

import java.util.List;

public interface RolRepository {
    void crear(Rol rol);
    List<Rol> getAll();
    void update(Rol rol);
    void delete(int id_rol);
}
