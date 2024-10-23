public class Proveedor {
    private String clave;
    private String nombre;
    private String direccion;
    private String[] correosElectronicos;
    private String[] telefonos;
    private String rfc;

    // Constructor
    public Proveedor(String clave, String nombre, String direccion, String[] correosElectronicos, String[] telefonos, String rfc) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correosElectronicos = correosElectronicos;
        this.telefonos = telefonos;
        this.rfc = rfc;
    }

    // Getters y Setters
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String[] getCorreosElectronicos() { return correosElectronicos; }
    public void setCorreosElectronicos(String[] correosElectronicos) { this.correosElectronicos = correosElectronicos; }

    public String[] getTelefonos() { return telefonos; }
    public void setTelefonos(String[] telefonos) { this.telefonos = telefonos; }

    public String getRfc() { return rfc; }
    public void setRfc(String rfc) { this.rfc = rfc; }
    
    // Métodos adicionales para CRUD se pueden agregar aquí.
}
