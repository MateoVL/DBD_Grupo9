package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Categoria_Videojuego;
import com.example.ProyectoDBD9.services.Categoria_VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria_videojuego")
public class Categoria_VideojuegoController {
    private final Categoria_VideojuegoService categoria_VideojuegoService;

    @Autowired
    public Categoria_VideojuegoController(Categoria_VideojuegoService categoria_VideojuegoService) {
        this.categoria_VideojuegoService = categoria_VideojuegoService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Categoria_Videojuego categoria_Videojuego) {
        categoria_VideojuegoService.crear(categoria_Videojuego);
    }

    @GetMapping("/get")
    public List<Categoria_Videojuego> getAll(){
        return categoria_VideojuegoService.getAll();
    }

    @DeleteMapping("/delete/{id_categoria}/{id_videojuego}")
    public void delete(@PathVariable int id_categoria, @PathVariable int id_videojuego) {
        categoria_VideojuegoService.delete(id_categoria, id_videojuego);
    }
}
