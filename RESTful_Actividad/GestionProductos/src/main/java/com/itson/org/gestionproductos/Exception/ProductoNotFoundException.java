package com.itson.org.gestionproductos.Exception;

public class ProductoNotFoundException extends RuntimeException {

    // Por ID
    public ProductoNotFoundException(Long id) {
        super("Producto con ID " + id + " no encontrado");
    }

    // Por nombre
    public ProductoNotFoundException(String nombre) {
        super("Producto con nombre '" + nombre + "' no encontrado");
    }
}