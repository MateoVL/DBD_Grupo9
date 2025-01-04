package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.repositories.RepositorioValoracionVideojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioValoracionVideojuego {

    @Autowired
    private RepositorioValoracionVideojuego repositorioValoracionVideojuego;

    public void agregarRelacionValoracionVideojuego(int idValoracion, int idVideojuego) {
        repositorioValoracionVideojuego.agregarRelacion(idValoracion, idVideojuego);
    }
}
