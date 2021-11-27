package Institucion;

import Personas.*;

import java.util.ArrayList;

/**
 * Esta clase permite moldear una institución y sus atributos
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class Institucion {
    // Variables de instancia de la clase Institucion
    private ArrayList<Directivo> directivos;
    private ArrayList<Docente> docentes;
    private ArrayList<Administrativo> administrativos;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Pasante> pasantes;

    /**
     * Constructor de objetos de la clase Institucion
     */
    public Institucion() {
        directivos = new ArrayList<Directivo>();
        docentes = new ArrayList<Docente>();
        administrativos = new ArrayList<Administrativo>();
        estudiantes = new ArrayList<Estudiante>();
        pasantes = new ArrayList<Pasante>();
    }

    /**
     * Método "agregarDirectivo", añade un directivo a la lista "directivos"
     *
     * @param directivo
     */
    public void agregarDirectivo(Directivo directivo) {
        directivos.add(directivo);
    }
    /**
     * Método "agregarDocente", añade un docente a la lista "docentes"
     *
     * @param docente
     */
    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }
    /**
     * Método "agregarAdministrativo", añade un administrativo a la lista "administrativos"
     *
     * @param administrativo
     */
    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }
    /**
     * Método "agregarEstudiante", añade un estudiante a la lista "estudiantes"
     *
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    /**
     * Método "imprimirCantidadDePersonasPorRol", permite imprimir la cantidad de directivos,
     * docentes, administrativos y estudiantes
     *
     */
    public void imprimirCantidadDePersonasPorRol() {
        System.out.println("\nCANTIDAD DE PERSONAS POR ROL: \n");
        // Imprimir por pantalla la cantidad de directivos
        System.out.println("Cant. Directivos: " + directivos.size());
        // Imprimir por pantalla la cantidad de docentes
        System.out.println("Cant. Docentes: " + docentes.size());
        // Imprimir por pantalla la cantidad de administrativos
        System.out.println("Cant. Administrativos: " + administrativos.size());
        // Imprimir por pantalla la cantidad de estudiantes
        System.out.println("Cant. Estudiantes: " + estudiantes.size());
    }
    /**
     * Método "imprimirTodosLosDatos", permite imprimir los datos de todas las personas
     * recorriendo cada uno de las listas
     *
     */
    public void imprimirTodosLosDatos() {

        // Ciclo for que imprime los datos de los directivos
        System.out.println("\n DIRECTIVOS: \n");
        for (Directivo directivo: directivos) {
            directivo.imprimirDatos();
        }
        System.out.println("\n DOCENTES: \n");
        // Ciclo for que imprime los datos de los docentes
        for (Docente docente: docentes) {
            docente.imprimirDatos();
        }
        System.out.println("\n ADMINISTRATIVOS: \n");
        // Ciclo for que imprime los datos de los administrativos
        for (Administrativo administrativo: administrativos) {
            administrativo.imprimirDatos();
        }
        System.out.println("\n ESTUDIANTES: \n");
        // Ciclo for que imprime los datos de los estudiantes
        for (Estudiante estudiante: estudiantes) {
            estudiante.imprimirDatos();
        }
        System.out.println("\n ESTUDIANTES CON PASANTÍAS: \n");
        // Ciclo for que imprime los datos de los estudiantes con pasantías
        for (Pasante pasante: pasantes) {
            pasante.imprimirDatos();
        }
    }
    /**
     * Método "imprimirCantidadDeEstudiantesPorMatAprob", que permite obtener la cantidad de estudiantes
     * discriminados según la cantidad de materias aprobadas
     *
     */
    public void imprimirCantidadDeEstudiantesPorMatAprob() {
        System.out.println("\n CANTIDAD DE ESTUDIANTES POR CANTIDAD DE MATERIAS APROBADAS: \n");
        int[] cantidad = new int[50];
        int x;

        for (Estudiante estudiante: estudiantes) {
            x = estudiante.getCantMateriasAprobadas();
            cantidad[x]++;
        }
        for (x = 0; x < 50; x++) {
            if (cantidad[x] > 0) {
                System.out.println(x + " estudiantes aprobaron " + cantidad[x] + " materias." );
            }
        }
    }

}
