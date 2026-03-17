package edu.itson.jackmurrieta.gestionordenes.Controller;

import edu.itson.jackmurrieta.gestionordenes.DTO.ProductoDTO;
import edu.itson.jackmurrieta.gestionordenes.Service.ProductoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {

    @Autowired
    private ProductoServiceClient productClient;

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestParam Long productId) {

        //Llamada distribuida al otro microservicio
        ProductoDTO product = productClient.getById(productId);

        if (product == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity
                .status(201)
                .body("Pedido creado para: " + product.name);
    }
}