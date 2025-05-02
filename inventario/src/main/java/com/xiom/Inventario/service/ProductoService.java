package com.xiom.Inventario.service;


import com.xiom.Inventario.dao.ProductoRepository;
import com.xiom.Inventario.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductoService  {

    @Autowired
    private ProductoRepository productoRepository;

    public  List<Producto> ListaProductos(){
        return  productoRepository.findAll();
    }
}
s+