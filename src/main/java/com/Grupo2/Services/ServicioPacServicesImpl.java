package com.Grupo2.Services;

import com.Grupo2.DTO.BusquedaDTO;
import com.Grupo2.DTO.DatosCliente;
import com.Grupo2.Models.ServicioPac;
import com.Grupo2.Repositories.ServicioPacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ServicioPacServicesImpl implements ServicioPacServices {
    @Autowired
    ServicioPacRepository servicioPacRepository;

    @Override
    public List<DatosCliente> buscarDatosCliente(BusquedaDTO busqueda) {

        if (busqueda.getProducto() != 0 && busqueda.getFechapago() != 0 && busqueda.getRut() != "") {

            return servicioPacRepository
                    .findCustomQueryResults(
                            busqueda.getRut(),
                            busqueda.getProducto(),
                            busqueda.getFechapago());
        }
        if (busqueda.getProducto() != 0 && busqueda.getFechapago() == 0 && busqueda.getRut() != "") {

            return servicioPacRepository
                    .findByProductAndRut(
                            busqueda.getRut(),
                            busqueda.getProducto()
                    );
        }
        if (busqueda.getProducto() != 0 && busqueda.getFechapago() != 0 && busqueda.getRut() == "") {
            return servicioPacRepository.findByProductAndDay(
                    busqueda.getProducto(),
                    busqueda.getFechapago()
            );
        }
        if (busqueda.getRut() != "" && busqueda.getFechapago() != 0 && busqueda.getProducto() == 0) {
            return servicioPacRepository.findByRutAndDay(
                    busqueda.getRut(),
                    busqueda.getFechapago()
            );
        }
        if (busqueda.getRut() != "" && busqueda.getFechapago() == 0 && busqueda.getProducto() == 0) {
            return servicioPacRepository.findByRut(
                    busqueda.getRut()
            );
        }
        if (busqueda.getRut() == "" && busqueda.getFechapago() != 0 && busqueda.getProducto() == 0) {
            return servicioPacRepository.findByDay(
                    busqueda.getFechapago()
            );
        }

        if (busqueda.getRut() == "" && busqueda.getFechapago() == 0 && busqueda.getProducto() != 0) {
            return servicioPacRepository.findByProduct(
                    busqueda.getProducto()
            );
        }
        return servicioPacRepository.findByAll();
    }
}
