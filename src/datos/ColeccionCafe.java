package datos;

import java.util.ArrayList;
import java.util.List;
import modelo.Cafe;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-22
 */
public class ColeccionCafe {

    /*Se construye el array list*/
    List<Cafe> listaCompra = new ArrayList<>();

    /*Este array se inicializará con un constructor vacío en la main*/
    public ColeccionCafe() {

    }

    public List<Cafe> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<Cafe> listaCompra) {
        this.listaCompra = listaCompra;
    }

    @Override
    public String toString() {
        return "ColeccionCafe{" + "listaCompra=" + listaCompra + '}';
    }

    /**
     * Método que busca si hay un café del mismo tipo en la lista. Para ocupar solo objetos se usará como parámetro un
     * objeto de tipo Cafe. Aquí se podría usar una String.
     * De este se obtendrá el nombre y se hará la evaluación. Si está, retorna True, si no False.
     * @param cafe. Objeto de tipo Cafe ingresado desde main para obtener el tipoCafe.
     * @return True si está, False si no.
     */
    public boolean buscarCafePorTipo(Cafe cafe) {
        
        /*Por cada ítem en la lista, comprueba si el tipo de cafe del item es el mismo que el del objeto café ingresado, ignorando mayúsculas*/
        for (Cafe item : listaCompra) {
            if (item.getTipoCafe().equalsIgnoreCase(cafe.getTipoCafe())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que agrega café si no hay otro en la lista. Se ocupa un objeto Cafe para usar solo objetos. Aquí se podría usar una String.
     * @param cafe. Objeto de tipo Cafe.
     * @return True si agrega, False si no.
     */
    public boolean agregarCafe(Cafe cafe) {
        if (!this.buscarCafePorTipo(cafe)) {
            this.listaCompra.add(cafe);
            return true;
        }
        return false;
    }
    
    /**
     * Método que muestra el contenido de la lista.
     */
    public void mostrarListaCafe (){
        for (Cafe cafe : listaCompra) {
            System.out.println(cafe.toString());
            System.out.println("");
        }
    }
    
    /**
     * Método que genera una boleta. Usa variables para contar (num), para calcular totales por producto (total)
     * y para estimar el total de la boleta (totalBoleta)
     */
    public void detallePago (){
        int num = 0;
        int total = 0;
        int totalBoleta = 0;
        
        for (Cafe cafe : listaCompra) {
            total = cafe.totalPagar() * cafe.getCantidad();
            System.out.println(++num + cafe.getTipoCafe() + cafe.getCantidad() + "$" + total);
            System.out.println("");
        
            totalBoleta = totalBoleta+total;
        }
        System.out.println("Total a pagar: $" + totalBoleta);
        
    }

}
