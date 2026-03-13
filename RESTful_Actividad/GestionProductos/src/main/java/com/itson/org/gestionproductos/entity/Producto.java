package com.itson.org.gestionproductos.entity;

import lombok.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos") //nombre tabla en BD
public class Producto {
    @Id                                                    // Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")// Auto-incremento
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "stock")
    private int stock;
}
