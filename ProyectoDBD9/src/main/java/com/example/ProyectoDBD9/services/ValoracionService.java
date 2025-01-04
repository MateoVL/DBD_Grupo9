package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.models.Valoracion;
import com.example.ProyectoDBD9.repositories.BoletaRepositoryImp;
import com.example.ProyectoDBD9.repositories.ValoracionRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionService {
    private final ValoracionRepositoryImp valoracionRepositoryImp;

    @Autowired
    public ValoracionService(ValoracionRepositoryImp valoracionRepositoryImp) {
        this.valoracionRepositoryImp = valoracionRepositoryImp;
    }

    public boolean crear(Valoracion valoracion) {
        valoracionRepositoryImp.crear(valoracion);
        return true;
    }

    public List<Valoracion> getAll() {
        return valoracionRepositoryImp.getAll();
    }

    public void update(Valoracion valoracion) {
        valoracionRepositoryImp.update(valoracion);
    }

    public void delete(int id_valoracion) {valoracionRepositoryImp.delete(id_valoracion);}
}
