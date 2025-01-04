package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.models.Ranking_Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Ranking_VideojuegoRepositoryImp implements Ranking_VideojuegoRepository {
    private final Sql2o sql2o;

    @Autowired
    public Ranking_VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Ranking_Videojuego ranking_Videojuego) {
        String sql = "INSERT INTO ranking_videojuego (id_ranking, id_videojuego, puntos, fecha_ranking) VALUES (:id_ranking, :id_videojuego, :puntos, :fecha_ranking)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_ranking", ranking_Videojuego.getId_ranking())
                    .addParameter("id_videojuego", ranking_Videojuego.getId_videojuego())
                    .addParameter("puntos", ranking_Videojuego.getPuntos())
                    .addParameter("fecha_ranking", ranking_Videojuego.getFecha_ranking())
                    .executeUpdate();
        }
    }

    @Override
    public List<Ranking_Videojuego> getAll(){
        String sql = "SELECT * FROM ranking_videojuego";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Ranking_Videojuego.class);
        }
    }

    @Override
    public void update(Ranking_Videojuego ranking_Videojuego) {
        String sql = "UPDATE ranking_videojuego SET puntos = :puntos,  fecha_ranking=:fecha_ranking WHERE id_ranking = :id_ranking AND id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_ranking", ranking_Videojuego.getId_ranking())
                    .addParameter("id_videojuego", ranking_Videojuego.getId_videojuego())
                    .addParameter("puntos", ranking_Videojuego.getPuntos())
                    .addParameter("fecha_ranking", ranking_Videojuego.getFecha_ranking())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_ranking) {
        String sql = "DELETE FROM ranking_videojuego WHERE id_ranking = :id_ranking";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_ranking", id_ranking)
                    .executeUpdate();
        }
    }
}
