package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-22
 */
public class CafeInstantaneo extends Cafe implements ICalculoImpuesto {

    private String sabor;

    /*
    Método sobrecargado
     */
    public CafeInstantaneo() {
    }

    public CafeInstantaneo(String sabor) {
        this.sabor = sabor;
    }

    public CafeInstantaneo(String sabor, int cantidad, int precio, String tipoCafe) {
        super(cantidad, precio, tipoCafe);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setOrigen(String origen) {
        this.sabor = origen;
    }

    @Override
    public String toString() {
        return "CafeMaquina{" + "sabor=" + sabor + '}';
    }

    @Override
    public String mostrarTipo() {
        return this.tipoCafe;
    }

    /**
     * Método que ha sido implementado por la interfaz en la superclase y que ha
     * sido heredado y sobreescrito en la subclase. Retorna el toString de la
     * superclase + el de la subclase.
     *
     * @return String super.toString + this.toString.
     */
    @Override
    public String mostrarAtributos() {
        return super.toString() + this.mostrarTipo() + this.toString();
    }
}
