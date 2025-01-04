package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Tienda;
import com.example.ProyectoDBD9.repositories.TiendaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaService {
    private final TiendaRepositoryImp tiendaRepositoryImp;

    @Autowired
    public TiendaService(TiendaRepositoryImp tiendaRepositoryImp) {
        this.tiendaRepositoryImp = tiendaRepositoryImp;
    }

    public boolean crear(Tienda tienda) {
        tiendaRepositoryImp.crear(tienda);
        return true;
    }

    public List<Tienda> getAll() {
        return tiendaRepositoryImp.getAll();
    }

    public void update(Tienda tienda) {
        tiendaRepositoryImp.update(tienda);
    }

    public void delete(int id_tienda) {
        tiendaRepositoryImp.delete(id_tienda);
    }
}
