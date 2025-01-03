package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Carro_Compra {
    private int id_carro;
    private Date fecha_creacion_carro;
    private int estado_carro;
    private int id_usuario;

    //Constructor
    public Carro_Compra() {}
    public Carro_Compra(int id_carro, Date fecha_creacion_carro, int estado_carro, int id_usuario, int id_videojuego) {
        this.id_carro = id_carro;
        this.fecha_creacion_carro = fecha_creacion_carro;
        this.estado_carro = estado_carro;
        this.id_usuario = id_usuario;
    }

    //Getters and Setters

    public int getId_carro() {return id_carro;}
    public void setId_carro(int id_carro) {this.id_carro = id_carro;}
    public Date getFecha_creacion_carro() {return fecha_creacion_carro;}
    public void setFecha_creacion_carro(Date fecha_creacion_carro) {this.fecha_creacion_carro = fecha_creacion_carro;}
    public int getEstado_carro() {return estado_carro;}
    public void setEstado_carro(int estado_carro) {this.estado_carro = estado_carro;}
    public int getId_usuario() {return id_usuario;}
    public void setId_usuario(int id_usuario) {this.id_usuario = id_usuario;}

    //Otros

}
