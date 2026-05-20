package modulo2_rrhh.models;

import java.io.Serializable;
import java.time.YearMonth;

/**
 * Modelo de Nómina
 * Integrante: 2 - Recursos Humanos
 */
public class Nomina implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idNomina;
    private int idEmpleado;
    private YearMonth periodo;
    private double salarioBase;
    private double bonificacion;
    private double descuentos;
    private double salarioNeto;
    private String estado; // pendiente, pagado
    private String fechaPago;
    
    public Nomina() {
    }
    
    public Nomina(int idNomina, int idEmpleado, YearMonth periodo,
                 double salarioBase, double bonificacion, double descuentos,
                 double salarioNeto, String estado, String fechaPago) {
        this.idNomina = idNomina;
        this.idEmpleado = idEmpleado;
        this.periodo = periodo;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
        this.descuentos = descuentos;
        this.salarioNeto = salarioNeto;
        this.estado = estado;
        this.fechaPago = fechaPago;
    }
    
    // GETTERS Y SETTERS
    public int getIdNomina() { return idNomina; }
    public void setIdNomina(int idNomina) { this.idNomina = idNomina; }
    
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    
    public YearMonth getPeriodo() { return periodo; }
    public void setPeriodo(YearMonth periodo) { this.periodo = periodo; }
    
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    
    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }
    
    public double getDescuentos() { return descuentos; }
    public void setDescuentos(double descuentos) { this.descuentos = descuentos; }
    
    public double getSalarioNeto() { return salarioNeto; }
    public void setSalarioNeto(double salarioNeto) { this.salarioNeto = salarioNeto; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getFechaPago() { return fechaPago; }
    public void setFechaPago(String fechaPago) { this.fechaPago = fechaPago; }
    
    @Override
    public String toString() {
        return "Nomina{" + "periodo=" + periodo + ", salarioNeto=" + salarioNeto + "}";
    }
}
