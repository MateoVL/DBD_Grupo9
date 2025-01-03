package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.repositories.BoletaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoletaService {
    private final BoletaRepositoryImp boletaRepositoryImp;

    @Autowired
    public BoletaService(BoletaRepositoryImp boletaRepositoryImp) {
        this.boletaRepositoryImp = boletaRepositoryImp;
    }

    public boolean crear(Boleta boleta) {
        boletaRepositoryImp.crear(boleta);
        return true;
    }

    public List<Boleta> getAll() {
        return boletaRepositoryImp.getAll();
    }

    public void update(Boleta boleta) {
        boletaRepositoryImp.update(boleta);
    }

    public void delete(int id_boleta) {boletaRepositoryImp.delete(id_boleta);}
}
