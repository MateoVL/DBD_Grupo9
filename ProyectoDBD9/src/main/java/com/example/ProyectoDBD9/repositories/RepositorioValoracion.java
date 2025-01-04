package com.example.ProyectoDBD9.repositories;

import com.example.ProyectoDBD9.models.Valoracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioValoracion {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Valoracion> obtenerTodas() {
        String sql = "SELECT * FROM VALORACION";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Valoracion(
            rs.getInt("Id_Valoracion"),
            rs.getString("Descripcion_Valoracion"),
            rs.getInt("Puntuacion_Valoracion"),
            rs.getDate("Fecha_Valoracion")
        ));
    }

    public void agregarValoracion(Valoracion valoracion) {
        String sql = "INSERT INTO VALORACION (Descripcion_Valoracion, Puntuacion_Valoracion, Fecha_Valoracion) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, valoracion.getDescripcionValoracion(), valoracion.getPuntuacionValoracion(), valoracion.getFechaValoracion());
    }
}
