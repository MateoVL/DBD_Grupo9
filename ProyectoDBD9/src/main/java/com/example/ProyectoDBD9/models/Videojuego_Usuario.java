package com.example.ProyectoDBD9.models;

public class Videojuego_Usuario {
    private int id_videojuego;
    private int id_usuario;

    public Videojuego_Usuario() {}
    public Videojuego_Usuario(int id_videojuego, int id_usuario) {
        this.id_videojuego = id_videojuego;
        this.id_usuario = id_usuario;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

}
