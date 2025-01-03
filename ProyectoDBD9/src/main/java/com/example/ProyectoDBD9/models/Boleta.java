package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Boleta {
    private int id_boleta;
    private String nombre_vendedor;
    private String nombre_comprador;
    private int precio_total;
    private Date fecha_compra;

    //Constructor
    public Boleta(){}
    public Boleta(int id_boleta, String nombre_vendedor, String nombre_comprador, int precio_total, Date fecha_compra) {
        this.id_boleta = id_boleta;
        this.nombre_vendedor = nombre_vendedor;
        this.nombre_comprador = nombre_comprador;
        this.precio_total = precio_total;
        this.fecha_compra = fecha_compra;
    }

    //Getters
    public int getId_boleta() {return id_boleta;}
    public String getNombre_vendedor() {return nombre_vendedor;}
    public String getNombre_comprador() {return nombre_comprador;}
    public int getPrecio_total() {return precio_total;}
    public Date getFecha_compra() {return fecha_compra;}

    //Setters
    public void setId_boleta(int id_boleta) {this.id_boleta = id_boleta;}
    public void setNombre_vendedor(String nombre_vendedor) {this.nombre_vendedor = nombre_vendedor;}
    public void setNombre_comprador(String nombre_comprador) {this.nombre_comprador = nombre_comprador;}
    public void setPrecio_total(int precio_total) {this.precio_total = precio_total;}
    public void setFecha_compra(Date fecha_compra) {this.fecha_compra = fecha_compra;}

    //Otros

}
