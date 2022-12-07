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

    /*Este array se inicializar� con un constructor vac�o en la main*/
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
     * M�todo que busca si hay un caf� del mismo tipo en la lista. Para ocupar solo objetos se usar� como par�metro un
     * objeto de tipo Cafe. Aqu� se podr�a usar una String.
     * De este se obtendr� el nombre y se har� la evaluaci�n. Si est�, retorna True, si no False.
     * @param cafe. Objeto de tipo Cafe ingresado desde main para obtener el tipoCafe.
     * @return True si est�, False si no.
     */
    public boolean buscarCafePorTipo(Cafe cafe) {
        
        /*Por cada �tem en la lista, comprueba si el tipo de cafe del item es el mismo que el del objeto caf� ingresado, ignorando may�sculas*/
        for (Cafe item : listaCompra) {
            if (item.getTipoCafe().equalsIgnoreCase(cafe.getTipoCafe())) {
                return true;
            }
        }
        return false;
    }

    /**
     * M�todo que agrega caf� si no hay otro en la lista. Se ocupa un objeto Cafe para usar solo objetos. Aqu� se podr�a usar una String.
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
     * M�todo que muestra el contenido de la lista.
     */
    public void mostrarListaCafe (){
        for (Cafe cafe : listaCompra) {
            System.out.println(cafe.toString());
            System.out.println("");
        }
    }
    
    /**
     * M�todo que genera una boleta. Usa variables para contar (num), para calcular totales por producto (total)
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
