package com.itson.org.gestionproductos.Exception;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(int stock, int cantidad) {
        super("no hay suficiente Stock para la  cantidad de " + cantidad + " por producto " + stock);
    }
}
