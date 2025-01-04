package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Valoracion {
    private int id_valoracion;
    private String descripcion_valoracion;
    private int puntuacion_valoracion;
    private Date fecha_valoracion;

    public Valoracion() {}
    public Valoracion(int id_valoracion, String descripcion_valoracion, int puntuacion_valoracion, Date fecha_valoracion) {
        this.id_valoracion = id_valoracion;
        this.descripcion_valoracion = descripcion_valoracion;
        this.puntuacion_valoracion = puntuacion_valoracion;
        this.fecha_valoracion = fecha_valoracion;
    }

    public int getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(int id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public String getDescripcion_valoracion() {
        return descripcion_valoracion;
    }

    public void setDescripcion_valoracion(String descripcion_valoracion) {
        this.descripcion_valoracion = descripcion_valoracion;
    }

    public int getPuntuacion_valoracion() {
        return puntuacion_valoracion;
    }

    public void setPuntuacion_valoracion(int puntuacion_valoracion) {
        this.puntuacion_valoracion = puntuacion_valoracion;
    }

    public Date getFecha_valoracion() {
        return fecha_valoracion;
    }

    public void setFecha_valoracion(Date fecha_valoracion) {
        this.fecha_valoracion = fecha_valoracion;
    }
}
