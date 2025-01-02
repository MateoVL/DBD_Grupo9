package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class VideojuegoRepositoryImp implements VideojuegoRepository {

    private final Sql2o sql2o;

    @Autowired
    public VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public List<Videojuego> getAll(){
        try (Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM videojuego").executeAndFetch(Videojuego.class);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
