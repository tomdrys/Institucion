package Personas;

/**
 * Esta clase permite modelar un estudiante y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Estudiante extends Persona {
    // Variables de instancia de la clase Estudiante
    private String carrera;
    private int cantMateriasAprobadas;
    private double importeCuotaMensual;

    /**
     * Constructor de objetos de la clase Estudiante
     */
    public Estudiante() {
    }

    /**
     * Método "getCarrera", retorna la carrera que estudia el estudiante
     *
     * @return String
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * Método "setCarrera", setea la carrera que estudia el estudiante
     *
     * @param carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Método "getCantMateriasAprobadas", retorna la cantidad de
     * materias aprobadas del estudiante
     *
     * @return String
     */
    public int getCantMateriasAprobadas() {
        return cantMateriasAprobadas;
    }
    /**
     * Método "setCantMateriasAprobadas", setea la cantidad de materias
     * aprobadas del estudiante
     *
     * @param cantMateriasAprobadas
     */
    public void setCantMateriasAprobadas(int cantMateriasAprobadas) {
        this.cantMateriasAprobadas = cantMateriasAprobadas;
    }
    /**
     * Método "getImporteCuotaMensual", retorna el importe que paga
     * mensualmente el estudiante
     *
     * @return String
     */
    public double getImporteCuotaMensual() {
        return importeCuotaMensual;
    }
    /**
     * Método "setImporteCuotaMensual", setea el importe que paga
     * mensualmente el estudiante
     *
     * @param importeCuotaMensual
     */
    public void setImporteCuotaMensual(double importeCuotaMensual) {
        this.importeCuotaMensual = importeCuotaMensual;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos de un estudiante
     */
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Carrera: " + getCarrera() + "\n" + "Cantidad de mat. aprobadas: " + getCantMateriasAprobadas()
        + "\n" + "Importe cuota mensual: " + getImporteCuotaMensual());
    }
}
