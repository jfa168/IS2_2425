package es.unican.is2.business;

import es.unican.is2.common.IInfoImpuestoCirculacion;
import es.unican.is2.common.IVehiculosDAO;
import es.unican.is2.common.IContribuyentesDAO;
import es.unican.is2.common.DataAccessException;
import es.unican.is2.common.Vehiculo;
import es.unican.is2.common.Contribuyente;

/**
 * Implementación de la interfaz de negocio para la gestión del impuesto de circulación.
 */
public class GestionImpuestoCirculacion implements IInfoImpuestoCirculacion {
    
    private IVehiculosDAO vehiculosDAO;
    private IContribuyentesDAO contribuyentesDAO;

    /**
     * Constructor con inyección de dependencias.
     * @param vehiculosDAO DAO de vehículos
     * @param contribuyentesDAO DAO de contribuyentes
     */
    public GestionImpuestoCirculacion(IVehiculosDAO vehiculosDAO, IContribuyentesDAO contribuyentesDAO) {
        this.vehiculosDAO = vehiculosDAO;
        this.contribuyentesDAO = contribuyentesDAO;
    }

    @Override
    public Vehiculo vehiculo(String matricula) throws DataAccessException {
        return vehiculosDAO.vehiculoPorMatricula(matricula);
    }

    @Override
    public Contribuyente contribuyente(String dni) throws DataAccessException {
        return contribuyentesDAO.contribuyente(dni);
    }
}

