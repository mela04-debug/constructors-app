package modulo2_rrhh.models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Modelo de Contrato Laboral
 * Integrante: 2 - Recursos Humanos
 */
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idContrato;
    private int idEmpleado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String tipoContrato; // temporal, indefinido
    private double salarioBase;
    private String estado;
    private String descripcion;
    
    public Contrato() {
    }
    
    public Contrato(int idContrato, int idEmpleado, LocalDate fechaInicio,
                   LocalDate fechaFin, String tipoContrato, double salarioBase,
                   String estado, String descripcion) {
        this.idContrato = idContrato;
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoContrato = tipoContrato;
        this.salarioBase = salarioBase;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    
    // GETTERS Y SETTERS
    public int getIdContrato() { return idContrato; }
    public void setIdContrato(int idContrato) { this.idContrato = idContrato; }
    
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    
    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    
    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }
    
    public String getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(String tipoContrato) { this.tipoContrato = tipoContrato; }
    
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    @Override
    public String toString() {
        return "Contrato{" + "tipo='" + tipoContrato + "', salario=" + salarioBase + "}";
    }
}
