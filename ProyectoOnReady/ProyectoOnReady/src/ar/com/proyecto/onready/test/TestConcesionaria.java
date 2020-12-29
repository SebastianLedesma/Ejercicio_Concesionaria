package ar.com.proyecto.onready.test;

import ar.com.proyecto.onready.entities.Auto;
import ar.com.proyecto.onready.entities.Concesionaria;
import ar.com.proyecto.onready.entities.Moto;
import ar.com.proyecto.onready.entities.Vehiculo;

/**
 *
 * @author ricardo
 */
//Clase de testeo de las entidades creadas.
public class TestConcesionaria {
    
    public static void main(String[] args) {
        //Instanciación de autos y motos.
        Auto auto1 = new Auto("Peugeot", "206", 200000, 4);
        Moto moto1 = new Moto("Honda", "Titan", 60000, 125);
        Auto auto2 = new Auto("Peugeot", "208", 250000, 5);
        Moto moto2 = new Moto("Yamaha", "YBR", 80500.5, 160);
        Vehiculo vehiculoaAux;
        
        //Instanciación de la clase Concesionaria.
        Concesionaria concesionaria = new Concesionaria("Concesionaria Argentina");
        
        //Agrego los vehiculos a la lista de la concesionaria.
        concesionaria.getListaVehiculos().add(auto1);
        concesionaria.getListaVehiculos().add(moto1);
        concesionaria.getListaVehiculos().add(auto2);
        concesionaria.getListaVehiculos().add(moto2);
        
        //Muestro los vehiculos de la concesionaria.
        concesionaria.getListaVehiculos().forEach(System.out::println);
        
        System.out.println("=============================");
        //Vehiculo más caro
        vehiculoaAux = concesionaria.buscarPrecioMayor();
        System.out.println("Vehículo más caro:" + vehiculoaAux.getMarca() + " " + vehiculoaAux.getModelo());
        
        //Vehiculo más barato.
        vehiculoaAux = concesionaria.buscarPrecioMenor();
        System.out.println("Vehículo más barato:" + vehiculoaAux.getMarca() + " " + vehiculoaAux.getModelo());
        
        //Vehiculo que según su modelo coincide con la cadena buscada.
        vehiculoaAux = concesionaria.buscarPorCadena("Y");
        if (vehiculoaAux != null) {
            System.out.println("Vehiculo que contiene en el modelo la letra 'Y':" 
                    + vehiculoaAux.getMarca() + " " + vehiculoaAux.getModelo()+" $"+vehiculoaAux.getPrecioFormateado());
        } else {
            System.out.println("No se encontró un vehiculo con esas caracteríscas.");
        }
        
        System.out.println("=============================");
        //Se muestra la lista de vehiculos ordenados en orden descendente según su precio.
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        concesionaria.ordenarListado().forEach(item->System.out.println(item.getMarca()+" "+item.getModelo()));
        
    }
}
