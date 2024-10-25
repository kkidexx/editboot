package com.sprinboot.springweb.servicio.impl;

import com.sprinboot.springweb.modelo.Entidad3;
import com.sprinboot.springweb.repositorio.Entidad3Repository;
import com.sprinboot.springweb.serviciooo.Entidad3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class Entidad3ServiceImpl implements Entidad3Service {

    private final Entidad3Repository entidad3Repository;

    public Entidad3ServiceImpl(Entidad3Repository entidad3Repository) {
        this.entidad3Repository = entidad3Repository;
    }

    @Override
    public List<Entidad3> obtenerTodasLasEntidades() {
        return entidad3Repository.findAll();
    }

    @Override
    public Entidad3 obtenerEntidad3PorId(Long id) {
        return entidad3Repository.findById(id).orElse(null);
    }

    @Override
    public void crearEntidad3(Entidad3 entidad3) {
        entidad3Repository.save(entidad3);
    }

    @Override
    public void actualizarEntidad3(Entidad3 entidad3) {
        entidad3Repository.save(entidad3);
    }

    @Override
    public void eliminarEntidad3(Long id) {
        entidad3Repository.deleteById(id);
    }
}