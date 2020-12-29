package ar.com.proyecto.onready.entities;

/**
 *
 * @author ricardo
 */
//Clase que hereda de Vehiculo.
public class Auto extends Vehiculo{
    
    //Atributo
    private int cantPuertas;

    /**
     * Constructor que permite instanciar la clase Auto.
     * @param marca Marca del auto.
     * @param modelo Modelo del auto.
     * @param precio Precio del auto.
     * @param cantPuertas Cantidad de puertas del auto.
     */
    public Auto(String marca, String modelo, double precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    /**
     * Getter del atributo cantPuertas.
     * @return Cantidad de puertas del auto.
     */
    public int getCantPuertas() {
        return cantPuertas;
    }

    /**
     * Sobreescritura del toString que retorna el estado del auto.
     * @return Cadena de caracteres con los valores de los atributos del auto.
     */
    @Override
    public String toString() {
        return super.toString() + " // Puertas: "+this.cantPuertas+" // Precio: $"+super.getPrecioFormateado();
    }
    
}
