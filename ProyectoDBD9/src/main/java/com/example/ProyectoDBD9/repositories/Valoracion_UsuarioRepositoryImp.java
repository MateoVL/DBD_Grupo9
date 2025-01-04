package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Valoracion_UsuarioRepositoryImp implements Valoracion_UsuarioRepository {
    private final Sql2o sql2o;

    @Autowired
    public Valoracion_UsuarioRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Valoracion_Usuario valoracion_Usuario) {
        String sql = "INSERT INTO valoracion_usuario (id_valoracion, id_usuario) VALUES (:id_valoracion, :id_usuario)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", valoracion_Usuario.getId_valoracion())
                    .addParameter("id_usuario", valoracion_Usuario.getId_usuario())
                    .executeUpdate();
        }
    }

    @Override
    public List<Valoracion_Usuario> getAll(){
        String sql = "SELECT * FROM valoracion_usuario";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Valoracion_Usuario.class);
        }
    }

    @Override
    public void delete(int id_valoracion, int id_usuario) {
        String sql = "DELETE FROM valoracion_usuario WHERE id_valoracion = :id_valoracion AND id_usuario = :id_usuario";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", id_valoracion)
                    .addParameter("id_usuario", id_usuario)
                    .executeUpdate();
        }
    }
}
