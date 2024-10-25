package com.sprinboot.springweb.modelo;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Entidad3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntidad3;

    private String descripcion;
}