package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Ranking_Videojuego;
import com.example.ProyectoDBD9.services.Ranking_VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ranking_videojuego")
public class Ranking_VideojuegoController {
    private final Ranking_VideojuegoService ranking_VideojuegoService;

    @Autowired
    public Ranking_VideojuegoController(Ranking_VideojuegoService ranking_VideojuegoService) {
        this.ranking_VideojuegoService = ranking_VideojuegoService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Ranking_Videojuego ranking_Videojuego) {
        if(ranking_VideojuegoService.crear(ranking_Videojuego)){
            return "Boleta creada correctamente";
        } else return "Error al crear la boleta";
    }

    @GetMapping("/get")
    public List<Ranking_Videojuego> getAll(){
        return ranking_VideojuegoService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Ranking_Videojuego ranking_Videojuego) {
        ranking_VideojuegoService.update(ranking_Videojuego);
    }

    @DeleteMapping("/delete/{id_ranking}")
    public void delete(@PathVariable int id_ranking) {
        ranking_VideojuegoService.delete(id_ranking);
    }
}
