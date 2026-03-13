package com.itson.org.gestionproductos.service;


import com.itson.org.gestionproductos.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public List<Producto> findAll();

    //ES UN FETCH
    public void actualizarStock(int nuevoStock);
}
