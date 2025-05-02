package com.xiom.Inventario.API;

import com.xiom.Inventario.models.Producto;
import com.xiom.Inventario.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConectionApi {

    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Saludo(){
        return  "Hola mundo";
    }

    
}
