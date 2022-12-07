package modelo;

/**
 *
 * @author Gabriel Serrano
 * @version 07-12-22
 */
public class CafeMaquina extends Cafe{

    private String origen;

    /*
    M�todo sobrecargado
     */
    public CafeMaquina() {
    }

    public CafeMaquina(String origen) {
        this.origen = origen;
    }

    //Constructor con todos los atributos. De la super y la sub clase.
    public CafeMaquina(String origen, int cantidad, int precio, String tipoCafe) {
        super(cantidad, precio, tipoCafe);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "CafeMaquina{" + "origen= " + origen + '}';
    }

    /**
     * M�todo sobreescrito desde la superclase abstracta. Retorna el tipo de caf�.
     * @return String tipoCafe
     */
    @Override
    public String mostrarTipo() {
        return this.tipoCafe;
    }

    /**
     * M�todo que ha sido implementado por la interfaz en la superclase y que ha sido heredado y sobreescrito en la subclase.
     * Retorna el toString de la superclase + el de la subclase.
     * @return String super.toString + this.toString.
     */
    @Override
    public String mostrarAtributos() {
        return super.mostrarAtributos() + this.mostrarTipo() + this.toString();
    }
}
