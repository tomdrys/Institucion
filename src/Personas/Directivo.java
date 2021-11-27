package Personas;

/**
 * Esta clase permite moldear a un directivo y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Directivo extends Empleado {
    // Variables de instancia de la clase Directivo
    private String cargoActual;

    /**
     * Constructor de objetos de la clase Directivo
     */
    public Directivo() {
    }

    /**
     * Método "getCargoActual", retorna el cargo actual del directivo
     *
     * @return String
     */
    public String getCargoActual() {
        return cargoActual;
    }

    /**
     * Método "setCargoActual", setea el cargo actual del directivo
     *
     * @param cargoActual
     */
    public void setCargoActual(String cargoActual) {
        this.cargoActual = cargoActual;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos del directivo
     *
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cargo actual: " + getCargoActual());
    }

}
