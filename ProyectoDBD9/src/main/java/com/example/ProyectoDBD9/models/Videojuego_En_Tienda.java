package com.example.ProyectoDBD9.models;

public class Videojuego_En_Tienda {
    private int id_videojuego;
    private int id_tienda;
    private int stock;

    public Videojuego_En_Tienda() {}
    public Videojuego_En_Tienda(int id_videojuego, int id_tienda, int stock) {
        this.id_videojuego = id_videojuego;
        this.id_tienda = id_tienda;
        this.stock = stock;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
