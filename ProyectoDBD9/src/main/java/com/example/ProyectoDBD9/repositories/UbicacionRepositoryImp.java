package com.example.ProyectoDBD9.repositories;


import com.example.ProyectoDBD9.models.Ubicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class UbicacionRepositoryImp implements UbicacionRepository {
    private final Sql2o sql2o;

    @Autowired
    public UbicacionRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }
    @Override
    public void crear(Ubicacion ubicacion) {
        String sql = "INSERT INTO ubicacion (Id_Ubicacion,Pais,Ciudad,Direccion) VALUES (:Id_Ubicacion, :Pais, :Ciudad, :Direccion)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("Id_Ubicacion", ubicacion.getId_Ubicacion())
                    .addParameter("Pais", ubicacion.getPais())
                    .addParameter("Ciudad", ubicacion.getCiudad())
                    .addParameter("Direccion", ubicacion.getDireccion())
                    .executeUpdate();
        }
    }
    @Override
    public List<Ubicacion> getAll(){
        String sql = "SELECT * FROM Ubicacion";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Ubicacion.class);
        }
    }
    @Override
    public void update(Ubicacion ubicacion) {
        String sql = "UPDATE Ubicacion SET Pais = :Pais, Ciudad=:Ciudad, Direccion=:Direccion WHERE Id_Ubicacion = :Id_Ubicacion";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("Id_Ubicacion", ubicacion.getId_Ubicacion())
                    .addParameter("Pais", ubicacion.getPais())
                    .addParameter("Ciudad", ubicacion.getCiudad())
                    .addParameter("Direccion", ubicacion.getDireccion())
                    .executeUpdate();
        }
    }
    @Override
    public void delete(int id_ubicacion) {
        String sql = "DELETE FROM ubicacion WHERE id_ubicacion = :id_ubicacion";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_ubicacion", id_ubicacion)
                    .executeUpdate();
        }
    }
}