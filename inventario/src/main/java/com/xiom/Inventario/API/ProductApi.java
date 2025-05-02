package com.xiom.Inventario.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiom.Inventario.models.Producto;
import com.xiom.Inventario.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductApi {

    @Autowired
    private ProductoService productoService;

    @RequestMapping(value = "/productos",method = RequestMethod.GET)
    public List<Producto> getAllProductos(){
        return productoService.ListaProductos();
    }
}
