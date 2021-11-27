package Personas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Esta clase permite modelar una persona y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public abstract class Persona {
    // Variables de instancia de la clase Persona
    private String nombre;
    private int dni;
    private String fechaNacimiento;
    private String fechaIngreso;
    private HashMap<String, String> telefonos;

    /**
     * Constructor de objetos de la clase Persona
     */
    public Persona() {
        telefonos = new HashMap<String, String>();
    }

    /**
     * Método "getNombre", retorna el nombre del estudiante
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método "setNombre", setea el nombre del estudiante
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método "getDni", retorna el dni del estudiante
     *
     * @return String
     */
    public int getDni() {
        return dni;
    }
    /**
     * Método "setDni", setea el dni del estudiante
     *
     * @param dni
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    /**
     * Método "getFechaNacimiento", retorna la fecha de nacimiento del estudiante
     *
     * @return String
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Método "setFechaNacimiento", setea la fecha de nacimiento del estudiante
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Método "getFechaIngreso", retorna la fecha de ingreso del estudiante
     *
     * @return String
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    /**
     * Método "setFechaIngreso", setea la fecha de ingreso  del estudiante
     *
     * @param fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    /**
     * Método "agregarTelefonos", agrega números de teléfono a la persona
     *
     */
    public void agregarTelefonos(String tipo, String numero) {
        if (!telefonos.containsKey(tipo)) {
            telefonos.put(tipo, numero);
        } else {
            System.out.println("El número de teléfono " + tipo + " ya ha sido ingresado. \n" +
            "¿Desea reemplazarlo? Pulse Y para reemplazar, N para continuar: ");
            Scanner sc = new Scanner(System.in);
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("y")) {
                telefonos.remove(tipo);
                telefonos.put(tipo, numero);
            }
        }
    }
    /**
     * Método "getTelefonos", retorna la lista de números de telefono de la persona
     *
     */
    public void getTelefonos() {
        for (Map.Entry<String, String> entrada: telefonos.entrySet()) {
            System.out.println("Tipo: " + entrada.getKey() + "\n Número: " + entrada.getValue());
        }
    }
    /**
     * Método "imprimirDatos", permite imprimir los datos de la persona
     *
     */
    public void imprimirDatos() {
        System.out.println("Nombre " + getNombre() + "\n" + "DNI: " + getDni() + "\n" + "Fecha de nacimiento: " + getFechaNacimiento() + "\n"
         + "Fecha de ingreso: " + getFechaIngreso() + "\n" + "Números de teléfono: ");
        getTelefonos();
    }
}
