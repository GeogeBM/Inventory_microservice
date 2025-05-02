package com.xiom.Inventario.service;


import com.xiom.Inventario.dao.ProductoRepository;
import com.xiom.Inventario.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService  {

    @Autowired
    private ProductoRepository productoRepository;

    public  List<Producto> ListaProductos(){
        return  productoRepository.findAll();
    }
}
