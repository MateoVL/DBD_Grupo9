package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Categoria_Videojuego;
import com.example.ProyectoDBD9.repositories.Categoria_VideojuegoRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categoria_VideojuegoService {
    private final Categoria_VideojuegoRepositoryImp categoria_VideojuegoRepositoryImp;

    @Autowired
    public Categoria_VideojuegoService(Categoria_VideojuegoRepositoryImp categoria_VideojuegoRepositoryImp) {
        this.categoria_VideojuegoRepositoryImp = categoria_VideojuegoRepositoryImp;
    }

    public boolean crear(Categoria_Videojuego categoria_Videojuego) {
        categoria_VideojuegoRepositoryImp.crear(categoria_Videojuego);
        return true;
    }

    public List<Categoria_Videojuego> getAll() {
        return categoria_VideojuegoRepositoryImp.getAll();
    }

    public void delete(int id_categoria, int id_videojuego) {categoria_VideojuegoRepositoryImp.delete(id_categoria, id_videojuego);}
}
