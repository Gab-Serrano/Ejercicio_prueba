package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-2022
 */

/**
 * Superclase abstracta que heredará sus métodos a las subclases: 1) CafeMaquina 2) CafeInstantaneo.
 * Sus metodos serán abstractos por lo que se deben extender en todas las subclases.
 * En esta clase se implementará la interfaz para extender sus métodos a todas las subclases.
 * Esta clase es abstracta por que no se instanciará nunca. Solo se heredarán sus métodos y se usará como tipo de dato para las listas.
 * Los atributos deben ser protected de modo que las las clases hijas puedan acceder a sus atributos pero NO otras clases.
 * Se pide contar con tres atributos.
 * Se entenderá el atributo precio como el valor bruto (sin impuestos).
 */
public abstract class Cafe implements ICalculoImpuesto{

    //Se entendrá precio como el valor bruto (sin impuestos).
    protected int cantidad, precio;
    protected String tipoCafe;

    //Constructores sin y con parámetros.
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
    
    //Método abstracto que se implementará en las subclases. No se desarrolla, solo se declara.
    public abstract String mostrarTipo(); 
    
    /**
     * Método sobreescrito que retorna el valor del impuesto por café.
     * Se utiliza conversión, ya que IMPUESTO es un double. La múltiplización va en paréntesis. Esto porque primero se fuerza la multiplicación y luego se convierte a int.
     * Todas las operaciones con valores de datos mixtos se convierten a double.
     */
    @Override
    public int calcularImpuesto() {
        return (int) (this.precio * IMPUESTO);
    }

    /**
     * Método sobreescrito que retorna el valor neto (bruto + impuesto).
     * El método toma el valor retornado por {@link #calcularImpuesto()} y lo suma al valor bruto.
     * @return valor neto del café.
     */
    @Override
    public int totalPagar() {
        return calcularImpuesto() + this.precio;
    }

    /**
     * Método sobreescrito que muestra todos los atributos del café.
     */
    @Override
    public String mostrarAtributos() {
        return this.toString();
    }
}
