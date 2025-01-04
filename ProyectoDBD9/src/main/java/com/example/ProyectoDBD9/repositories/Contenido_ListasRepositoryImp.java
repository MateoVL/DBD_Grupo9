package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Contenido_Listas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Contenido_ListasRepositoryImp implements Contenido_ListasRepository {
    private final Sql2o sql2o;

    @Autowired
    public Contenido_ListasRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Contenido_Listas contenido_Listas) {
        String sql = "INSERT INTO contenido_listas (id_lista, id_videojuego) VALUES (:id_lista, :id_videojuego)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_lista", contenido_Listas.getId_lista())
                    .addParameter("id_videojuego", contenido_Listas.getId_videojuego())
                    .executeUpdate();
        }
    }

    @Override
    public List<Contenido_Listas> getAll(){
        String sql = "SELECT * FROM contenido_listas";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Contenido_Listas.class);
        }
    }

    @Override
    public void delete(int id_lista, int id_videojuego) {
        String sql = "DELETE FROM contenido_listas WHERE id_lista = :id_lista AND id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_lista", id_lista)
                    .addParameter("id_videojuego", id_videojuego)
                    .executeUpdate();
        }
    }
}
