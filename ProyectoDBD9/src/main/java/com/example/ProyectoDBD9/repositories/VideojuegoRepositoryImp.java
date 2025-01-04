package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Date;
import java.util.List;

@Repository
public class VideojuegoRepositoryImp implements VideojuegoRepository {

    private final Sql2o sql2o;

    @Autowired
    public VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Videojuego videojuego) {
        String sql = "INSERT INTO videojuego (id_videojuego, nombre_videojuego, url_videojuego, descripcion_videojuego, precio_videojuego, num_ventas_videojuego, fecha_lanzamiento_videojuego) VALUES (:id_videojuego, :nombre_videojuego, :url_videojuego, :descripcion_videojuego, :precio_videojuego, :num_ventas_videojuego, :fecha_lanzamiento_videojuego)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", videojuego.getId_videojuego())
                    .addParameter("nombre_videojuego", videojuego.getNombre_videojuego())
                    .addParameter("url_videojuego",videojuego.getUrl_videojuego())
                    .addParameter("descripcion_videojuego",videojuego.getDescripcion_videojuego())
                    .addParameter("precio_videojuego",videojuego.getPrecio_videojuego())
                    .addParameter("num_ventas_videojuego",videojuego.getNum_ventas_videojuego())
                    .addParameter("fecha_lanzamiento_videojuego",videojuego.getFecha_lanzamiento_videojuego())
                    .executeUpdate();
        }
    }

    @Override
    public List<Videojuego> getAll(){
        String sql = "SELECT * FROM videojuego";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Videojuego.class);
        }
    }

    @Override
    public void update(Videojuego videojuego) {
        String sql = "UPDATE videojuego SET nombre_videojuego = :nombre_videojuego, url_videojuego=:url_videojuego, descripcion_videojuego=:descripcion_videojuego, precio_videojuego=:precio_videojuego, num_ventas_videojuego=:num_ventas_videojuego, fecha_lanzamiento_videojuego=:fecha_lanzamiento_videojuego WHERE id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", videojuego.getId_videojuego())
                    .addParameter("nombre_videojuego", videojuego.getNombre_videojuego())
                    .addParameter("url_videojuego",videojuego.getUrl_videojuego())
                    .addParameter("descripcion_videojuego",videojuego.getDescripcion_videojuego())
                    .addParameter("precio_videojuego",videojuego.getPrecio_videojuego())
                    .addParameter("num_ventas_videojuego",videojuego.getNum_ventas_videojuego())
                    .addParameter("fecha_lanzamiento_videojuego",videojuego.getFecha_lanzamiento_videojuego())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_videojuego) {
        String sql = "DELETE FROM videojuego WHERE id_videojuego = :id_videojuego";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", id_videojuego)
                    .executeUpdate();
        }
    }

}
