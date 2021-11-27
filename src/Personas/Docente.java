package Personas;

/**
 * Esta clase permite moldear un docente y sus atributos.
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Docente extends Empleado {
    // Variables de instancia de la clase Docente
    private String materiaDicatada;

    /**
     * Constructor de objetos de la clase Docente
     */
    public Docente() {
    }

    /**
     * Método "getMateriaDictada", retorna la materia dictada por el docente
     *
     * @return String
     */
    public String getMateriaDicatada() {
        return materiaDicatada;
    }
    /**
     * Método "setMateriaDictada", setea la materia dictada por el docente
     *
     * @param materiaDicatada
     */
    public void setMateriaDicatada(String materiaDicatada) {
        this.materiaDicatada = materiaDicatada;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos del docente
     *
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Materia dictada: " + getMateriaDicatada());
    }
}
