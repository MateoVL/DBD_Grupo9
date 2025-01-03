package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Categoria;
import com.example.ProyectoDBD9.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Categoria categoria) {
        if(categoriaService.crear(categoria)){
            return "Categoria creadd correctamente";
        } else return "Error al crear la categoria";
    }

    @GetMapping("/get")
    public List<Categoria> getAll(){
        return categoriaService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Categoria categoria) {
        categoriaService.update(categoria);
    }

    @DeleteMapping("/delete/{id_categoria}")
    public void delete(@PathVariable int id_categoria) {
        categoriaService.delete(id_categoria);
    }
}
