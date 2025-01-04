package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Contenido_Listas;
import com.example.ProyectoDBD9.repositories.Contenido_ListasRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Contenido_ListasService {
    private final Contenido_ListasRepositoryImp contenido_ListasRepositoryImp;

    @Autowired
    public Contenido_ListasService(Contenido_ListasRepositoryImp contenido_ListasRepositoryImp) {
        this.contenido_ListasRepositoryImp = contenido_ListasRepositoryImp;
    }

    public boolean crear(Contenido_Listas contenido_Listas) {
        contenido_ListasRepositoryImp.crear(contenido_Listas);
        return true;
    }

    public List<Contenido_Listas> getAll() {
        return contenido_ListasRepositoryImp.getAll();
    }

    public void delete(int id_lista, int id_videojuego) {contenido_ListasRepositoryImp.delete(id_lista, id_videojuego);}
}
