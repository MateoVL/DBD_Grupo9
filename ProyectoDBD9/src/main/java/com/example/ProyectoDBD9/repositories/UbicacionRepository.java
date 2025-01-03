package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Carro_Compra;

import java.util.List;


public interface UbicacionRepository {
    void crear(Ubicacion ubicacion);
    List<Ubicacion> getAll();
    void update(bicacion ubicacion);
    void delete(int id_carro);
}