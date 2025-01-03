package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Usuario;
import com.example.ProyectoDBD9.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Usuario usuario) {
        if(usuarioService.crear(usuario)){
            return "Usuario creado correctamente";
        } else return "Error al crear el usuario";
    }

    @GetMapping("/get")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Usuario usuario) {
        usuarioService.update(usuario);
    }

    @DeleteMapping("/delete/{id_usuario}")
    public void delete(@PathVariable int id_usuario) {
        usuarioService.delete(id_usuario);
    }
}
