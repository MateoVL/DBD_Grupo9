package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Lista_Deseos;
import com.example.ProyectoDBD9.repositories.Lista_DeseosRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Lista_DeseosService {
    private final Lista_DeseosRepositoryImp lista_DeseosRepositoryImp;

    @Autowired
    public Lista_DeseosService(Lista_DeseosRepositoryImp lista_DeseosRepositoryImp) {
        this.lista_DeseosRepositoryImp = lista_DeseosRepositoryImp;
    }

    public boolean crear(Lista_Deseos lista_Deseos) {
        lista_DeseosRepositoryImp.crear(lista_Deseos);
        return true;
    }

    public List<Lista_Deseos> getAll() {
        return lista_DeseosRepositoryImp.getAll();
    }

    public void delete(int id_lista_deseos, int id_usuario) {lista_DeseosRepositoryImp.delete(id_lista_deseos, id_usuario);}
}
