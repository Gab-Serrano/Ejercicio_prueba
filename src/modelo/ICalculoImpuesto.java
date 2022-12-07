package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-2022
 */
/**
 * Interfaz que tendrá solo un atributo y tres métodos: 1) Calcular impuesto, 2) Calcular total a pagar con impuesto y 3) Mostrar los atributos del café. 
 * Esta interfaz será implementada en las subclases para cumplir con el método de {@link #mostrarAtributos()}. Ya que solo las subclases tienen todos los atributos
 * Se debe prestar atención a la forma de declarar su contenido.
 */
public interface ICalculoImpuesto {

    /*
    No es necesario colocar public, private o protected en los atributos. Java asume que serán public. 
    Estos deben ser declarados en mayúsculas.
    */
    double IMPUESTO = 0.15;

    /**
     * Método clacular impuesto de cada cafe.No es necesario colocar public, private o protected en los métodos. Los métodos solo se declaran, no se desarrollan. En este caso, se implementarán en la clase Cafe y allí se desarrollarán para ser sobreescritos o sobrecargados en las otras clases.
     * @return monto correspondiente al 15% del valor bruto de cada café.
    */
    int calcularImpuesto();
    
    /**
     * Método para calcular el total a pagar por cafe con su impuesto.
     * @return monto correspondiente al valor neto (bruto + impuesto) por café
     */
    int totalPagar ();
    
    /**
     * Método para mostrar todos los atributos de cada café.
     * @return retorna una cadena con los atributos del café.
     */
    String mostrarAtributos ();
}
