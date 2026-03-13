package com.itson.org.gestionproductos.ProductoService;

import com.itson.org.gestionproductos.Repository.ProductoRepository;
import com.itson.org.gestionproductos.Exception.ProductoNotFoundException;
import com.itson.org.gestionproductos.Exception.StockInsuficienteException;
import com.itson.org.gestionproductos.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements IProductoService {

    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoServiceImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    @Override
    public List<Producto> listarProductos() {
        List<Producto> productos = productoRepository.findAll();

        if (productos.isEmpty()) {
            throw new RuntimeException("No hay productos registrados");
        }

        return productos;
    }


    @Override
    public void reducirStock(Long id, int cantidad) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }

        // Verificar que hay suficiente stock
        if (producto.getStock() < cantidad) {
            throw new StockInsuficienteException(producto.getStock(), cantidad);
        }

        productoRepository.updateStockProducto(id, producto.getStock() - cantidad);


    }
}