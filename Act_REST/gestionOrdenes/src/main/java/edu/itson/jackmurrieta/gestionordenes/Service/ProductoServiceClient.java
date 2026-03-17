package edu.itson.jackmurrieta.gestionordenes.Service;

import edu.itson.jackmurrieta.gestionordenes.DTO.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;


@FeignClient(name = "productos", url = "http://localhost:8081")
public interface ProductoServiceClient {

    @GetMapping("/productos/{id}")
    ProductoDTO getById(@PathVariable Long id);

}