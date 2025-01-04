package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Ubicacion;
import com.example.ProyectoDBD9.repositories.UbicacionRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionService {
    private final UbicacionRepositoryImp ubicacionRepositoryImp;
    @Autowired
    public UbicacionService(UbicacionRepositoryImp ubicacionRepositoryImp) {
        this.ubicacionRepositoryImp = ubicacionRepositoryImp;
    }
    public boolean crear(Ubicacion ubicacion) {
        ubicacionRepositoryImp.crear(ubicacion);
        return true;
    }
    public List<Ubicacion> getAll() {
        return ubicacionRepositoryImp.getAll();
    }

    public void update(Ubicacion ubicacion) {
        ubicacionRepositoryImp.update(ubicacion);
    }

    public void delete(int Id_Ubicacion) {
        ubicacionRepositoryImp.delete(Id_Ubicacion);
    }
}