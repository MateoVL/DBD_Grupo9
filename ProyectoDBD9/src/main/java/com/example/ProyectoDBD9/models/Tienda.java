package com.example.ProyectoDBD9.models;

public class Tienda {
    private int id_tienda;
    private String nombre_tienda;
    private String ip_tienda;
    private String direccion_tienda;
    private int id_jefe;
    private int id_ubicacion;

    // get
    public int getId_tienda() { return id_tienda; }
    public String getNombre_tienda() { return nombre_tienda; }
    public String getIp_tienda() { return ip_tienda; }
    public String getDireccion_tienda() { return direccion_tienda; }
    public int getId_jefe() { return id_jefe; }
    public int getId_ubicacion() { return id_ubicacion; }

    //set
    public void setIdTienda(int id_tienda) { this.id_tienda = id_tienda; }
    public void setNombreTienda(String nombre_tienda) { this.nombre_tienda = nombre_tienda; }
    public void setIpTienda(String ip_tienda) { this.ip_tienda = ip_tienda; }
    public void setDireccionTienda(String direccion_tienda) { this.direccion_tienda = direccion_tienda; }
    public void setIdJefe(int id_jefe) { this.id_jefe = id_jefe; }
    public void setIdUbicacion(int id_ubicacion) { this.id_ubicacion = id_ubicacion; }
}
