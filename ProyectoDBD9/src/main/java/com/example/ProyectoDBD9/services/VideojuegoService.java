package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Videojuego;
import com.example.ProyectoDBD9.repositories.VideojuegoRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {
    private final VideojuegoRepositoryImp videojuegoRepositoryImp;

    @Autowired
    public VideojuegoService(VideojuegoRepositoryImp videojuegoRepositoryImp) {
        this.videojuegoRepositoryImp = videojuegoRepositoryImp;
    }

    public boolean crear(Videojuego videojuego) {
        videojuegoRepositoryImp.crear(videojuego);
        return true;
    }

    public List<Videojuego> getAll() {
        return videojuegoRepositoryImp.getAll();
    }

    public void update(Videojuego videojuego) {
        videojuegoRepositoryImp.update(videojuego);
    }

    public void delete(int id_videojuego) {
        videojuegoRepositoryImp.delete(id_videojuego);
    }
}