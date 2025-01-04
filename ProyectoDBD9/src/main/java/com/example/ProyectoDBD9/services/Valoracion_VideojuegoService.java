package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Valoracion_Videojuego;
import com.example.ProyectoDBD9.repositories.Valoracion_VideojuegoRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Valoracion_VideojuegoService {
    private final Valoracion_VideojuegoRepositoryImp valoracion_VideojuegoRepositoryImp;

    @Autowired
    public Valoracion_VideojuegoService(Valoracion_VideojuegoRepositoryImp valoracion_VideojuegoRepositoryImp) {
        this.valoracion_VideojuegoRepositoryImp = valoracion_VideojuegoRepositoryImp;
    }

    public boolean crear(Valoracion_Videojuego valoracion_Videojuego) {
        valoracion_VideojuegoRepositoryImp.crear(valoracion_Videojuego);
        return true;
    }

    public List<Valoracion_Videojuego> getAll() {
        return valoracion_VideojuegoRepositoryImp.getAll();
    }

    public void delete(int id_valoracion, int id_videojuego) {valoracion_VideojuegoRepositoryImp.delete(id_valoracion, id_videojuego);}
}
