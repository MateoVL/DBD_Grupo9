package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion;

import java.util.List;

public interface ValoracionRepository {
    void crear(Valoracion valoracion);
    List<Valoracion> getAll();
    void update(Valoracion valoracion);
    void delete(int id_valoracion);
}
