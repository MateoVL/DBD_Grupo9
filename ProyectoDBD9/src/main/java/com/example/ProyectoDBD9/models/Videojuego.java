package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Videojuego {
    private int id_videojuego;
    private String nombre_videojuego;
    private String url_videojuego;
    private String descripcion_videojuego;
    private int precio_videojuego;
    private int num_ventas_videojuego;
    private Date fecha_lanzamiento_videojuego;
    private int id_categoria;

    //Constructores
    public Videojuego() {}
    public Videojuego(int id_videojuego, String nombre_videojuego, String url_videojuego, String descripcion_videojuego, int precio_videojuego, int num_ventas_videojuego, Date fecha_lanzamiento_videojuego, int id_categoria) {
        this.id_videojuego = id_videojuego;
        this.nombre_videojuego = nombre_videojuego;
        this.url_videojuego = url_videojuego;
        this.descripcion_videojuego = descripcion_videojuego;
        this.precio_videojuego = precio_videojuego;
        this.num_ventas_videojuego = num_ventas_videojuego;
        this.fecha_lanzamiento_videojuego = fecha_lanzamiento_videojuego;
        this.id_categoria = id_categoria;
    }

    //Getters
    public int getId_videojuego() { return id_videojuego; }
    public String getNombre_videojuego() {
        return nombre_videojuego;
    }
    public String getUrl_videojuego() {
        return url_videojuego;
    }
    public String getDescripcion_videojuego() {
        return descripcion_videojuego;
    }
    public int getPrecio_videojuego() {
        return precio_videojuego;
    }
    public int getNum_ventas_videojuego() {
        return num_ventas_videojuego;
    }
    public Date getFecha_lanzamiento_videojuego() {
        return fecha_lanzamiento_videojuego;
    }
    public int getId_categoria() {
        return id_categoria;
    }

    //Setters
    public void setPrecio_videojuego(int precio_videojuego) {this.precio_videojuego = precio_videojuego;}



    //Otros
    public void setAddNumVentas(int num_ventas_videojuego) {
        this.num_ventas_videojuego = num_ventas_videojuego + 1;
    }
}
