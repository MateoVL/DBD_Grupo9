package com.example.ProyectoDBD9.models;

import java.util.Date;

public class Usuario {
    private int id_usuario;
    private String nombre_usuario;
    private String correo_usuario;
    private String clave_usuario;
    private String ip_usuario;
    private Date fecha_registro_usuario;
    private String rol;

    //Constructores
    public Usuario() {}
    public Usuario(int id_usuario, String nombre_usuario, String correo_usuario, String clave_usuario, String ip_usuario, Date fecha_registro_usuario, String rol) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.clave_usuario = clave_usuario;
        this.ip_usuario = ip_usuario;
        this.fecha_registro_usuario = fecha_registro_usuario;
        this.rol = rol;
    }

    // Getters
    public int getIdUsuario() { return id_usuario; }
    public String getNombreUsuario() { return nombre_usuario; }
    public String getCorreoUsuario() { return correo_usuario; }
    public String getClaveUsuario() { return clave_usuario; }
    public String getIpUsuario() { return ip_usuario; }
    public Date getFechaRegistroUsuario() { return fecha_registro_usuario; }
    public String getRol() { return rol; }

    // Setters
    public void setIdUsuario(int idUsuario) { this.id_usuario = idUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombre_usuario = nombreUsuario; }
    public void setCorreoUsuario(String correoUsuario) { this.correo_usuario = correoUsuario; }
    public void setClaveUsuario(String claveUsuario) { this.clave_usuario = claveUsuario; }
    public void setIpUsuario(String ipUsuario) { this.ip_usuario = ipUsuario; }
    public void setFechaRegistroUsuario(Date fechaRegistroUsuario) { this.fecha_registro_usuario = fechaRegistroUsuario; }
    public void setRol(String rol) { this.rol = rol; }

    //Otros

}
