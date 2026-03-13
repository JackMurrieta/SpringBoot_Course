package com.itson.org.gestionproductos.Repository;


import com.itson.org.gestionproductos.entity.Producto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    /*
     * metodos con jpaRepository
     * save()
     * findAll()
     * deleteById
     * findByNombreProducto()
     * */

    public Optional<Producto> findByNombre(String nombre);

    //metodos de modificacion y actualizacion se necesitan de codigo mysql
    @Modifying
    @Transactional
    @Query("UPDATE Producto p SET p.stock = :nuevoStock WHERE p.id = :id")
    void updateStockProducto(@Param("id") Long id, @Param("nuevoStock") Integer nuevoStock);
}

