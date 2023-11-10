package co.com.cesde.tienda.dao;

import co.com.cesde.tienda.conexion.Conexion;
import co.com.cesde.tienda.modelo.ClienteModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao {
    public static void crearClienteDB(ClienteModelo cm){
        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectionDB()){

            PreparedStatement ps = null;

            try{
                String query = "INSERT INTO cliente(id_Cliente , Nombre ,Apellido ,Correo ,Contraseña)VALUES(?,?,?,?,?)";

                ps = connect.prepareStatement(query);
                ps.setString(1,cm.getIdDocumento());
                ps.setString(2,cm.getNombre());
                ps.setString(3,cm.getAppelido());
                ps.setString(4, cm.getCorreo());
                ps.setString(5,cm.getContrasena());

                ps.executeUpdate();
                System.out.println("Se registro el cliente exitosamente");
            }catch (SQLException e ){
                System.out.println(e);
            }


        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void consultarClienteDB(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectionDB()){

            String query = "SELECT * FROM cliente";

            ps = connect.prepareStatement(query);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("Su documento es: " + rs.getString("id_Cliente"));
                System.out.println("SU nombre es: " + rs.getString("Nombre"));
                System.out.println("Su apellido es: " + rs.getString("Apellido"));
                System.out.println("Su correo es: " + rs.getString("Correo"));
                System.out.println("Su contraseña es: " + rs.getString("Contraseña"));
            }
        }catch (SQLException e){
            System.out.println(e);
            System.out.println("No fue posible recuperar los registros");
        }

    }
    public static void eliminarCliente(String documentoEliminar){
        Conexion conexion = new Conexion();


        try(Connection connect = conexion.getConnectionDB()){

            PreparedStatement ps = null;

            try{

                String query = "DELETE FROM cliente WHERE cliente.id_Cliente = ?";
                ps = connect.prepareStatement(query);

                ps.setString(1,documentoEliminar);
                ps.executeUpdate();
                System.out.println("Cliente eliminado");
            }catch(SQLException e ){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void actualizarCliente(ClienteModelo cm){
        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectionDB()){

            PreparedStatement ps = null;

            try{

                int opc = cm.getOpc();

                System.out.println(opc);

                if(opc == 1){

                    String query = "UPDATE Cliente SET id_Cliente = ? WHERE id_Cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1,cm.getIdDocumento());
                    ps.setString(2, cm.getIdDocumento());
                    ps.executeUpdate();
                    System.out.println("Se actualizo el registro exitosamente");
                }else if(opc==2){

                    String query = "UPDATE Cliente SET Nombre = ? WHERE id_Cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1,cm.getNombre());
                    ps.setString(2, cm.getIdDocumento());
                    ps.executeUpdate();
                    System.out.println("Se actualizo el registro exitosamente");

                }else if(opc == 3){

                    String query = "UPDATE Cliente SET Apellido = ? WHERE id_Cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1,cm.getAppelido());
                    ps.setString(2, cm.getIdDocumento());
                    ps.executeUpdate();
                    System.out.println("Se actualizo el registro exitosamente");
                }else if(opc == 4){

                    String query = "UPDATE Cliente SET Correo = ? WHERE id_Cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1,cm.getCorreo());
                    ps.setString(2, cm.getIdDocumento());
                    ps.executeUpdate();
                    System.out.println("Se actualizo el registro exitosamente");
                }else if(opc == 5){

                    String query = "UPDATE Cliente SET Contraseña = ? WHERE id_Cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1,cm.getContrasena());
                    ps.setString(2, cm.getIdDocumento());
                    ps.executeUpdate();
                    System.out.println("Se actualizo el registro exitosamente");
                }

            }catch (SQLException e){

                System.out.println(e);
            }


        }catch (SQLException e){
            System.out.println(e);
        }

    }
    }

