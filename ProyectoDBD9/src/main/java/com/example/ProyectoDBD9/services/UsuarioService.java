package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Usuario;
import com.example.ProyectoDBD9.repositories.UsuarioRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepositoryImp usuarioRepositoryImp;

    @Autowired
    public UsuarioService(UsuarioRepositoryImp usuarioRepositoryImp) {
        this.usuarioRepositoryImp = usuarioRepositoryImp;
    }

    public boolean crear(Usuario usuario) {
        usuarioRepositoryImp.crear(usuario);
        return true;
    }

    public List<Usuario> getAll() {
        return usuarioRepositoryImp.getAll();
    }

    public void update(Usuario usuario) {
        usuarioRepositoryImp.update(usuario);
    }

    public void delete(int id_usuario) {
        usuarioRepositoryImp.delete(id_usuario);
    }
}
