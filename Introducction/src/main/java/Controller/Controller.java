package Controller;

//controlador prueba
//Controlador rest contiene anotaciones

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controlador REST combina @Controller y @ResponseBody -> return normalmente JSON
//Clase en Java que expone rutas HTTP
@RestController
//identificar controlador en la url como /myController o dependiendo del recurso asociado /Usuario (ejemplo)
@RequestMapping("/users")
//enviar peticiones y recibir respuestas en formato JSON
public class Controller {
    //metodos que exponen rutas consumidad por el fronted

    //metodos HTTP
    /*
    * GET = OBTENER
    * POST = CREAR
    * PUT = ACTUALIZAR
    * DELETE = ELIMINAR
    * PATCH = actualizar campos seleccionados
    *
    * ANOTACIONES SON
    *
    * nombreMetodo + Mapping
    * */



    //Tipos de Param en metodos GET

    //retorna algun dato por ser metodo get
    @GetMapping("/saludar")
    public String saludarUser(){
        return "Hola ";
    }

    //metodo get con parametro
    //parametro viene en la query URL (Usado en filtros o atributos)
    @GetMapping("/saludar")
    public String saludarUserNombre(@RequestParam String nombre){
        return "Hola "+nombre;
    }

    //nombre Opcional
    @GetMapping("/SaludarNombreOpcional")
    //required = false - > paramOpcional
    public String saludarNombreOpcional(@RequestParam (required = false) String nombre){
        return "Hola "+nombre;
    }

    //valor por defecto

    @GetMapping("/saludarDefaultValue")
    public String saludarDefaultValue(@RequestParam (defaultValue = "invitado") String nombre){
        return "Hola "+nombre;
    }



}
