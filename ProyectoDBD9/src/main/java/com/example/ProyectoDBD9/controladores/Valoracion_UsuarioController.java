package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Valoracion_Usuario;
import com.example.ProyectoDBD9.services.Valoracion_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valoracion_usuario")
public class Valoracion_UsuarioController {
    private final Valoracion_UsuarioService valoracion_UsuarioService;

    @Autowired
    public Valoracion_UsuarioController(Valoracion_UsuarioService valoracion_UsuarioService) {
        this.valoracion_UsuarioService = valoracion_UsuarioService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Valoracion_Usuario valoracion_Usuario) {
        valoracion_UsuarioService.crear(valoracion_Usuario);
    }

    @GetMapping("/get")
    public List<Valoracion_Usuario> getAll(){
        return valoracion_UsuarioService.getAll();
    }

    @DeleteMapping("/delete/{id_valoracion}/{id_usuario}")
    public void delete(@PathVariable int id_valoracion, @PathVariable int id_usuario) {
        valoracion_UsuarioService.delete(id_valoracion, id_usuario);
    }
}
