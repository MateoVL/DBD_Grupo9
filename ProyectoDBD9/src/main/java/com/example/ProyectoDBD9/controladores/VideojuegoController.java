package com.example.ProyectoDBD9.controladores;



import com.example.ProyectoDBD9.models.Videojuego;
import com.example.ProyectoDBD9.services.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videojuego")
public class VideojuegoController {

    private final VideojuegoService videojuegoService;

    @Autowired
    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;  // La inyección se hace aquí
    }

    @GetMapping("/get")
    public List<Videojuego> getAll(){
        return videojuegoService.getAll();
    }
}

