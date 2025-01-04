package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.ValoracionVideojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioValoracionVideojuego {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void agregarRelacion(int idValoracion, int idVideojuego) {
        String sql = "INSERT INTO VALORACION_VIDEOJUEGO (Id_valoracion, Id_videojuego) VALUES (?, ?)";
        jdbcTemplate.update(sql, idValoracion, idVideojuego);
    }
}
