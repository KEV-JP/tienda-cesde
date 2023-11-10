package co.com.cesde.tienda.modelo;

public class ClienteModelo {
    private String nombre;
    private String idDocumento;
    private String appelido;
    private String correo;
    private String contrasena;
    private int opc;

    public ClienteModelo() {
    }

    public ClienteModelo(String nombre, String idDocumento, String appelido, String correo, String contrasena) {
        this.nombre = nombre;
        this.idDocumento = idDocumento;
        this.appelido = appelido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
}
