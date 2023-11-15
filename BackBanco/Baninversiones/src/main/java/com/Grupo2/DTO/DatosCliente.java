package com.Grupo2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DatosCliente {
    private String servicioPacId;
    private String rut;
    private String nombreCliente;
    private String nombreBanco;
    private Long cuentasId;
    private Long monto;
    private String nombreProducto;


}
