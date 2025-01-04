package com.example.ProyectoDBD9.controladores;

import com.example.ProyectoDBD9.models.Ubicacion;
import com.example.ProyectoDBD9.services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ubicacion")
public class UbicacionController {
    private final UbicacionService ubicacionService ;

    @Autowired
    public UbicacionController(UbicacionService ubicacionService) {
        this.ubicacionService = ubicacionService;
    }

    @PostMapping("/crear")
    public String crear(@RequestBody Ubicacion ubicacion) {
        if(ubicacionService.crear(ubicacion)){
            return "Ubicación creada correctamente";
        } else {
            return "Error al crear la Ubicacion";
        }
    }

    @GetMapping("/get")
    public List<Ubicacion> getAll(){
        return ubicacionService.getAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Ubicacion ubicacion) {
        ubicacionService.update(ubicacion);
    }

    @DeleteMapping("/delete/{Id_Ubicacion}")
    public void delete(@PathVariable int Id_Ubicacion) {
        ubicacionService.delete(Id_Ubicacion);
    }
}
