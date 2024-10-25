package com.sprinboot.springweb.servicio.impl;

import com.sprinboot.springweb.modelo.Entidad4;
import com.sprinboot.springweb.repositorio.Entidad4Repository;
import com.sprinboot.springweb.serviciooo.Entidad4Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Entidad4ServiceImpl implements Entidad4Service {

    private final Entidad4Repository entidad4Repository;

    public Entidad4ServiceImpl(Entidad4Repository entidad4Repository) {
        this.entidad4Repository = entidad4Repository;
    }

    @Override
    public List<Entidad4> obtenerTodasLasEntidades() {
        return entidad4Repository.findAll();
    }

    @Override
    public Entidad4 obtenerEntidad4PorId(Long id) {
        return entidad4Repository.findById(id).orElse(null);
    }

    @Override
    public void crearEntidad4(Entidad4 entidad4) {
        entidad4Repository.save(entidad4);
    }

    @Override
    public void actualizarEntidad4(Entidad4 entidad4) {
        entidad4Repository.save(entidad4);
    }

    @Override
    public void eliminarEntidad4(Long id) {
        entidad4Repository.deleteById(id);
    }
}