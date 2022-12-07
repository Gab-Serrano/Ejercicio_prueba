package vista;

import datos.ColeccionCafe;
import modelo.CafeInstantaneo;
import modelo.CafeMaquina;

/**
 * @author Gabriel Serrano
 * @version 07-12-2022
 */
/**
 * Esta es la clase que contiene el método main y donde se ejecutarán las
 * tareas. Se debe ejecutar lo siguinete: 1. Realizar una compra de un cliente
 * de dos cafés (una de cada subclase). 2. Mostrar el total a pagar y su
 * detalle. 3. Listar los cafés disponibles.
 */
public class TestCafeteria {

    public static void main(String[] args) {
        ColeccionCafe listaCompra = new ColeccionCafe();

        listaCompra.agregarCafe(new CafeInstantaneo("Caramelo", 1, 1400, "Instantáneo"));
        //Impuesto de 210. Valor: 1610.
        listaCompra.agregarCafe(new CafeMaquina("Arábigo", 1, 1600, "Máquina"));
        //Impuesto de 240. Valor: 1840.
        //Total 3450
        
        //Prueba para café duplicado.
        listaCompra.agregarCafe(new CafeInstantaneo("Caramelo", 1, 1400, "Instantáneo"));
        
        listaCompra.mostrarListaCafe();
        System.out.println("****************************");
        listaCompra.detallePago();
        
    }

}
