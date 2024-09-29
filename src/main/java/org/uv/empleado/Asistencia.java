/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.empleado;

/**
 *
 * @author josemmanuel
 */
public class Asistencia {

    private String claveEmpleado;
    private String fecha;
    private String hora;
    private String tipo;

    Asistencia(String claveEmpleado, String fecha, String hora, String tipo) {
        this.claveEmpleado = claveEmpleado;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    /**
     * @return the claveEmpleado
     */
    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    /**
     * @param claveEmpleado the claveEmpleado to set
     */
    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
