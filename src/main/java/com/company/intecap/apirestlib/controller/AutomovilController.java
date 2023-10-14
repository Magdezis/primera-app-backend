package com.company.intecap.apirestlib.controller;

import com.company.intecap.apirestlib.model.Automovil;
import jakarta.security.auth.message.module.ClientAuthModule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("tarea/controlador")
public class AutomovilController {

    @GetMapping("/automoviles")

    public ResponseEntity<List<Automovil>> getAutomoviles(){

        Automovil carro1 = new Automovil(1, "Mazda", 2006, "Negro", "P245GBL", 26000);
        Automovil carro2 = new Automovil(2, "Honda", 1997, "Azul multicolor", "P321YHL", 10000);
        Automovil carro3 = new Automovil(3, "Mitsubishi", 2010, "Blanco", "P435POY",32000);
        Automovil carro4 = new Automovil(4, "Yamaha", 2000, "Negro multicolor", "P564HUY", 16000);
        Automovil carro5 = new Automovil(5, "Toyota", 1995, "Azul y negro", "P123GHT", 15230);
    List<Automovil> automoviles = List.of(carro1, carro2,carro3,carro4,carro5);

    return new ResponseEntity<>(automoviles, HttpStatus.OK);
    }
}
