package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Carro_Compra;
import com.example.ProyectoDBD9.models.Carro_Videojuego;
import com.example.ProyectoDBD9.services.Carro_CompraService;
import com.example.ProyectoDBD9.services.Carro_VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro_compra")
public class Carro_CompraController {
    private final Carro_CompraService carro_CompraService;

    @Autowired
    public Carro_CompraController(Carro_CompraService carro_CompraService) {
        this.carro_CompraService = carro_CompraService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Carro_Compra carro_Compra) {
        if(carro_CompraService.crear(carro_Compra)){
            return "Boleta creada correctamente";
        } else return "Error al crear la boleta";
    }

    @GetMapping("/get")
    public List<Carro_Compra> getAll(){
        return carro_CompraService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Carro_Compra carro_Compra) {
        carro_CompraService.update(carro_Compra);
    }

    @DeleteMapping("/delete/{id_carro}")
    public void delete(@PathVariable int id_carro) { carro_CompraService.delete(id_carro); }
}
