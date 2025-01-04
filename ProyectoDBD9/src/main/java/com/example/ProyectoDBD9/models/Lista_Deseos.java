package com.example.ProyectoDBD9.models;

public class Lista_Deseos {
    private int id_lista_deseos;
    private int id_usuario;

    public Lista_Deseos() {}
    public Lista_Deseos(int id_lista_deseos, int id_usuario) {
        this.id_lista_deseos = id_lista_deseos;
        this.id_usuario = id_usuario;
    }

    public int getId_lista_deseos() {
        return id_lista_deseos;
    }

    public void setId_lista_deseos(int id_lista_deseos) {
        this.id_lista_deseos = id_lista_deseos;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
