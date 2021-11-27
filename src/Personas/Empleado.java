package Personas;

/**
 * Esta clase permite moldear a un empleado y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public abstract class Empleado extends Persona {
    // Variables de instancia de la clase Empleado
    private double sueldoMensual;

    /**
     * Constructor de objetos de la clase Empleado
     */
    public Empleado() {
    }

    /**
     * Método "getSueldoMensual", retorna el sueldo mensual del docente
     *
     * @return String
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    /**
     * Método "setSueldoMensual", setea el sueldo mensual del docente
     *
     * @param sueldoMensual
     */
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos del empleado
     *
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Sueldo mensual: " + getSueldoMensual());
    }
}
