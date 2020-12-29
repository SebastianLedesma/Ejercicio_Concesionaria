package ar.com.proyecto.onready.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import ar.com.proyecto.onready.interfaces.I_BuscarDatos;


//Clase que posee una relación de contencón con la clase Vehiculo.Implementa una interface.
public class Concesionaria implements I_BuscarDatos<Vehiculo>{
    
    //Atributos
    private List<Vehiculo> listaVehiculos;
    private String nombre;

    /**
     * Constructor que permite instanciar la clase para crear una concesionaria.
     * Inicializa el atributo listaVehiculos.
     * @param nombre Nombre de la concesionaria.
     */
    public Concesionaria(String nombre) {
        this.nombre=nombre;
        this.listaVehiculos =new ArrayList();
    }

    /**
     * Getter del atributo listaVehiculos.
     * @return Lista de vehiculos que estan en la concesionaria.
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Getter del atributo nombre.
     * @return Nombre de la concesionaria.
     */
    public String getNombre() {
        return nombre;
    }

    //Implementación del método que permite obtener el vehiculo de la lista con el precio máximo.
    @Override
    public Vehiculo buscarPrecioMayor() {
        return this.getListaVehiculos().stream().max(Comparator.comparing(Vehiculo::getPrecio)).get();
    }

    //Implementación del método que permite obtener el vehiculo de la lista con el precio más bajo.
    @Override
    public Vehiculo buscarPrecioMenor() {
        return this.listaVehiculos.stream().min(Comparator.comparing(Vehiculo::getPrecio)).get();
    }

    //Implementación del método que permite obtener el primer vehiculo que en el tipo de modelo contenga
    //la cadena de caracteres buscada.
    @Override
    public Vehiculo buscarPorCadena(String cadena) {
        return this.getListaVehiculos()
                                .stream()
                                .filter(item->item.getModelo().contains(cadena)).findFirst().orElse(null);
    }

    //Implementación del método que ordena la lista de vehiculos de la concesionaria orden descendente.
    @Override
    public List<Vehiculo> ordenarListado() {
        return this.listaVehiculos.
                            stream().
                            sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed()).
                            collect(Collectors.toList());
    }
    
}
