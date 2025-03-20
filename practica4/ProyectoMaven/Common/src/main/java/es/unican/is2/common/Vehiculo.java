package es.unican.is2.common;

import java.time.LocalDate;

/**
 * Clase abstracta que representa un vehículo. 
 * Cada vehículo tiene una matrícula única.
 */
public abstract class Vehiculo {

    // Clave primaria autogenerada
    private long id;

    private String matricula;
    private LocalDate fechaMatriculacion;
    private TipoMotor motor;

    /**
     * Constructor de la clase Vehículo.
     * 
     * @param id ID único del vehículo.
     * @param matricula Matrícula del vehículo.
     * @param fechaMatriculacion Fecha de matriculación del vehículo.
     * @param motor Tipo de motor del vehículo.
     */
    public Vehiculo(long id, String matricula, LocalDate fechaMatriculacion, TipoMotor motor) {
        this.id = id;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.motor = motor;
    }

    /**
     * Retorna la matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Retorna la fecha de primera matriculación del vehículo.
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     * Retorna el tipo de motor del vehículo.
     */
    public TipoMotor getMotor() {
        return motor;
    }

    /**
     * Retorna el identificador del vehículo.
     */
    public long getId() {
        return id;
    }

    /**
     * Calcula el precio del impuesto de circulación del vehículo.
     * Este método debe ser implementado por las subclases.
     * 
     * @return Precio del impuesto de circulación.
     */
    public abstract double precioImpuesto();
}
