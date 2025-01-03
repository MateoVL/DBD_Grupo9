package com.example.ProyectoDBD9.controladores;



import com.example.ProyectoDBD9.models.Videojuego;
import com.example.ProyectoDBD9.services.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/videojuego")
public class VideojuegoController {
    private final VideojuegoService videojuegoService;

    @Autowired
    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Videojuego videojuego) {
        if(videojuegoService.crear(videojuego)){
            return "Videojuego creado correctamente";
        } else return "Error al crear el videojuego";
    }

    @GetMapping("/get")
    public List<Videojuego> getAll(){
        return videojuegoService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Videojuego videojuego) {
        videojuegoService.update(videojuego);
    }

    @DeleteMapping("/delete/{id_videojuego}")
    public void delete(@PathVariable int id_videojuego) {
        videojuegoService.delete(id_videojuego);
    }
}

