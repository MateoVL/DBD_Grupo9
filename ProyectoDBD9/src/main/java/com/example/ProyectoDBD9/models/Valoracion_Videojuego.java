package com.example.ProyectoDBD9.models;

public class Valoracion_Videojuego {
    private int id_videojuego;
    private int id_valoracion;

    public Valoracion_Videojuego() {}
    public Valoracion_Videojuego(int id_videojuego, int id_valoracion) {
        this.id_videojuego = id_videojuego;
        this.id_valoracion = id_valoracion;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(int id_valoracion) {
        this.id_valoracion = id_valoracion;
    }
}
