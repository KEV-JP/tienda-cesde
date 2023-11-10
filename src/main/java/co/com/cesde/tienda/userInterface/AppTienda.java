package co.com.cesde.tienda.userInterface;

import co.com.cesde.tienda.modelo.ClienteModelo;
import co.com.cesde.tienda.modelo.ProductoModelo;
import co.com.cesde.tienda.service.ClienteService;
import co.com.cesde.tienda.service.ProductoService;

import java.util.Scanner;

public class AppTienda {
    Scanner sc = new Scanner(System.in);
    ProductoService productoService = new ProductoService();
    ProductoModelo productoModelo = new ProductoModelo();
    ClienteModelo clienteModelo = new ClienteModelo();
    ClienteService clienteService = new ClienteService();


    public void menugeneral(){
        int init = 1;
        System.out.println("Oprima 1 para iniciar");
        init = sc.nextInt();
        do {
            System.out.println("1. Productos \n2. Cliente \n3. Compra \n4. salir");
            int opcPrincipal = sc.nextInt();
            switch(opcPrincipal){
                case 1:
                    System.out.println();
                    menuApp();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    menuCliente();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliendo..");
                    init = 0;
                default:
                    System.out.println("Elija una opcion valida");

            }

        }while(init != 0);
    }



    public void menuApp(){
        int init = 1;
        System.out.println("Oprima 1 para iniciar");
        init = sc.nextInt();
    do {
        System.out.println("1. Registrar \n2. Consultar producto \n3. Actualizar producto \n4. Eliminar Producto");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Registrar producto");
                productoService.crearProducto(productoModelo);
                break;
            case 2:
                System.out.println("Consultar Producto");
                productoService.consultarProducto();
                break;
            case 3:
                System.out.println("Actualizar producto");
                productoService.actualizarProducto(productoModelo);
                break;
            case 4:
                System.out.println("Eliminar producto");
                productoService.eliminarProducto();
                break;
            case 5:
                System.out.println("Saliendo...");
                init = 0;
            default:
                System.out.println("Elija una opcion valida");
        }

    }while(init != 0);
    }
    public void menuCliente(){
        int init = 1;
        System.out.println("Oprima 1 para iniciar");
        init = sc.nextInt();

        do {
            System.out.println("1. Registrar Cliente \n2. Consultar Cliente \n3. Actualizar cliente \n4. Eliminar Cliente");
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Registrar cliente");
                    clienteService.crearCliente(clienteModelo);
                    break;
                case 2:
                    System.out.println("Consultar cliente");
                    clienteService.consultarCLiente();
                    break;
                case 3:
                    System.out.println("Actualizar cliente");
                    clienteService.actualizarCliente(clienteModelo);
                    break;
                case 4:
                    System.out.println("Eliminar cliente");
                    clienteService.eliminarCliente();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    init = 0;
                default:
                    System.out.println("Elija una opcion valida");
            }


        }while (init != 0);
    }


}
