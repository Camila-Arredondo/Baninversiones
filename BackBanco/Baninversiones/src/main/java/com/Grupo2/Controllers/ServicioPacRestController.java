package com.Grupo2.Controllers;

import com.Grupo2.DTO.BusquedaDTO;
import com.Grupo2.DTO.DatosCliente;
import com.Grupo2.Models.ServicioPac;
import com.Grupo2.Services.ServicioPacServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/pac")
public class ServicioPacRestController {
    @Autowired
    ServicioPacServicesImpl servicioPacServices;


    @PostMapping("/search")
    public List<DatosCliente> listaDeServicios(@RequestBody BusquedaDTO busq) {

        var resultado = servicioPacServices.buscarDatosCliente(busq);

        return resultado;

    }


}