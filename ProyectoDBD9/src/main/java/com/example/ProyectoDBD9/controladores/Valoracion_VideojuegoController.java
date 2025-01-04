package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Valoracion_Videojuego;
import com.example.ProyectoDBD9.services.Valoracion_VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valoracion_videojuego")
public class Valoracion_VideojuegoController {
    private final Valoracion_VideojuegoService valoracion_VideojuegoService;

    @Autowired
    public Valoracion_VideojuegoController(Valoracion_VideojuegoService valoracion_VideojuegoService) {
        this.valoracion_VideojuegoService = valoracion_VideojuegoService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Valoracion_Videojuego valoracion_Videojuego) {
        valoracion_VideojuegoService.crear(valoracion_Videojuego);
    }

    @GetMapping("/get")
    public List<Valoracion_Videojuego> getAll(){
        return valoracion_VideojuegoService.getAll();
    }

    @DeleteMapping("/delete/{id_valoracion}/{id_videojuego}")
    public void delete(@PathVariable int id_valoracion, @PathVariable int id_videojuego) {
        valoracion_VideojuegoService.delete(id_valoracion, id_videojuego);
    }
}
