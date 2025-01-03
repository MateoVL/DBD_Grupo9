package com.example.ProyectoDBD9.models;

public class Carro_Videojuego {
    private int id_carro;
    private int id_videojuego;
    private int cantidad;

    //Constructores
    public Carro_Videojuego() {}
    public Carro_Videojuego(int id_carro, int id_videojuego, int cantidad) {
        this.id_carro = id_carro;
        this.id_videojuego = id_videojuego;
        this.cantidad = cantidad;
    }

    //Getters and Setters

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Otros
}
