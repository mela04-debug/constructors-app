package modulo2_rrhh.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Modelo de Asistencia
 * Integrante: 2 - Recursos Humanos
 */
public class Asistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idAsistencia;
    private int idEmpleado;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String estado; // presente, ausente, retardo
    private String observaciones;
    
    public Asistencia() {
    }
    
    public Asistencia(int idAsistencia, int idEmpleado, LocalDate fecha,
                     LocalTime horaEntrada, LocalTime horaSalida,
                     String estado, String observaciones) {
        this.idAsistencia = idAsistencia;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
        this.observaciones = observaciones;
    }
    
    // GETTERS Y SETTERS
    public int getIdAsistencia() { return idAsistencia; }
    public void setIdAsistencia(int idAsistencia) { this.idAsistencia = idAsistencia; }
    
    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }
    
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    
    public LocalTime getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(LocalTime horaEntrada) { this.horaEntrada = horaEntrada; }
    
    public LocalTime getHoraSalida() { return horaSalida; }
    public void setHoraSalida(LocalTime horaSalida) { this.horaSalida = horaSalida; }
    
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    
    @Override
    public String toString() {
        return "Asistencia{" + "fecha=" + fecha + ", estado='" + estado + "'}";
    }
}
