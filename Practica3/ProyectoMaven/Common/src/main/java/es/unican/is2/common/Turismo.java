package es.unican.is2.common;

import java.time.LocalDate;

/**
 * Clase que representa un vehículo de tipo turismo.
 */
public class Turismo extends Vehiculo {

    private double potencia;

    /**
     * Constructor de la clase Turismo.
     * 
     * @param id ID único del vehículo.
     * @param matricula Matrícula del turismo.
     * @param fechaMatriculacion Fecha de matriculación del turismo.
     * @param motor Tipo de motor del turismo.
     * @param potencia Potencia del motor en caballos fiscales.
     */
    public Turismo(long id, String matricula, LocalDate fechaMatriculacion, TipoMotor motor, double potencia) {
        super(id, matricula, fechaMatriculacion, motor);
        this.potencia = potencia;
    }

    /**
     * Retorna la potencia en caballos fiscales del vehículo.
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Calcula el precio del impuesto de circulación según la potencia fiscal.
     * @return Valor del impuesto a pagar.
     */
    @Override
    public double precioImpuesto() {
        if (potencia < 8) {
            return 25;
        } else if (potencia < 12) {
            return 67;
        } else if (potencia < 16) {
            return 143;
        } else if (potencia < 20) {
            return 178;
        } else {
            return 223;
        }
    }
}
