package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Compra;
import com.example.ProyectoDBD9.repositories.CompraRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {
    private final CompraRepositoryImp compraRepositoryImp;

    @Autowired
    public CompraService(CompraRepositoryImp compraRepositoryImp) {
        this.compraRepositoryImp = compraRepositoryImp;
    }

    public boolean crear(Compra compra) {
        compraRepositoryImp.crear(compra);
        return true;
    }

    public List<Compra> getAll() {
        return compraRepositoryImp.getAll();
    }

    public void update(Compra compra) {
        compraRepositoryImp.update(compra);
    }

    public void delete(int id_compra) {compraRepositoryImp.delete(id_compra);}
}
