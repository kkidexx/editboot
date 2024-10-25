package com.sprinboot.springweb.modelo;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Entidad2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntidad2;

    private Integer cantidad;
}