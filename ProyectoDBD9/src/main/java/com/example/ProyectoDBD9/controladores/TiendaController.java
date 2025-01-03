package com.example.ProyectoDBD9.controladores;


import com.example.ProyectoDBD9.models.Tienda;
import com.example.ProyectoDBD9.services.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tienda")
public class TiendaController {
    private final TiendaService tiendaService;

    @Autowired
    public TiendaController(TiendaService tiendaService) {
        this.tiendaService = tiendaService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Tienda tienda) {
        if(tiendaService.crear(tienda)){
            return "Tienda creada correctamente";
        } else return "Error al crear la tienda";
    }

    @GetMapping("/get")
    public List<Tienda> getAll(){
        return tiendaService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Tienda tienda) {
        tiendaService.update(tienda);
    }

    @DeleteMapping("/delete/{id_tienda}")
    public void delete(@PathVariable int id_tienda) {
        tiendaService.delete(id_tienda);
    }
}
