package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.models.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class CompraRepositoryImp implements CompraRepository {
    private final Sql2o sql2o;

    @Autowired
    public CompraRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Compra compra) {
        String sql = "INSERT INTO compra (id_compra, subtotal, metodo_pago, id_carro) VALUES (:id_compra, :subtotal, :metodo_pago, :id_carro)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_compra", compra.getId_compra())
                    .addParameter("subtotal", compra.getSubtotal())
                    .addParameter("metodo_pago", compra.getMetodo_pago())
                    .addParameter("id_carro", compra.getId_carro())
                    .executeUpdate();
        }
    }

    @Override
    public List<Compra> getAll(){
        String sql = "SELECT * FROM compra";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Compra.class);
        }
    }

    @Override
    public void update(Compra compra) {
        String sql = "UPDATE compra SET subtotal=:subtotal, metodo_pago=:metodo_pago, id_carro=:id_carro WHERE id_compra = :id_compra";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_compra", compra.getId_compra())
                    .addParameter("subtotal", compra.getSubtotal())
                    .addParameter("metodo_pago", compra.getMetodo_pago())
                    .addParameter("id_carro", compra.getId_carro())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_compra) {
        String sql = "DELETE FROM compra WHERE id_compra = :id_compra";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_compra", id_compra)
                    .executeUpdate();
        }
    }
}
