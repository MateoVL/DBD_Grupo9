package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Lista_Deseos;

import java.util.List;

public interface Lista_DeseosRepository {
    void crear(Lista_Deseos lista_Deseos);
    List<Lista_Deseos> getAll();
    //void update(Lista_Deseos lista_Deseos);
    void delete(int id_lista_deseos, int id_usuario);
}
