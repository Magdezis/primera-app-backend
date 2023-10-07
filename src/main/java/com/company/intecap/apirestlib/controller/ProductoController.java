package com.company.intecap.apirestlib.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.intecap.apirestlib.model.Productos;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductoController {

    @GetMapping("/productos")

    public ResponseEntity<List<Productos>> getProductos(){

        Productos c1 = new Productos(1, "Mercancia", "otr");
        List<Productos> producto = List.of(c1);

        return new ResponseEntity<>(producto, HttpStatus.OK);


    }
}
