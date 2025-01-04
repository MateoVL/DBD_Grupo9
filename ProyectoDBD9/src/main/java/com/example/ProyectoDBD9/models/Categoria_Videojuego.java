package com.example.ProyectoDBD9.models;

public class Categoria_Videojuego {
    private int id_categoria;
    private int id_videojuego;

    //Constructores
    public Categoria_Videojuego() {}
    public Categoria_Videojuego(int id_categoria, int id_videojuego) {
        this.id_categoria = id_categoria;
        this.id_videojuego = id_videojuego;
    }

    //Getters and Setters

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }
}
