package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Valoracion_Usuario;
import com.example.ProyectoDBD9.repositories.Valoracion_UsuarioRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Valoracion_UsuarioService {
    private final Valoracion_UsuarioRepositoryImp valoracion_UsuarioRepositoryImp;

    @Autowired
    public Valoracion_UsuarioService(Valoracion_UsuarioRepositoryImp valoracion_UsuarioRepositoryImp) {
        this.valoracion_UsuarioRepositoryImp = valoracion_UsuarioRepositoryImp;
    }

    public boolean crear(Valoracion_Usuario valoracion_Usuario) {
        valoracion_UsuarioRepositoryImp.crear(valoracion_Usuario);
        return true;
    }

    public List<Valoracion_Usuario> getAll() {
        return valoracion_UsuarioRepositoryImp.getAll();
    }

    public void delete(int id_valoracion, int id_usuario) {valoracion_UsuarioRepositoryImp.delete(id_valoracion, id_usuario);}
}
