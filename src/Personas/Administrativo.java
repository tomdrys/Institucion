package Personas;

/**
 * Esta clase permite modelar un administrativo y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Administrativo extends Empleado {
    // Variables de instancia de la clase Administrativo
    private int horaEntrada;
    private int horaSalida;

    /**
     * Constructor de objetos de la clase Administrativo
     */
    public Administrativo() {
    }

    /**
     * Método "getHoraEntrada", retorna la hora de entrada del administrativo
     *
     * @return int
     */
    public int getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * Método "setHoraEntrada", setea la hora de entrada del administrativo
     *
     * @param horaEntrada
     */
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    /**
     * Método "getHoraSalida", retorna la hora de salida del administrativo
     *
     * @return int
     */
    public int getHoraSalida() {
        return horaSalida;
    }
    /**
     * Método "setHoraSalida", setea la hora de salida del administrativo
     *
     * @param horaSalida
     */
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    /**
     * Método "imprimirDatos", que sobreescribe al de la clase padre y permite
     * imprimir los datos del administrativo
     *
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Hora entrada: " + getHoraEntrada() + "\n" + "Hora salida: " + getHoraSalida());
    }
}
