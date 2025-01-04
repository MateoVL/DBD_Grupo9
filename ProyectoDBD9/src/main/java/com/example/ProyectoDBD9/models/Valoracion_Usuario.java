package com.example.ProyectoDBD9.models;

public class Valoracion_Usuario {
    private int id_usuario;
    private int id_valoracion;

    public Valoracion_Usuario() {}
    public Valoracion_Usuario(int id_usuario, int id_valoracion) {
        this.id_usuario = id_usuario;
        this.id_valoracion = id_valoracion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(int id_valoracion) {
        this.id_valoracion = id_valoracion;
    }
}
