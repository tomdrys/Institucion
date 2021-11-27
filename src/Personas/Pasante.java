package Personas;

/**
 * Esta clase permite modelar a un pasante (Estudiante en situación de pasante) y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Pasante extends Estudiante {
    // Variables de instancia de la clase Pasante
    private String empresa; //Empresa donde realiza la pasantía el estudiante
    private double cantHoras;
    private boolean remunerada;

    /**
     * Constructor de objetos de la clase Pasante
     */
    public Pasante() {
    }

    /**
     * Método "getEmpresa", retorna la empresa donde el estudiante realiza la pasantía
     *
     * @return String
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Método "setEmpresa", setea la empresa donde el estudiante realiza la pasantía
     *
     * @param empresa
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Método "getCantHoras", retorna la cantidad de horas que el estudiante trabaja en la empresa
     *
     * @return double
     */
    public double getCantHoras() {
        return cantHoras;
    }

    /**
     * Método "setCantHoras", setea la cantidad de horas que el estudiante trabaja en la empresa
     *
     * @param cantHoras
     */
    public void setCantHoras(double cantHoras) {
        this.cantHoras = cantHoras;
    }

    /**
     * Método "isRemunerada", retorna true en caso de qué la pasantía sea remunerada y false en caso contrario
     *
     * @return boolean
     */
    public boolean isRemunerada() {
        return remunerada;
    }

    /**
     * Método "setRemunerada", setea si la pasantía es remunerada con valor booleano
     *
     * @param remunerada
     */
    public void setRemunerada(boolean remunerada) {
        this.remunerada = remunerada;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos de un estudiante
     */
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Empresa de la pasantía: " + getEmpresa() + "\n" + "Cantidad de horas: " + getCantHoras()
        + "\n" + "Es remunerada: " + isRemunerada());
    }
}
