package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Videojuego_En_Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Videojuego_En_TiendaRepositoryImp implements Videojuego_En_TiendaRepository {
    private final Sql2o sql2o;

    @Autowired
    public Videojuego_En_TiendaRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Videojuego_En_Tienda videojuego_En_Tienda) {
        String sql = "INSERT INTO videojuego_en_tienda (id_videojuego, id_tienda, stock) VALUES (:id_videojuego, :id_tienda, :stock)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", videojuego_En_Tienda.getId_videojuego())
                    .addParameter("id_tienda", videojuego_En_Tienda.getId_tienda())
                    .addParameter("stock",videojuego_En_Tienda.getId_tienda())
                    .executeUpdate();
        }
    }

    @Override
    public List<Videojuego_En_Tienda> getAll(){
        String sql = "SELECT * FROM videojuego_en_tienda";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Videojuego_En_Tienda.class);
        }
    }

    @Override
    public void update(Videojuego_En_Tienda videojuego_En_Tienda) {
        String sql = "UPDATE videojuego_en_tienda SET stock=:stock WHERE id_videojuego = :id_videojuego AND id_tienda = :id_tienda";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", videojuego_En_Tienda.getId_videojuego())
                    .addParameter("id_tienda", videojuego_En_Tienda.getId_tienda())
                    .addParameter("stock",videojuego_En_Tienda.getId_tienda())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_videojuego, int id_tienda) {
        String sql = "DELETE FROM videojuego_en_tienda WHERE id_videojuego = :id_videojuego AND id_tienda = :id_tienda";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_videojuego", id_videojuego)
                    .addParameter("id_tienda", id_tienda)
                    .executeUpdate();
        }
    }
}
