package com.example.ProyectoDBD9.config;

import org.sql2o.Sql2o;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Sql2oConfig {

    @Bean
    public Sql2o sql2o() {
        // Aquí pones la configuración de conexión a la base de datos PostgreSQL
        String jdbcUrl = "jdbc:postgresql://localhost:5432/ProyectoDBD9";
        String username = "postgres";    // Tu usuario de PostgreSQL
        String password = "4321";  // Tu contraseña de PostgreSQL

        // Devolvemos el bean de Sql2o
        return new Sql2o(jdbcUrl, username, password);
    }
}


