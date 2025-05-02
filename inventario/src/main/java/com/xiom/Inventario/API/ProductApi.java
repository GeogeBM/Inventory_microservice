package com.xiom.Inventario.API;

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
