package com.company.intecap.apirestlib.controller;
import org.springframework.boot.autoconfigure.data.redis.ClientResourcesBuilderCustomizer;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.company.intecap.apirestlib.model.Cliente;

import java.util.List;

@RestController
@RequestMapping("/api/v1") // prefijo de la ruta url
public class ClienteController {

    @GetMapping("/clintes")

    public List<Cliente> getClientes(){
        Cliente c1 = new Cliente(1,"Magno","Solis","no hay");
        Cliente c2 = new Cliente(2, "Melany", "Torres", "es la misma");
        List<Cliente> clientes = List.of(c1, c2);

        return clientes;
    }

    //respuestas, ejmplo del uso de clase de HTTPStatus /*


    @GetMapping("/status")
    public ResponseEntity<List<Cliente>> getClientes_dos(){
        Cliente c1 = new Cliente(3, "Solis", "otro", "ultimo ");
        List<Cliente> clientes = List.of(c1);
        return new ResponseEntity<>(clientes, HttpStatus.OK);



    }
//Obtenemos el estado correcto de la conexino,
    @GetMapping("/succes")

    public ResponseEntity<String> succes(){

        return new ResponseEntity<>("correcto", HttpStatus.OK);
    }

}
