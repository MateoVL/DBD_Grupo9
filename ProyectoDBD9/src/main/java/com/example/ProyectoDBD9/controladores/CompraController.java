package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Compra;
import com.example.ProyectoDBD9.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    private final CompraService compraService;

    @Autowired
    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Compra compra) {
        compraService.crear(compra);
    }

    @GetMapping("/get")
    public List<Compra> getAll(){
        return compraService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Compra compra) {
        compraService.update(compra);
    }

    @DeleteMapping("/delete/{id_compra}")
    public void delete(@PathVariable int id_compra) {
        compraService.delete(id_compra);
    }
}
