package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Videojuego_En_Tienda;
import com.example.ProyectoDBD9.services.Videojuego_En_TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videojuego_en_tienda")
public class Videojuego_En_TiendaController {
    private final Videojuego_En_TiendaService videojuego_En_TiendaService;

    @Autowired
    public Videojuego_En_TiendaController(Videojuego_En_TiendaService videojuego_En_TiendaService) {
        this.videojuego_En_TiendaService = videojuego_En_TiendaService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Videojuego_En_Tienda videojuego_En_Tienda) {
        if(videojuego_En_TiendaService.crear(videojuego_En_Tienda)){
            return "Videojuego agregado correctamente";
        } else return "Error al agregar el videojuego";
    }

    @GetMapping("/get")
    public List<Videojuego_En_Tienda> getAll(){
        return videojuego_En_TiendaService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Videojuego_En_Tienda videojuego_En_Tienda) {
        videojuego_En_TiendaService.update(videojuego_En_Tienda);
    }

    @DeleteMapping("/delete/{id_videojuego}/{id_tienda}")
    public void delete(@PathVariable int id_videojuego, @PathVariable int id_tienda) {
        videojuego_En_TiendaService.delete(id_videojuego, id_tienda);
    }
}
