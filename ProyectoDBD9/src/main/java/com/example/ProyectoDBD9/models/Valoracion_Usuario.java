package com.example.ProyectoDBD9.models;

public class ValoracionUsuario {
    private int idUsuario;
    private int idValoracion;

    // Constructor vacío
    public ValoracionUsuario() {}

    // Constructor completo
    public ValoracionUsuario(int idUsuario, int idValoracion) {
        this.idUsuario = idUsuario;
        this.idValoracion = idValoracion;
    }

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdValoracion() {
        return idValoracion;
    }

    // Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }
}
