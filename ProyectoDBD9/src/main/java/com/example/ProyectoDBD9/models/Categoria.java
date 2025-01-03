package com.example.ProyectoDBD9.models;

public class Categoria {
    private int id_categoria;
    private String nombre_categoria;

    //Constructores
    public Categoria(){}
    public Categoria(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    // Getters
    public int getIdCategoria() { return id_categoria; }
    public String getNombreCategoria() { return nombre_categoria; }

    // Settters
    public void setIdCategoria(int id_categoria) { this.id_categoria = id_categoria; }
    public void setNombreCategoria(String nombre_categoria) { this.nombre_categoria = nombre_categoria; }
}
