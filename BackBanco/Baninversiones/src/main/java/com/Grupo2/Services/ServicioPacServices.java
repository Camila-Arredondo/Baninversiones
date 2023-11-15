package com.Grupo2.Services;

import com.Grupo2.DTO.BusquedaDTO;
import com.Grupo2.DTO.DatosCliente;
import com.Grupo2.Models.ServicioPac;

import java.util.Date;
import java.util.List;

public interface ServicioPacServices {

    List<DatosCliente>  buscarDatosCliente(BusquedaDTO busqueda);

}
