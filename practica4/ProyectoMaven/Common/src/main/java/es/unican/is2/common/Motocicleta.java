package es.unican.is2.common;

import java.time.LocalDate;

/**
 * Clase que representa un vehículo de tipo motocicleta.
 */
public class Motocicleta extends Vehiculo {

    private int cilindrada;

    /**
     * Constructor de la clase Motocicleta.
     * 
     * @param id ID único del vehículo.
     * @param matricula Matrícula de la motocicleta.
     * @param fechaMatriculacion Fecha de matriculación de la motocicleta.
     * @param motor Tipo de motor de la motocicleta.
     * @param cilindrada Cilindrada del motor en centímetros cúbicos (CC).
     */
    public Motocicleta(long id, String matricula, LocalDate fechaMatriculacion, TipoMotor motor, int cilindrada) {
        super(id, matricula, fechaMatriculacion, motor);
        this.cilindrada = cilindrada;
    }

    /**
     * Retorna la cilindrada en CC de la motocicleta.
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Calcula el precio del impuesto de circulación según la cilindrada.
     * @return Valor del impuesto a pagar.
     */
    @Override
    public double precioImpuesto() {
        if (cilindrada < 125) {
            return 8;
        } else if (cilindrada < 250) {
            return 15;
        } else if (cilindrada < 500) {
            return 30;
        } else if (cilindrada < 1000) {
            return 60;
        } else {
            return 120;
        }
    }
}
