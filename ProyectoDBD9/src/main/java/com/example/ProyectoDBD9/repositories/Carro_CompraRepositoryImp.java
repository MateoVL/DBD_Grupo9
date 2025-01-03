package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Carro_Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Carro_CompraRepositoryImp implements Carro_CompraRepository {
    private final Sql2o sql2o;

    @Autowired
    public Carro_CompraRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Carro_Compra carro_Compra) {
        String sql = "INSERT INTO carro_compra (id_carro, fecha_creacion_carro, estado_carro, id_usuario) VALUES (:id_carro, :fecha_creacion_carro, :estado_carro, :id_usuario)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", carro_Compra.getId_carro())
                    .addParameter("fecha_creacion_carro", carro_Compra.getFecha_creacion_carro())
                    .addParameter("estado_carro", carro_Compra.getEstado_carro())
                    .addParameter("id_usuario", carro_Compra.getId_usuario())
                    .executeUpdate();
        }
    }

    @Override
    public List<Carro_Compra> getAll(){
        String sql = "SELECT * FROM carro_compra";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Carro_Compra.class);
        }
    }

    @Override
    public void update(Carro_Compra carro_Compra) {
        String sql = "UPDATE carro_compra SET fecha_creacion_carro = :fecha_creacion_carro,  estado_carro=:estado_carro, id_usuario=:id_usuario WHERE id_carro = :id_carro";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", carro_Compra.getId_carro())
                    .addParameter("fecha_creacion_carro", carro_Compra.getFecha_creacion_carro())
                    .addParameter("estado_carro", carro_Compra.getEstado_carro())
                    .addParameter("id_usuario", carro_Compra.getId_usuario())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_carro) {
        String sql = "DELETE FROM carro_compra WHERE id_carro = :id_carro";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_carro", id_carro)
                    .executeUpdate();
        }
    }
}
