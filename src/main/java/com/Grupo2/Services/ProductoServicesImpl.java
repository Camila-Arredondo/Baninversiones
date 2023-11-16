package com.Grupo2.Services;

import com.Grupo2.Models.Producto;
import com.Grupo2.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductoServicesImpl implements ProductoServices {
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> listaDeProducto() {
        return productoRepository.findAll();
    }


}


