package co.com.cesde.tienda.service;

import co.com.cesde.tienda.modelo.ClienteModelo;
import co.com.cesde.tienda.modelo.ProductoModelo;

public class TestService {


    public static void main(String[] args) {


        ProductoModelo pm = new ProductoModelo();
        ProductoService ps = new ProductoService();

        //ps.crearProducto(pm);
        //ps.consultarProducto();
        //ps.eliminarProducto();
        //ps.actualizarProducto(pm);
        //ps.consultarProducto();
        ClienteModelo cm = new ClienteModelo();
        ClienteService cs = new ClienteService();

        //cs.crearCliente(cm);
        //cs.consultarCLiente();
        //cs.eliminarCliente();
        cs.actualizarCliente(cm);


    }




}
