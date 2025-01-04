package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Ubicacion;

import java.util.List;


public interface UbicacionRepository {
    void crear(Ubicacion ubicacion);
    List<Ubicacion> getAll();
    void update(Ubicacion ubicacion);
    void delete(int Id_Ubicacion);
}