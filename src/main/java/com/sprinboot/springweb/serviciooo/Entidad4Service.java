package com.sprinboot.springweb.serviciooo;

import com.sprinboot.springweb.modelo.Entidad4;

import java.util.List;

public interface Entidad4Service {
    List<Entidad4> obtenerTodasLasEntidades();
    Entidad4 obtenerEntidad4PorId(Long id);
    void crearEntidad4(Entidad4 entidad4);
    void actualizarEntidad4(Entidad4 entidad4);
    void eliminarEntidad4(Long id);
}