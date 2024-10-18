public class ProveedorMaterial {
    private String claveProveedor;
    private String claveMaterial;
    private double costo;
    private int cantidad;
    private String estado;

    // Constructor
    public ProveedorMaterial(String claveProveedor, String claveMaterial, double costo, int cantidad, String estado) {
        this.claveProveedor = claveProveedor;
        this.claveMaterial = claveMaterial;
        this.costo = costo;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    // Getters y Setters
    public String getClaveProveedor() { return claveProveedor; }
    public void setClaveProveedor(String claveProveedor) { this.claveProveedor = claveProveedor; }

    public String getClaveMaterial() { return claveMaterial; }
    public void setClaveMaterial(String claveMaterial) { this.claveMaterial = claveMaterial; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    // Métodos adicionales como insertar(), actualizar(), buscar(), borrar() también se pueden agregar aquí.
}
