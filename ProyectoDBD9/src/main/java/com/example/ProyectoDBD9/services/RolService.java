package com.example.ProyectoDBD9.services;

import com.example.ProyectoDBD9.models.Rol;
import com.example.ProyectoDBD9.repositories.RolRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    private final RolRepositoryImp rolRepositoryImp;

    @Autowired
    public RolService(RolRepositoryImp rolRepositoryImp) {
        this.rolRepositoryImp = rolRepositoryImp;
    }

    public boolean crear(Rol rol) {
        rolRepositoryImp.crear(rol);
        return true;
    }

    public List<Rol> getAll() {
        return rolRepositoryImp.getAll();
    }

    public void update(Rol rol) {
        rolRepositoryImp.update(rol);
    }

    public void delete(int id_rol) {
        rolRepositoryImp.delete(id_rol);
    }
}
