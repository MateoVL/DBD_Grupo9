package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Categoria;
import com.example.ProyectoDBD9.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class RolRepositoryImp implements RolRepository{
    private final Sql2o sql2o;

    @Autowired
    public RolRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Rol rol) {
        String sql = "INSERT INTO rol (id_rol, nombre_rol) VALUES (:id_rol, :nombre_rol)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_rol", rol.getId_rol())
                    .addParameter("nombre_rol", rol.getNombre_rol())
                    .executeUpdate();
        }
    }

    @Override
    public List<Rol> getAll(){
        String sql = "SELECT * FROM rol";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Rol.class);
        }
    }

    @Override
    public void update(Rol rol) {
        String sql = "UPDATE rol SET nombre_rol = :nombre_rol WHERE id_rol = :id_rol";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_rol", rol.getId_rol())
                    .addParameter("nombre_rol", rol.getNombre_rol())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_rol) {
        String sql = "DELETE FROM categoria WHERE id_rol = :id_rol";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_rol", id_rol)
                    .executeUpdate();
        }
    }
}
