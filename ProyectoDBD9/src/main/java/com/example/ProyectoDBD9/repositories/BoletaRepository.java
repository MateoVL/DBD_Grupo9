package com.example.ProyectoDBD9.repositories;


import com.example.ProyectoDBD9.models.Boleta;

import java.util.List;

public interface BoletaRepository {
    void crear(Boleta boleta);
    List<Boleta> getAll();
    void update(Boleta boleta);
    void delete(int id_boleta);
}
