package com.example.ProyectoDBD9.services;
import com.example.ProyectoDBD9.models.Boleta;
import com.example.ProyectoDBD9.repositories.BoletaRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UbicacionService {
    private final UbicacionRepositoryImp ubicacionRepositoryImp;
    @Autowired
    public UbicacionService(UbicacionRepositoryImp UbicacionRepositoryImp) {
        this.UbicacionRepositoryImp = ubicacionRepositoryImp;
    }
    public boolean crear(Ubicacion ubicacion) {
        UbicacionRepositoryImp.crear(Ubicacion);
        return true;
    }
    public List<Ubicacion> getAll() {
        return UbicacionRepositoryImp.getAll();
    }
    public void update(Ubicacion ubicacion) {
        boletaRepositoryImp.update(ubicacion);
    }
    public void delete(int Id_Ubicacion) {UbicacionRepositoryImp.delete(Id_Ubicacion);}
}