package com.itson.org.springboot.Controller;


import Entity.Message;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private List<Message> mensajes = new ArrayList<>();

    public MessageController() {
        mensajes.add(new Message(1,"MENSAJE 1"));
        mensajes.add(new Message(2,"MENSAJE 2"));

    }

    @GetMapping()
    public List<Message> getMensajes() {
        return mensajes;
    }

    //indicar un endpoint
    //agregar param pero no es valor ni atributo
    //uso de variable
    @GetMapping("/{id}")
    public Message obtenerMensajePorId(@PathVariable int id){
        Optional<Message> message = mensajes.stream().filter(m -> m.getId() == id)
                .findFirst();;
        return message.orElse(null);

    }

    //crear Mensaje
    //se crea con un JSon enviado desde el frontend
    @PostMapping
    public Message crearMensaje(@RequestBody Message mensaje){
        mensajes.add(mensaje);
        return mensaje;
    }

    @DeleteMapping
    public void eliminarMensaje(@PathVariable int id){
        mensajes.removeIf(m -> m.getId() == id);
    }
}
