package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Ubicacion {
    private int Id_Ubicacion;
    private String Pais;
    private String Ciudad;
    private String Direccion;

    //Constuctor
    public Ubicacion() {}
    public Ubicacion( int Id_Ubicacion, String Pais,String Ciudad,String Direccion){
        this.Id_Ubicacion = Id_Ubicacion;
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
    }

    //Getters
    public int getId_Ubicacion() {return Id_Ubicacion;}
    public String getPais() {return Pais;}
    public String getCiudad() {return Ciudad;}
    public String getDireccion() {return Direccion;}

    //Setters
    public void setId_Ubicacion(int Id_Ubicacion) {this.Id_Ubicacion = Id_Ubicacion;}
    public void setPais(String Pais) {this.Pais = Pais;}
    public  void setCiudad(String Ciudad) {this.Ciudad = Ciudad;}
    public  void setDireccion(String Direccion) {this.Direccion = Direccion;}
}
