package com.itson.org.gestionproductos.ProductoService;

import com.itson.org.gestionproductos.entity.Producto;

import java.util.List;

public interface IProductoService {


    List<Producto> listarProductos();

    public void reducirStock(Long id, int nuevoStock);


}
