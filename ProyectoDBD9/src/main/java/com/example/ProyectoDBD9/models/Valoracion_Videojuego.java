package com.example.ProyectoDBD9.models;

public class ValoracionVideojuego {
    private int idValoracion;
    private int idVideojuego;

    // Constructor vacío
    public ValoracionVideojuego() {}

    // Constructor completo
    public ValoracionVideojuego(int idValoracion, int idVideojuego) {
        this.idValoracion = idValoracion;
        this.idVideojuego = idVideojuego;
    }

    // Getters
    public int getIdValoracion() {
        return idValoracion;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    // Setters
    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }
}
