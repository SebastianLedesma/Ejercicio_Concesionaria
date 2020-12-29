package ar.com.proyecto.onready.interfaces;

import java.util.List;

/**
 *
 * @author ricardo
 */
/**
 * Interface que contiene métodos para obtener información de la clase donde se implemente la interface.
 * @param <E> Parámetro que indicará el tipo de dato que utilizará en la implementación de los métodos.
 */
public interface I_BuscarDatos<E> {
    
    /**
     * Método que buscará el máximo valor de un conjunto de datos.
     * @return Objeto con el máximo valor,el cual represernta un precio.El tipo
     * de dato de retorno se determinará en la implementación de la interface.
     */
    E buscarPrecioMayor();
    
    /**
     * Método que buscará el mínimo valor de un conjunto de datos.
     * @return Objeto con el mínimo valor,el cual represernta un precio.El tipo
     * de dato de retorno se determinará en la implementación de la interface.
     */
    E buscarPrecioMenor();
    
    /**
     * Método que permite buscar entre los datos de un objeto si contiene valor
     * pasado por parámetro.
     * @param cadena Valor a buscar entre los datos del objeto.
     * @return Objeto que contiene entre sus datos la cadena buscada.
     */
    E buscarPorCadena(String cadena);
    
    /**
     * Método que orden un conjunto de datos.
     * @return Un conjunto de datos ordenados según un determinado criterio.
     */
    List<E> ordenarListado();
}
