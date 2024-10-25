package com.sprinboot.springweb.serviciooo;

import com.sprinboot.springweb.modelo.Entidad3;

import java.util.List;

public interface Entidad3Service {
    List<Entidad3> obtenerTodasLasEntidades();
    Entidad3 obtenerEntidad3PorId(Long id);
    void crearEntidad3(Entidad3 entidad3);
    void actualizarEntidad3(Entidad3 entidad3);
    void eliminarEntidad3(Long id);
}