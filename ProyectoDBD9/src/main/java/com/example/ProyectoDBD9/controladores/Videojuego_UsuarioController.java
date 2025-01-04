package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Videojuego_Usuario;
import com.example.ProyectoDBD9.services.Videojuego_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videojuego_usuario")
public class Videojuego_UsuarioController {
    private final Videojuego_UsuarioService videojuego_UsuarioService;

    @Autowired
    public Videojuego_UsuarioController(Videojuego_UsuarioService videojuego_UsuarioService) {
        this.videojuego_UsuarioService = videojuego_UsuarioService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Videojuego_Usuario videojuego_Usuario) {
        videojuego_UsuarioService.crear(videojuego_Usuario);
    }

    @GetMapping("/get")
    public List<Videojuego_Usuario> getAll(){
        return videojuego_UsuarioService.getAll();
    }

    @DeleteMapping("/delete/{id_videojuego}/{id_usuario}")
    public void delete(@PathVariable int id_videojuego, @PathVariable int id_usuario) {
        videojuego_UsuarioService.delete(id_videojuego, id_usuario);
    }
}
