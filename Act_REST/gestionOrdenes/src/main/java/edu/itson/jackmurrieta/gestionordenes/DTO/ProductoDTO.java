package edu.itson.jackmurrieta.gestionordenes.DTO;

public class ProductoDTO {
    public Long id;
    public String name;
    public Double price;

    public ProductoDTO() {

    }

    public ProductoDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}