package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Carro_Compra;
import com.example.ProyectoDBD9.repositories.Carro_CompraRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Carro_CompraService {
    private final Carro_CompraRepositoryImp carro_CompraRepositoryImp;

    @Autowired
    public Carro_CompraService(Carro_CompraRepositoryImp carro_CompraRepositoryImp) {
        this.carro_CompraRepositoryImp = carro_CompraRepositoryImp;
    }

    public boolean crear(Carro_Compra carro_Compra) {
        carro_CompraRepositoryImp.crear(carro_Compra);
        return true;
    }

    public List<Carro_Compra> getAll() {
        return carro_CompraRepositoryImp.getAll();
    }

    public void update(Carro_Compra carro_Compra) {
        carro_CompraRepositoryImp.update(carro_Compra);
    }

    public void delete(int id_carro) {carro_CompraRepositoryImp.delete(id_carro);}
}
