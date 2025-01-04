package com.example.ProyectoDBD9.repositories;


import com.example.ProyectoDBD9.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class CategoriaRepositoryImp implements CategoriaRepository {
    private final Sql2o sql2o;

    @Autowired
    public CategoriaRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Categoria categoria) {
        String sql = "INSERT INTO categoria (id_categoria, nombre_categoria) VALUES (:id_categoria, :nombre_categoria)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_categoria", categoria.getIdCategoria())
                    .addParameter("nombre_categoria", categoria.getNombreCategoria())
                    .executeUpdate();
        }
    }

    @Override
    public List<Categoria> getAll(){
        String sql = "SELECT * FROM categoria";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Categoria.class);
        }
    }

    @Override
    public void update(Categoria categoria) {
        String sql = "UPDATE categoria SET nombre_categoria = :nombre_categoria WHERE id_categoria = :id_categoria";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_categoria", categoria.getIdCategoria())
                    .addParameter("nombre_categoria", categoria.getNombreCategoria())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_categoria) {
        String sql = "DELETE FROM categoria AS c, categoria_videojuego AS cv WHERE c.id_categoria = :id_categoria and cv.id_categoria = :id_categoria";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_categoria", id_categoria)
                    .executeUpdate();
        }
    }
}
