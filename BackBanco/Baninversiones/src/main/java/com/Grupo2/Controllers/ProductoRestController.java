package com.Grupo2.Controllers;

import com.Grupo2.Models.Producto;
import com.Grupo2.Services.ProductoServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/productos")
public class ProductoRestController {
    @Autowired
    ProductoServicesImpl productoServices;

    @GetMapping("/")
    public List<Producto> listaDeProductos(){
        List<Producto> showList = productoServices.listaDeProducto();
        return showList;
    }

}
