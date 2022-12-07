package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-2022
 */

/**
 * Superclase abstracta que heredar� sus m�todos a las subclases: 1) CafeMaquina 2) CafeInstantaneo.
 * Sus metodos ser�n abstractos por lo que se deben extender en todas las subclases.
 * En esta clase se implementar� la interfaz para extender sus m�todos a todas las subclases.
 * Esta clase es abstracta por que no se instanciar� nunca. Solo se heredar�n sus m�todos y se usar� como tipo de dato para las listas.
 * Los atributos deben ser protected de modo que las las clases hijas puedan acceder a sus atributos pero NO otras clases.
 * Se pide contar con tres atributos.
 * Se entender� el atributo precio como el valor bruto (sin impuestos).
 */
public abstract class Cafe implements ICalculoImpuesto{

    //Se entendr� precio como el valor bruto (sin impuestos).
    protected int cantidad, precio;
    protected String tipoCafe;

    //Constructores sin y con par�metros.
    public Cafe() {
    }

    public Cafe(int cantidad, int precio, String tipoCafe) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipoCafe = tipoCafe;
    }

    //Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }
    
    //toString
    @Override
    public String toString() {
        return "Cafe{" + "cantidad=" + cantidad + ", precio=" + precio;
    }
    
    //M�todo abstracto que se implementar� en las subclases. No se desarrolla, solo se declara.
    public abstract String mostrarTipo(); 
    
    /**
     * M�todo sobreescrito que retorna el valor del impuesto por caf�.
     * Se utiliza conversi�n, ya que IMPUESTO es un double. La m�ltiplizaci�n va en par�ntesis. Esto porque primero se fuerza la multiplicaci�n y luego se convierte a int.
     * Todas las operaciones con valores de datos mixtos se convierten a double.
     */
    @Override
    public int calcularImpuesto() {
        return (int) (this.precio * IMPUESTO);
    }

    /**
     * M�todo sobreescrito que retorna el valor neto (bruto + impuesto).
     * El m�todo toma el valor retornado por {@link #calcularImpuesto()} y lo suma al valor bruto.
     * @return valor neto del caf�.
     */
    @Override
    public int totalPagar() {
        return calcularImpuesto() + this.precio;
    }

    /**
     * M�todo sobreescrito que muestra todos los atributos del caf�.
     */
    @Override
    public String mostrarAtributos() {
        return this.toString();
    }
}
