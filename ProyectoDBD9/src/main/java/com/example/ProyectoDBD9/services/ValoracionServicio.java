package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Valoracion;
import com.example.ProyectoDBD9.repositories.RepositorioValoracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioValoracion {

    @Autowired
    private RepositorioValoracion repositorioValoracion;

    public List<Valoracion> obtenerTodas() {
        return repositorioValoracion.obtenerTodas();
    }

    public void agregarValoracion(Valoracion valoracion) {
        if (valoracion.getPuntuacionValoracion() < 0 || valoracion.getPuntuacionValoracion() > 10) {
            throw new IllegalArgumentException("La puntuación debe estar entre 0 y 10");
        }
        repositorioValoracion.agregarValoracion(valoracion);
    }
}
