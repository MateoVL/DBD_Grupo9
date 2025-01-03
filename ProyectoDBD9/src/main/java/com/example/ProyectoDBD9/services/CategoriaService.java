package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Categoria;
import com.example.ProyectoDBD9.repositories.CategoriaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepositoryImp categoriaRepositoryImp;

    @Autowired
    public CategoriaService(CategoriaRepositoryImp categoriaRepositoryImp) {
        this.categoriaRepositoryImp = categoriaRepositoryImp;
    }

    public boolean crear(Categoria categoria) {
        categoriaRepositoryImp.crear(categoria);
        return true;
    }

    public List<Categoria> getAll() {
        return categoriaRepositoryImp.getAll();
    }

    public void update(Categoria categoria) {
        categoriaRepositoryImp.update(categoria);
    }

    public void delete(int id_categoria) {
        categoriaRepositoryImp.delete(id_categoria);
    }
}
