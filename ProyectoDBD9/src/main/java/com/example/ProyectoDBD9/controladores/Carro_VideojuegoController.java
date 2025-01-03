package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Carro_Videojuego;
import com.example.ProyectoDBD9.services.Carro_VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro_videojuego")
public class Carro_VideojuegoController {
    private final Carro_VideojuegoService carro_VideojuegoService;

    @Autowired
    public Carro_VideojuegoController(Carro_VideojuegoService carro_VideojuegoService) {
        this.carro_VideojuegoService = carro_VideojuegoService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Carro_Videojuego carro_Videojuego) {
        if(carro_VideojuegoService.crear(carro_Videojuego)){
            return "Boleta creada correctamente";
        } else return "Error al crear la boleta";
    }

    @GetMapping("/get")
    public List<Carro_Videojuego> getAll(){
        return carro_VideojuegoService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Carro_Videojuego carro_Videojuego) {
        carro_VideojuegoService.update(carro_Videojuego);
    }

    @DeleteMapping("/delete/{id_carro}")
    public void delete(@PathVariable int id_carro) {
        carro_VideojuegoService.delete(id_carro);
    }
}
