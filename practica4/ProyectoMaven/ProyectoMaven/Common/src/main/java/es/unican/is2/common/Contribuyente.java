package es.unican.is2.common;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un contribuyente del ayuntamiento.
 * Cada contribuyente debe tener un dni que lo identifica y 
 * puede tener vehículos a su nombre.
 */
public class Contribuyente {

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    private List<Vehiculo> vehiculos = new LinkedList<>();

    /**
     * Constructor de la clase Contribuyente.
     * @param nombre Nombre del contribuyente.
     * @param apellido1 Primer apellido del contribuyente.
     * @param apellido2 Segundo apellido del contribuyente.
     * @param dni DNI del contribuyente.
     */
    public Contribuyente(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.vehiculos = new LinkedList<>(); // Se inicializa la lista de vehículos.
    }
    
    /**
     * Retorna el DNI del contribuyente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Retorna el nombre del contribuyente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el primer apellido del contribuyente.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Retorna el segundo apellido del contribuyente.
     */
    public String getApellido2() {
        return apellido2;
    }
    
    /**
     * Retorna la lista de vehículos del contribuyente.
     */
    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    /**
     * Agrega un vehículo a la lista de vehículos del contribuyente.
     * @param vehiculo Vehículo a agregar.
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null && !vehiculos.contains(vehiculo)) {
            vehiculos.add(vehiculo);
        }
    }
    
    /**
     * Elimina un vehículo de la lista de vehículos del contribuyente.
     * @param matricula Matricula del vehículo a eliminar.
     * @return `true` si el vehículo fue eliminado, `false` si no se encontró.
     */
    public boolean eliminarVehiculo(String matricula) {
        return vehiculos.removeIf(v -> v.getMatricula().equals(matricula));
    }

    /**
     * Retorna el valor total de impuesto de circulación 
     * a pagar por el contribuyente debido a todos sus vehículos.
     * @return Valor total del impuesto de circulación.
     */
    public double totalImpuestoCirculacion() {
        double total = 0.0;
        for (Vehiculo v : vehiculos) {
            total += v.precioImpuesto();
        }    
        return total;
    }
    
    /**
     * Retorna el vehículo cuya matrícula se indica.
     * @param matricula Matrícula del vehículo a buscar.
     * @return El vehículo si se encuentra en la lista de vehículos,
     *         `null` si no se encuentra el vehículo.
     */
    public Vehiculo buscaVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }
}
