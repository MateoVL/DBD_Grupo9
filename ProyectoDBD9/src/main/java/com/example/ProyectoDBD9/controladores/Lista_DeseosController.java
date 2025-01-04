package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Contenido_Listas;
import com.example.ProyectoDBD9.models.Lista_Deseos;
import com.example.ProyectoDBD9.services.Contenido_ListasService;
import com.example.ProyectoDBD9.services.Lista_DeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lista_deseos")
public class Lista_DeseosController {
    private final Lista_DeseosService lista_DeseosService;

    @Autowired
    public Lista_DeseosController(Lista_DeseosService lista_DeseosService) {
        this.lista_DeseosService = lista_DeseosService;
    }

    @PostMapping("/crear")
    public void crear(@RequestBody Lista_Deseos lista_Deseos) {
        lista_DeseosService.crear(lista_Deseos);
    }

    @GetMapping("/get")
    public List<Lista_Deseos> getAll(){
        return lista_DeseosService.getAll();
    }

    @DeleteMapping("/delete/{id_lista_deseos}/{id_usuario}")
    public void delete(@PathVariable int id_lista_deseos, @PathVariable int id_usuario) {
        lista_DeseosService.delete(id_lista_deseos, id_usuario);
    }
}
