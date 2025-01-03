package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Rol;
import com.example.ProyectoDBD9.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {
    private final RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Rol rol) {
        if(rolService.crear(rol)){
            return "Videojuego creado correctamente";
        } else return "Error al crear el videojuego";
    }

    @GetMapping("/get")
    public List<Rol> getAll(){
        return rolService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Rol rol) {
        rolService.update(rol);
    }

    @DeleteMapping("/delete/{id_rol}")
    public void delete(@PathVariable int id_rol) {
        rolService.delete(id_rol);
    }
}
