package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion_Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Valoracion_VideojuegoRepositoryImp implements Valoracion_VideojuegoRepository {
    private final Sql2o sql2o;

    @Autowired
    public Valoracion_VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Valoracion_Videojuego valoracion_Videojuego) {
        String sql = "INSERT INTO valoracion_videojuego (id_valoracion, id_videojuego) VALUES (:id_valoracion, :id_videojuego)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", valoracion_Videojuego.getId_valoracion())
                    .addParameter("id_videojuego", valoracion_Videojuego.getId_videojuego())
                    .executeUpdate();
        }
    }

    @Override
    public List<Valoracion_Videojuego> getAll(){
        String sql = "SELECT * FROM valoracion_videojuego";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Valoracion_Videojuego.class);
        }
    }

    @Override
    public void delete(int id_valoracion, int id_videojuego) {
        String sql = "DELETE FROM valoracion_videojuego WHERE id_valoracion = :id_valoracion AND id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", id_valoracion)
                    .addParameter("id_videojuego", id_videojuego)
                    .executeUpdate();
        }
    }
}
