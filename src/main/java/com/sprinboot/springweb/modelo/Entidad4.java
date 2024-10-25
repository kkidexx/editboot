package com.sprinboot.springweb.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Entidad4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntidad4;

    private String detalle;
}