package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Ranking_Videojuego;
import com.example.ProyectoDBD9.repositories.Ranking_VideojuegoRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ranking_VideojuegoService {
    private final Ranking_VideojuegoRepositoryImp ranking_VideojuegoRepositoryImp;

    @Autowired
    public Ranking_VideojuegoService(Ranking_VideojuegoRepositoryImp ranking_VideojuegoRepositoryImp) {
        this.ranking_VideojuegoRepositoryImp = ranking_VideojuegoRepositoryImp;
    }

    public boolean crear(Ranking_Videojuego ranking_Videojuego) {
        ranking_VideojuegoRepositoryImp.crear(ranking_Videojuego);
        return true;
    }

    public List<Ranking_Videojuego> getAll() {
        return ranking_VideojuegoRepositoryImp.getAll();
    }

    public void update(Ranking_Videojuego ranking_Videojuego) {
        ranking_VideojuegoRepositoryImp.update(ranking_Videojuego);
    }

    public void delete(int id_ranking) {ranking_VideojuegoRepositoryImp.delete(id_ranking);}
}
