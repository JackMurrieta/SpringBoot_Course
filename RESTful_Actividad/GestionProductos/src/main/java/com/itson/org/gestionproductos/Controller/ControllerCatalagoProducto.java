package com.itson.org.gestionproductos.Controller;

import com.itson.org.gestionproductos.ProductoService.IProductoService;
import com.itson.org.gestionproductos.entity.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControllerCatalagoProducto {

    private final IProductoService productoService;

    public ControllerCatalagoProducto(IProductoService productoService) {
        this.productoService = productoService;
    }

    // GET /productos
    @GetMapping
    public ResponseEntity<List<Producto>> obtenerTodos() {
        return ResponseEntity.ok(productoService.listarProductos());
    }


    // PUT /productos/{id}/stock Microservicio órdenes llama este endpoint
    @PutMapping("/{id}/stock")
    public ResponseEntity<Void> reducirStock(@PathVariable Long id,
                                             @RequestParam int cantidad) {
        productoService.reducirStock(id, cantidad);
        return ResponseEntity.ok().build();
    }
}