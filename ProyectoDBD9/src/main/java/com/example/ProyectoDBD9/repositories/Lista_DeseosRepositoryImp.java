package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Lista_Deseos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Lista_DeseosRepositoryImp implements Lista_DeseosRepository {
    private final Sql2o sql2o;

    @Autowired
    public Lista_DeseosRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Lista_Deseos lista_Deseos) {
        String sql = "INSERT INTO lista_deseos (id_lista_deseos, id_usuario) VALUES (:id_lista_deseos, :id_usuario)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_lista_deseos", lista_Deseos.getId_lista_deseos())
                    .addParameter("id_usuario", lista_Deseos.getId_usuario())
                    .executeUpdate();
        }
    }

    @Override
    public List<Lista_Deseos> getAll(){
        String sql = "SELECT * FROM lista_deseos";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Lista_Deseos.class);
        }
    }

    @Override
    public void delete(int id_lista_deseos, int id_usuario) {
        String sql = "DELETE FROM lista_deseos WHERE id_lista_deseos = :id_lista_deseos AND id_usuario = :id_usuario";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_lista_deseos", id_lista_deseos)
                    .addParameter("id_usuario", id_usuario)
                    .executeUpdate();
        }
    }
}
