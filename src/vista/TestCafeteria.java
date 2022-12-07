package vista;

import datos.ColeccionCafe;
import modelo.CafeInstantaneo;
import modelo.CafeMaquina;

/**
 * @author Gabriel Serrano
 * @version 07-12-2022
 */
/**
 * Esta es la clase que contiene el m�todo main y donde se ejecutar�n las
 * tareas. Se debe ejecutar lo siguinete: 1. Realizar una compra de un cliente
 * de dos caf�s (una de cada subclase). 2. Mostrar el total a pagar y su
 * detalle. 3. Listar los caf�s disponibles.
 */
public class TestCafeteria {

    public static void main(String[] args) {
        ColeccionCafe listaCompra = new ColeccionCafe();

        listaCompra.agregarCafe(new CafeInstantaneo("Caramelo", 1, 1400, "Instant�neo"));
        //Impuesto de 210. Valor: 1610.
        listaCompra.agregarCafe(new CafeMaquina("Ar�bigo", 1, 1600, "M�quina"));
        //Impuesto de 240. Valor: 1840.
        //Total 3450
        
        //Prueba para caf� duplicado.
        listaCompra.agregarCafe(new CafeInstantaneo("Caramelo", 1, 1400, "Instant�neo"));
        
        listaCompra.mostrarListaCafe();
        System.out.println("****************************");
        listaCompra.detallePago();
        
    }

}
