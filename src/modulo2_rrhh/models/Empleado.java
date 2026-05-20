package modulo2_rrhh.models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Modelo de Empleado para RRHH
 * Integrante: 2 - Recursos Humanos
 */
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String puesto;
    private String departamento;
    private LocalDate fechaIngreso;
    private String estado; // activo, inactivo
    private double salario;
    
    public Empleado() {
    }
    
    public Empleado(int idEmpleado, String nombre, String apellido, String cedula,
                   String email, String telefono, LocalDate fechaNacimiento,
                   String direccion, String puesto, String departamento,
                   LocalDate fechaIngreso, String estado, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.puesto = puesto;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
        this.salario = salario;
    }
    
    // GETTERS Y SETTERS
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + "', apellido='" + apellido + "'}";
    }
}
