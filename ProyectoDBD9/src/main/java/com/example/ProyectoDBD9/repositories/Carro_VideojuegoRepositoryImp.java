package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Carro_Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Carro_VideojuegoRepositoryImp implements Carro_VideojuegoRepository {
    private final Sql2o sql2o;

    @Autowired
    public Carro_VideojuegoRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Carro_Videojuego carro_Videojuego) {
        String sql = "INSERT INTO carro_videojuego (id_carro, id_videojuego, cantidad) VALUES (:id_carro, :id_videojuego, :cantidad)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", carro_Videojuego.getId_carro())
                    .addParameter("id_videojuego", carro_Videojuego.getId_videojuego())
                    .addParameter("cantidad", carro_Videojuego.getCantidad())
                    .executeUpdate();
        }
    }

    @Override
    public List<Carro_Videojuego> getAll(){
        String sql = "SELECT * FROM carro_videojuego";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Carro_Videojuego.class);
        }
    }

    @Override
    public void update(Carro_Videojuego carro_Videojuego) {
        String sql = "UPDATE carro_videojuego SET id_videojuego = :id_videojuego,  cantidad=:cantidad WHERE id_carro = :id_carro";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", carro_Videojuego.getId_carro())
                    .addParameter("id_videojuego", carro_Videojuego.getId_videojuego())
                    .addParameter("cantidad", carro_Videojuego.getCantidad())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_carro) {
        String sql = "DELETE FROM carro_videojuego WHERE id_carro = :id_carro";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", id_carro)
                    .executeUpdate();
        }
    }
}
