package com.sprinboot.springweb.serviciooo;

import com.sprinboot.springweb.modelo.Entidad2;

import java.util.List;

public interface Entidad2Service {
    List<Entidad2> obtenerTodasLasEntidades();
    Entidad2 obtenerEntidad2PorId(Long id);
    void crearEntidad2(Entidad2 entidad2);
    void actualizarEntidad2(Entidad2 entidad2);
    void eliminarEntidad2(Long id);
}