package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-2022
 */
/**
 * Interfaz que tendr� solo un atributo y tres m�todos: 1) Calcular impuesto, 2) Calcular total a pagar con impuesto y 3) Mostrar los atributos del caf�. 
 * Esta interfaz ser� implementada en las subclases para cumplir con el m�todo de {@link #mostrarAtributos()}. Ya que solo las subclases tienen todos los atributos
 * Se debe prestar atenci�n a la forma de declarar su contenido.
 */
public interface ICalculoImpuesto {

    /*
    No es necesario colocar public, private o protected en los atributos. Java asume que ser�n public. 
    Estos deben ser declarados en may�sculas.
    */
    double IMPUESTO = 0.15;

    /**
     * M�todo clacular impuesto de cada cafe.No es necesario colocar public, private o protected en los m�todos. Los m�todos solo se declaran, no se desarrollan. En este caso, se implementar�n en la clase Cafe y all� se desarrollar�n para ser sobreescritos o sobrecargados en las otras clases.
     * @return monto correspondiente al 15% del valor bruto de cada caf�.
    */
    int calcularImpuesto();
    
    /**
     * M�todo para calcular el total a pagar por cafe con su impuesto.
     * @return monto correspondiente al valor neto (bruto + impuesto) por caf�
     */
    int totalPagar ();
    
    /**
     * M�todo para mostrar todos los atributos de cada caf�.
     * @return retorna una cadena con los atributos del caf�.
     */
    String mostrarAtributos ();
}
