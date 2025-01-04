package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Videojuego_Usuario;
import com.example.ProyectoDBD9.repositories.Videojuego_UsuarioRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Videojuego_UsuarioService {
    private final Videojuego_UsuarioRepositoryImp videojuego_UsuarioRepositoryImp;

    @Autowired
    public Videojuego_UsuarioService(Videojuego_UsuarioRepositoryImp videojuego_UsuarioRepositoryImp) {
        this.videojuego_UsuarioRepositoryImp = videojuego_UsuarioRepositoryImp;
    }

    public boolean crear(Videojuego_Usuario videojuego_Usuario) {
        videojuego_UsuarioRepositoryImp.crear(videojuego_Usuario);
        return true;
    }

    public List<Videojuego_Usuario> getAll() {
        return videojuego_UsuarioRepositoryImp.getAll();
    }

    public void delete(int id_videojuego, int id_usuario) {videojuego_UsuarioRepositoryImp.delete(id_videojuego, id_usuario);}
}
