package com.sprinboot.springweb.servicio.impl;

import com.sprinboot.springweb.modelo.Entidad1;
import com.sprinboot.springweb.repositorio.Entidad1Repository;
import com.sprinboot.springweb.serviciooo.Entidad1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class Entidad1ServiceImpl implements Entidad1Service {

    private final Entidad1Repository entidad1Repository;

    public Entidad1ServiceImpl(Entidad1Repository entidad1Repository) {
        this.entidad1Repository = entidad1Repository;
    }

    @Override
    public List<Entidad1> obtenerTodasLasEntidades() {
        return entidad1Repository.findAll();
    }

    @Override
    public Entidad1 obtenerEntidad1PorId(Long id) {
        return entidad1Repository.findById(id).orElse(null);
    }

    @Override
    public void crearEntidad1(Entidad1 entidad1) {
        entidad1Repository.save(entidad1);
    }

    @Override
    public void actualizarEntidad1(Entidad1 entidad1) {
        entidad1Repository.save(entidad1);
    }

    @Override
    public void eliminarEntidad1(Long id) {
        entidad1Repository.deleteById(id);
    }
}