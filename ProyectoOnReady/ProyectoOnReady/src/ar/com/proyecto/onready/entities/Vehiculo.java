package ar.com.proyecto.onready.entities;

import java.text.DecimalFormat;

/**
 *
 * @author ricardo
 */
//Clase base para la creación de vehiculos.No se puede instanciar.
public abstract class Vehiculo {
    
    //Atributos
    protected String marca;
    protected String modelo;
    protected double precio;

    /**
     * Constructor que internamnete crea un Vehiculo.
     * @param marca Marca del vehiculo.
     * @param modelo Modelo del vehiculo.
     * @param precio Precio con centavos del vehiculo.
     */
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * Getter del atributo marca.
     * @return Marca del vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Getter del modelo del vehiculo.
     * @return Modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Getter del precio del vehiculo.
     * @return Precio del vehiculo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sobreescritura del toString que retorna el estado del vehiculo.
     * @return Cadena de caracteres con los valores de los atributos del vehiculo.
     */
    @Override
    public String toString() {
        return "Marca: "+this.marca+" // Modelo: "+this.modelo;
    }
    
    /**
     * Método para modificar el formato de muestra del precio del vehiculo.
     * @return Cadena de caracteres con el precio del vehiculo en formato String y con una vista diferente.
     */
    public String getPrecioFormateado(){
        DecimalFormat formato=new DecimalFormat("###,###.00");
        return formato.format(precio);
    }
}
