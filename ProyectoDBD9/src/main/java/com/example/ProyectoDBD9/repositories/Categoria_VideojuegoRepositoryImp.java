package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Categoria_Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Categoria_VideojuegoRepositoryImp implements Categoria_VideojuegoRepository {
    private final Sql2o sql2o;

    @Autowired
    public Categoria_VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Categoria_Videojuego categoria_Videojuego) {
        String sql = "INSERT INTO categoria_videojuego (id_categoria, id_videojuego) VALUES (:id_categoria, :id_videojuego)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_categoria", categoria_Videojuego.getId_categoria())
                    .addParameter("id_videojuego", categoria_Videojuego.getId_videojuego())
                    .executeUpdate();
        }
    }

    @Override
    public List<Categoria_Videojuego> getAll(){
        String sql = "SELECT * FROM categoria_videojuego";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Categoria_Videojuego.class);
        }
    }

    @Override
    public void delete(int id_categoria, int id_videojuego) {
        String sql = "DELETE FROM categoria_Videojuego WHERE id_categoria = :id_categoria AND id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_categoria", id_categoria)
                    .addParameter("id_videojuego", id_videojuego)
                    .executeUpdate();
        }
    }
}
