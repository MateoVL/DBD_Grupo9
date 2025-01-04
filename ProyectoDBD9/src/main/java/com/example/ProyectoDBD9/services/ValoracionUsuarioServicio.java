package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.repositories.RepositorioValoracionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioValoracionUsuario {

    @Autowired
    private RepositorioValoracionUsuario repositorioValoracionUsuario;

    public void agregarRelacionUsuarioValoracion(int idUsuario, int idValoracion) {
        repositorioValoracionUsuario.agregarRelacion(idUsuario, idValoracion);
    }
}
