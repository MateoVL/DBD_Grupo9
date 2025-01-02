package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Videojuego;
import com.example.ProyectoDBD9.repositories.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {
    private final VideojuegoRepository videojuegoRepository;

    @Autowired
    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> getAll() {
        return videojuegoRepository.getAll();
    }
}