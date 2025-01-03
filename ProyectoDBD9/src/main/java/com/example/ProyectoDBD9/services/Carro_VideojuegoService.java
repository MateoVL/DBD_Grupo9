package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Carro_Videojuego;
import com.example.ProyectoDBD9.repositories.Carro_VideojuegoRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carro_VideojuegoService {
    private final Carro_VideojuegoRepositoryImp carro_VideojuegoRepositoryImp;

    @Autowired
    public Carro_VideojuegoService(Carro_VideojuegoRepositoryImp carro_VideojuegoRepositoryImp) {
        this.carro_VideojuegoRepositoryImp = carro_VideojuegoRepositoryImp;
    }

    public boolean crear(Carro_Videojuego carro_Videojuego) {
        carro_VideojuegoRepositoryImp.crear(carro_Videojuego);
        return true;
    }

    public List<Carro_Videojuego> getAll() {
        return carro_VideojuegoRepositoryImp.getAll();
    }

    public void update(Carro_Videojuego carro_Videojuego) {
        carro_VideojuegoRepositoryImp.update(carro_Videojuego);
    }

    public void delete(int id_carro) {carro_VideojuegoRepositoryImp.delete(id_carro);}
}
