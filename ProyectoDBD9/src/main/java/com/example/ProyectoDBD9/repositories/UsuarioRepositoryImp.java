package com.example.ProyectoDBD9.repositories;


import com.example.ProyectoDBD9.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {
    private final Sql2o sql2o;

    @Autowired
    public UsuarioRepositoryImp(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void crear(Usuario usuario) {
        String sql = "INSERT INTO usuario (id_usuario, nombre_usuario, correo_usuario, clave_usuario, ip_usuario, fecha_registro_usuario, rol) VALUES (:id_usuario, :nombre_usuario, :correo_usuario, :clave_usuario, :ip_usuario, :fecha_registro_usuario, :rol)";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_usuario", usuario.getIdUsuario())
                    .addParameter("nombre_usuario", usuario.getNombreUsuario())
                    .addParameter("correo_usuario",usuario.getCorreoUsuario())
                    .addParameter("clave_usuario",usuario.getClaveUsuario())
                    .addParameter("ip_usuario",usuario.getIpUsuario())
                    .addParameter("fecha_registro_usuario",usuario.getFechaRegistroUsuario())
                    .addParameter("rol",usuario.getRol())
                    .executeUpdate();
        }
    }

    @Override
    public List<Usuario> getAll(){
        String sql = "SELECT * FROM usuario";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Usuario.class);
        }
    }

    @Override
    public void update(Usuario usuario) {
        String sql = "UPDATE usuario SET nombre_usuario = :nombre_usuario, correo_usuario=:correo_usuario, clave_usuario=:clave_usuario, ip_usuario=:ip_usuario, fecha_registro_usuario=:fecha_registro_usuario, rol=:rol WHERE id_usuario = :id_usuario";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_usuario", usuario.getIdUsuario())
                    .addParameter("nombre_usuario", usuario.getNombreUsuario())
                    .addParameter("correo_usuario",usuario.getCorreoUsuario())
                    .addParameter("clave_usuario",usuario.getClaveUsuario())
                    .addParameter("ip_usuario",usuario.getIpUsuario())
                    .addParameter("fecha_registro_usuario",usuario.getFechaRegistroUsuario())
                    .addParameter("rol",usuario.getRol())
                    .executeUpdate();
        }
    }

    @Override
    public void delete(int id_usuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = :id_usuario";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id_usuario", id_usuario)
                    .executeUpdate();
        }
    }
}
