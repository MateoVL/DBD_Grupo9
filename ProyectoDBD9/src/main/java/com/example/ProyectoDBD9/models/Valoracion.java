package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Valoracion {
    private int idValoracion;
    private String descripcionValoracion;
    private int puntuacionValoracion;
    private Date fechaValoracion;

    // Constructor vacío
    public Valoracion() {}

    // Constructor completo
    public Valoracion(int idValoracion, String descripcionValoracion, int puntuacionValoracion, Date fechaValoracion) {
        this.idValoracion = idValoracion;
        this.descripcionValoracion = descripcionValoracion;
        this.puntuacionValoracion = puntuacionValoracion;
        this.fechaValoracion = fechaValoracion;
    }

    // Getters
    public int getIdValoracion() {
        return idValoracion;
    }

    public String getDescripcionValoracion() {
        return descripcionValoracion;
    }

    public int getPuntuacionValoracion() {
        return puntuacionValoracion;
    }

    public Date getFechaValoracion() {
        return fechaValoracion;
    }

    // Setters
    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }

    public void setDescripcionValoracion(String descripcionValoracion) {
        this.descripcionValoracion = descripcionValoracion;
    }

    public void setPuntuacionValoracion(int puntuacionValoracion) {
        this.puntuacionValoracion = puntuacionValoracion;
    }

    public void setFechaValoracion(Date fechaValoracion) {
        this.fechaValoracion = fechaValoracion;
    }
}
