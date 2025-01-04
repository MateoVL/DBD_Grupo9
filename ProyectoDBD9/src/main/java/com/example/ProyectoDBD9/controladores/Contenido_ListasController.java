package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Contenido_Listas;
import com.example.ProyectoDBD9.services.Contenido_ListasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contenido_listas")
public class Contenido_ListasController {
    private final Contenido_ListasService contenido_ListasService;

    @Autowired
    public Contenido_ListasController(Contenido_ListasService contenido_ListasService) {
        this.contenido_ListasService = contenido_ListasService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Contenido_Listas contenido_Listas) {
        contenido_ListasService.crear(contenido_Listas);
    }

    @GetMapping("/get")
    public List<Contenido_Listas> getAll(){
        return contenido_ListasService.getAll();
    }

    @DeleteMapping("/delete/{id_lista}/{id_videojuego}")
    public void delete(@PathVariable int id_lista, @PathVariable int id_videojuego) {
        contenido_ListasService.delete(id_lista, id_videojuego);
    }
}
