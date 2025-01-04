package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.ValoracionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioValoracionUsuario {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void agregarRelacion(int idUsuario, int idValoracion) {
        String sql = "INSERT INTO VALORACION_USUARIO (Id_usuario, Id_valoracion) VALUES (?, ?)";
        jdbcTemplate.update(sql, idUsuario, idValoracion);
    }
}
