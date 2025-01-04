package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Ranking_Videojuego {
    private int id_ranking;
    private int id_videojuego;
    private int puntos;
    private Date fecha_ranking;

    public Ranking_Videojuego() {}
    public Ranking_Videojuego(int id_ranking, int id_videojuego, int puntos, Date fecha_ranking) {
        this.id_ranking = id_ranking;
        this.id_videojuego = id_videojuego;
        this.puntos = puntos;
        this.fecha_ranking = fecha_ranking;
    }

    public int getId_ranking() {
        return id_ranking;
    }

    public void setId_ranking(int id_ranking) {
        this.id_ranking = id_ranking;
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Date getFecha_ranking() {
        return fecha_ranking;
    }

    public void setFecha_ranking(Date fecha_ranking) {
        this.fecha_ranking = fecha_ranking;
    }
}
