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

    //Constructores
    public Videojuego() {}
    public Videojuego(int id_videojuego, String nombre_videojuego, String url_videojuego, String descripcion_videojuego, int precio_videojuego, int num_ventas_videojuego, Date fecha_lanzamiento_videojuego) {
        this.id_videojuego = id_videojuego;
        this.nombre_videojuego = nombre_videojuego;
        this.url_videojuego = url_videojuego;
        this.descripcion_videojuego = descripcion_videojuego;
        this.precio_videojuego = precio_videojuego;
        this.num_ventas_videojuego = num_ventas_videojuego;
        this.fecha_lanzamiento_videojuego = fecha_lanzamiento_videojuego;
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

    //Setters
    public void setPrecio_videojuego(int precio_videojuego) {this.precio_videojuego = precio_videojuego;}

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public void setNombre_videojuego(String nombre_videojuego) {
        this.nombre_videojuego = nombre_videojuego;
    }

    public void setUrl_videojuego(String url_videojuego) {
        this.url_videojuego = url_videojuego;
    }

    public void setDescripcion_videojuego(String descripcion_videojuego) {
        this.descripcion_videojuego = descripcion_videojuego;
    }

    public void setNum_ventas_videojuego(int num_ventas_videojuego) {
        this.num_ventas_videojuego = num_ventas_videojuego;
    }

    public void setFecha_lanzamiento_videojuego(Date fecha_lanzamiento_videojuego) {
        this.fecha_lanzamiento_videojuego = fecha_lanzamiento_videojuego;
    }

    //Otros
    public void setAddNumVentas(int num_ventas_videojuego) {
        this.num_ventas_videojuego = num_ventas_videojuego + 1;
    }
}
