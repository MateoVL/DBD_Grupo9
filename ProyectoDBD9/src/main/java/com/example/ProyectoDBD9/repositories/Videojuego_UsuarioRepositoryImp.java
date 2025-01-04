package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Videojuego_UsuarioRepositoryImp implements Videojuego_UsuarioRepository {
    private final Sql2o sql2o;

    @Autowired
    public Videojuego_UsuarioRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Videojuego_Usuario videojuego_Usuario) {
        String sql = "INSERT INTO videojuego_usuario (id_videojuego, id_usuario) VALUES (:id_videojuego, :id_usuario)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", videojuego_Usuario.getId_videojuego())
                    .addParameter("id_usuario", videojuego_Usuario.getId_usuario())
                    .executeUpdate();
        }
    }

    @Override
    public List<Videojuego_Usuario> getAll(){
        String sql = "SELECT * FROM videojuego_usuario";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Videojuego_Usuario.class);
        }
    }

    @Override
    public void delete(int id_videojuego, int id_usuario) {
        String sql = "DELETE FROM videojuego_usuario WHERE id_videojuego = :id_videojuego AND id_usuario = :id_usuario";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", id_videojuego)
                    .addParameter("id_usuario", id_usuario)
                    .executeUpdate();
        }
    }
}
