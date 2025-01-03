package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Boleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class BoletaRepositoryImp implements BoletaRepository {
    private final Sql2o sql2o;

    @Autowired
    public BoletaRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Boleta boleta) {
        String sql = "INSERT INTO boleta (id_boleta, nombre_vendedor, nombre_comprador, precio_total, fecha_compra) VALUES (:id_boleta, :nombre_vendedor, :nombre_comprador, :precio_total, :fecha_compra)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_boleta", boleta.getId_boleta())
                    .addParameter("nombre_vendedor", boleta.getNombre_vendedor())
                    .addParameter("nombre_comprador", boleta.getNombre_comprador())
                    .addParameter("precio_total", boleta.getPrecio_total())
                    .addParameter("fecha_compra", boleta.getFecha_compra())
                    .executeUpdate();
        }
    }

    @Override
    public List<Boleta> getAll(){
        String sql = "SELECT * FROM boleta";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Boleta.class);
        }
    }

    @Override
    public void update(Boleta boleta) {
        String sql = "UPDATE boleta SET nombre_vendedor = :nombre_vendedor,  nombre_comprador=:nombre_comprador, precio_total=:precio_total, fecha_compra=:fecha_compra WHERE id_boleta = :id_boleta";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_boleta", boleta.getId_boleta())
                    .addParameter("nombre_vendedor", boleta.getNombre_vendedor())
                    .addParameter("nombre_comprador", boleta.getNombre_comprador())
                    .addParameter("precio_total", boleta.getPrecio_total())
                    .addParameter("fecha_compra", boleta.getFecha_compra())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_boleta) {
        String sql = "DELETE FROM boleta WHERE id_boleta = :id_boleta";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_boleta", id_boleta)
                    .executeUpdate();
        }
    }
}
