package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Valoracion;
import com.example.ProyectoDBD9.services.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valoracion")
public class ValoracionController {
    private final ValoracionService valoracionService;

    @Autowired
    public ValoracionController(ValoracionService valoracionService) {
        this.valoracionService = valoracionService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Valoracion valoracion) {
        if(valoracionService.crear(valoracion)){
            return "Valoracion creada correctamente";
        } else return "Error al crear la valoracion";
    }

    @GetMapping("/get")
    public List<Valoracion> getAll(){
        return valoracionService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Valoracion valoracion) {
        valoracionService.update(valoracion);
    }

    @DeleteMapping("/delete/{id_valoracion}")
    public void delete(@PathVariable int id_valoracion) {
        valoracionService.delete(id_valoracion);
    }
}
