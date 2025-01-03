package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Carro_Compra;

import java.util.List;

public interface Carro_CompraRepository {
    void crear(Carro_Compra carro_Compra);
    List<Carro_Compra> getAll();
    void update(Carro_Compra carro_Compra);
    void delete(int id_carro);
}
