package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.services.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaController {
    private final BoletaService boletaService;

    @Autowired
    public BoletaController(BoletaService boletaService) {
        this.boletaService = boletaService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Boleta boleta) {
        if(boletaService.crear(boleta)){
            return "Boleta creada correctamente";
        } else return "Error al crear la boleta";
    }

    @GetMapping("/get")
    public List<Boleta> getAll(){
        return boletaService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Boleta boleta) {
        boletaService.update(boleta);
    }

    @DeleteMapping("/delete/{id_boleta}")
    public void delete(@PathVariable int id_boleta) {
        boletaService.delete(id_boleta);
    }
}
