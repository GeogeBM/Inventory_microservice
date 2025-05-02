package com.xiom.Inventario.API;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ConectionApi {

    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Saludo(){
        return  "Hola mundo";
    }

    
}
