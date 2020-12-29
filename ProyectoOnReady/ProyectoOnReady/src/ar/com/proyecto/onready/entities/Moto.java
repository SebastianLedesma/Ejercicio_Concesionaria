package ar.com.proyecto.onready.entities;

/**
 *
 * @author ricardo
 */
//Clase que hereda de Vehiculo
public class Moto extends Vehiculo{
    
    //Atributi
    private int cilindrada;

    /**
     * Constructor que permite instanciar la clase Moto.
     * @param marca Marca de la moto.
     * @param modelo Modelo de la moto.
     * @param precio Precio con centavos de la moto.
     * @param cilindrada Cilindrada de la moto.
     */
    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    /**
     * Getter del atributo cilindrada.
     * @return Cilindrada de la moto.
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Sobreescritura del toString que retornar el estado de la moto.
     * @return Cadena de caracteres con los valores de los atributos de la moto.
     */
    @Override
    public String toString() {
        return super.toString() + " // Cilindrada: "+this.cilindrada +"cc // Precio: $"+super.getPrecioFormateado();
    }
    
}
