package com.example.ProyectoDBD9.models;

public class Contenido_Listas {
    private int id_lista;
    private int id_videojuego;

    public Contenido_Listas(int id_lista, int id_videojuego) {
        this.id_lista = id_lista;
        this.id_videojuego = id_videojuego;
    }

    public int getId_lista() {
        return id_lista;
    }

    public void setId_lista(int id_lista) {
        this.id_lista = id_lista;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }
}
