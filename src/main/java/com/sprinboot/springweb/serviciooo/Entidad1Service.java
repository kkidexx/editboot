package com.sprinboot.springweb.serviciooo;

import com.sprinboot.springweb.modelo.Entidad1;

import java.util.List;

public interface Entidad1Service {
    List<Entidad1> obtenerTodasLasEntidades();
    Entidad1 obtenerEntidad1PorId(Long id);
    void crearEntidad1(Entidad1 entidad1);
    void actualizarEntidad1(Entidad1 entidad1);
    void eliminarEntidad1(Long id);
}