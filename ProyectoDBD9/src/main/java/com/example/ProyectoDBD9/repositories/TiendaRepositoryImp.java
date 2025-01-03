package com.example.ProyectoDBD9.repositories;


import com.example.ProyectoDBD9.models.Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class TiendaRepositoryImp implements TiendaRepository {
    private final Sql2o sql2o;

    @Autowired
    public TiendaRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Tienda tienda) {
        String sql = "INSERT INTO categoria (id_tienda, nombre_tienda, ip_tienda, direccion_tienda, id_jefe, id_ubicacion) VALUES (:id_tienda, :nombre_tienda, :ip_tienda, :direccion_tienda, :id_jefe, :id_ubicacion)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_tienda", tienda.getIp_tienda())
                    .addParameter("nombre_tienda", tienda.getNombre_tienda())
                    .addParameter("ip_tienda", tienda.getIp_tienda())
                    .addParameter("direccion_tienda", tienda.getDireccion_tienda())
                    .addParameter("id_jefe", tienda.getId_jefe())
                    .addParameter("id_ubicacion", tienda.getId_ubicacion())
                    .executeUpdate();
        }
    }

    @Override
    public List<Tienda> getAll(){
        String sql = "SELECT * FROM tienda";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Tienda.class);
        }
    }

    @Override
    public void update(Tienda tienda) {
        String sql = "UPDATE tienda SET nombre_tienda = :nombre_tienda, ip_tienda=:ip_tienda, direccion_tienda=:direccion_tienda, id_jefe=:id_jefe, id_ubicacion=:id_ubicacion WHERE id_tienda = :id_tienda";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_tienda", tienda.getIp_tienda())
                    .addParameter("nombre_tienda", tienda.getNombre_tienda())
                    .addParameter("ip_tienda", tienda.getIp_tienda())
                    .addParameter("direccion_tienda", tienda.getDireccion_tienda())
                    .addParameter("id_jefe", tienda.getId_jefe())
                    .addParameter("id_ubicacion", tienda.getId_ubicacion())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_tienda) {
        String sql = "DELETE FROM tienda WHERE id_tienda = :id_tienda";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_tienda", id_tienda)
                    .executeUpdate();
        }
    }
}
