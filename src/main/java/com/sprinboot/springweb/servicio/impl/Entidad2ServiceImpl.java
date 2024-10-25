package com.sprinboot.springweb.servicio.impl;

import com.sprinboot.springweb.modelo.Entidad2;
import com.sprinboot.springweb.repositorio.Entidad2Repository;
import com.sprinboot.springweb.serviciooo.Entidad2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Entidad2ServiceImpl implements Entidad2Service {

    private final Entidad2Repository entidad2Repository;

    public Entidad2ServiceImpl(Entidad2Repository entidad2Repository) {
        this.entidad2Repository = entidad2Repository;
    }

    @Override
    public List<Entidad2> obtenerTodasLasEntidades() {
        return entidad2Repository.findAll();
    }

    @Override
    public Entidad2 obtenerEntidad2PorId(Long id) {
        return entidad2Repository.findById(id).orElse(null);
    }

    @Override
    public void crearEntidad2(Entidad2 entidad2) {
        entidad2Repository.save(entidad2);
    }

    @Override
    public void actualizarEntidad2(Entidad2 entidad2) {
        entidad2Repository.save(entidad2);
    }

    @Override
    public void eliminarEntidad2(Long id) {
        entidad2Repository.deleteById(id);
    }
}