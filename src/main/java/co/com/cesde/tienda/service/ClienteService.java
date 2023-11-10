package co.com.cesde.tienda.service;

import co.com.cesde.tienda.dao.ClienteDao;
import co.com.cesde.tienda.dao.ProductoDao;
import co.com.cesde.tienda.modelo.ClienteModelo;
import co.com.cesde.tienda.modelo.ProductoModelo;

import java.util.Scanner;

public class ClienteService {
    Scanner sc = new Scanner(System.in);
    public void crearCliente(ClienteModelo cm){
        System.out.println("Ingrese su documento");
        String idDocumento = sc.nextLine();
        cm.setIdDocumento(idDocumento);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        cm.setNombre(nombre);
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        cm.setAppelido(apellido);
        System.out.println("Ingrese su correo");
        String correo = sc.nextLine();
        cm.setCorreo(correo);
        System.out.println("Ingrese su contraseña");
        String contrasena = sc.nextLine();
        cm.setContrasena(contrasena);

        ClienteDao.crearClienteDB(cm);
    }
    public void consultarCLiente(){
        ClienteDao.consultarClienteDB();
    }

    public void eliminarCliente(){
        System.out.println("ingrese el documento de el cliente a elimianr");
        String documentoEliminar = sc.nextLine();

        ClienteDao.eliminarCliente(documentoEliminar);
    }

    public void actualizarCliente( ClienteModelo cm){


        System.out.println("Actualizar 1: documento | 2: nombre | 3: apellido | 4: correo | 5: contraseña ");

        int opc = sc.nextInt();
        sc.skip("\n");

        if (opc == 1){

            System.out.println("Ingrese el nuevo documento:");
            String nuevoDocumento= sc.nextLine();

            System.out.println("Ingrese el documento del cliente a actualizar ");
            String idDocumento= sc.nextLine();

            cm.setIdDocumento(nuevoDocumento);


            cm.setOpc(opc);

            ClienteDao.actualizarCliente(cm);
        }else if(opc==2){
            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre= sc.nextLine();

            System.out.println("Indique el documento del usuario a actualizar: ");
            String idDocumento= sc.nextLine();

            cm.setNombre(nuevoNombre);
            cm.setIdDocumento(idDocumento);

            cm.setOpc(opc);

            ClienteDao.actualizarCliente(cm);

        }else if(opc == 3){
            System.out.println("Ingrese el nuevo apellido:");
            String nuevoApellido= sc.nextLine();

            System.out.println("Indique el documento del cliente a actualizar: ");
            String idDocumento= sc.nextLine();

            cm.setAppelido(nuevoApellido);
            cm.setIdDocumento(idDocumento);

            cm.setOpc(opc);

            ClienteDao.actualizarCliente(cm);
        } else if (opc == 4) {
            System.out.println("Ingrese el nuevo correo");
            String nuevoCorreo = sc.nextLine();
            System.out.println("Indique el documento del cliente a actualizar");
            String idDocumento = sc.nextLine();

            cm.setCorreo(nuevoCorreo);
            cm.setIdDocumento(idDocumento);
            cm.setOpc(opc);
            ClienteDao.actualizarCliente(cm);
        } else if (opc == 5) {
            System.out.println("Ingrese la contraseña nueva");
            String nuevaContrasena = sc.nextLine();
            System.out.println("Indique el documento del cliente a actualizar");
            String idDocumento = sc.nextLine();

            cm.setContrasena(nuevaContrasena);
            cm.setIdDocumento(idDocumento);
            cm.setOpc(opc);
            ClienteDao.actualizarCliente(cm);
        } else{
            System.out.println("Ingrese una opción valida");
        }
    }
}
