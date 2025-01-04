package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class ValoracionRepositoryImp implements ValoracionRepository {
    private final Sql2o sql2o;

    @Autowired
    public ValoracionRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Valoracion valoracion) {
        String sql = "INSERT INTO boleta (id_valoracion, descripcion_valoracion, puntuacion_valoracion, fecha_valoracion) VALUES (:id_valoracion, :descripcion_valoracion, :puntuacion_valoracion, :fecha_valoracion)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", valoracion.getId_valoracion())
                    .addParameter("descripcion_valoracion", valoracion.getDescripcion_valoracion())
                    .addParameter("puntuacion_valoracion", valoracion.getPuntuacion_valoracion())
                    .addParameter("fecha_valoracion", valoracion.getFecha_valoracion())
                    .executeUpdate();
        }
    }

    @Override
    public List<Valoracion> getAll(){
        String sql = "SELECT * FROM valoracion";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Valoracion.class);
        }
    }

    @Override
    public void update(Valoracion valoracion) {
        String sql = "UPDATE valoracion SET descripcion_valoracion = :descripcion_valoracion,  puntuacion_valoracion=:puntuacion_valoracion, fecha_valoracion=:fecha_valoracion WHERE id_valoracion = :id_valoracion";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", valoracion.getId_valoracion())
                    .addParameter("descripcion_valoracion", valoracion.getDescripcion_valoracion())
                    .addParameter("puntuacion_valoracion", valoracion.getPuntuacion_valoracion())
                    .addParameter("fecha_valoracion", valoracion.getFecha_valoracion())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_valoracion) {
        String sql = "DELETE FROM valoracion WHERE id_valoracion = :id_valoracion";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_valoracion", id_valoracion)
                    .executeUpdate();
        }
    }
}
