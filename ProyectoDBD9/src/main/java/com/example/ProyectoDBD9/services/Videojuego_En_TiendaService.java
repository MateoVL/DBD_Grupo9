package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Videojuego_En_Tienda;
import com.example.ProyectoDBD9.repositories.Videojuego_En_TiendaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Videojuego_En_TiendaService {
    private final Videojuego_En_TiendaRepositoryImp videojuego_En_TiendaRepositoryImp;

    @Autowired
    public Videojuego_En_TiendaService(Videojuego_En_TiendaRepositoryImp videojuego_En_TiendaRepositoryImp) {
        this.videojuego_En_TiendaRepositoryImp = videojuego_En_TiendaRepositoryImp;
    }

    public boolean crear(Videojuego_En_Tienda videojuego_En_Tienda) {
        videojuego_En_TiendaRepositoryImp.crear(videojuego_En_Tienda);
        return true;
    }

    public List<Videojuego_En_Tienda> getAll() {
        return videojuego_En_TiendaRepositoryImp.getAll();
    }

    public void update(Videojuego_En_Tienda videojuego_En_Tienda) {
        videojuego_En_TiendaRepositoryImp.update(videojuego_En_Tienda);
    }

    public void delete(int id_valoracion, int id_videojuego) {videojuego_En_TiendaRepositoryImp.delete(id_valoracion, id_videojuego);}
}
