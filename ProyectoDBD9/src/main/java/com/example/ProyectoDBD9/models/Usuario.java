package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String correoUsuario;
    private String claveUsuario;
    private String ipUsuario;
    private Date fechaRegistroUsuario;
    private String rol;

    //Constructores
    public Usuario() {}
    public Usuario(int idUsuario, String nombreUsuario, String correoUsuario, String claveUsuario, String ipUsuario, Date fechaRegistroUsuario, String rol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.claveUsuario = claveUsuario;
        this.ipUsuario = ipUsuario;
        this.fechaRegistroUsuario = fechaRegistroUsuario;
        this.rol = rol;
    }

    // Getters
    public int getIdUsuario() { return idUsuario; }
    public String getNombreUsuario() { return nombreUsuario; }
    public String getCorreoUsuario() { return correoUsuario; }
    public String getClaveUsuario() { return claveUsuario; }
    public String getIpUsuario() { return ipUsuario; }
    public Date getFechaRegistroUsuario() { return fechaRegistroUsuario; }
    public String getRol() { return rol; }

    // Setters
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public void setCorreoUsuario(String correoUsuario) { this.correoUsuario = correoUsuario; }
    public void setClaveUsuario(String claveUsuario) { this.claveUsuario = claveUsuario; }
    public void setIpUsuario(String ipUsuario) { this.ipUsuario = ipUsuario; }
    public void setFechaRegistroUsuario(Date fechaRegistroUsuario) { this.fechaRegistroUsuario = fechaRegistroUsuario; }
    public void setRol(String rol) { this.rol = rol; }

    //Otros

}
