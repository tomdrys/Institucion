package Institucion;

import Personas.*;

import javax.print.Doc;

/**
 * Esta clase está destinada a probar el correcto funcionamiento de la clase Institución
 *
 * @author (Tomás Navarro)
 * @version (V1)
 */
public class PruebaInstitucion {

    public static void main(String[] args) {

    // Creando objetos de las clase Institucion, Docente, Directivo, Administrativo y Estudiante
    Institucion i1 = new Institucion();
    Docente do1 = new Docente();
    Docente do2 = new Docente();
    Docente do3 = new Docente();
    Directivo di1 = new Directivo();
    Directivo di2 = new Directivo();
    Administrativo a1 = new Administrativo();
    Administrativo a2 = new Administrativo();
    Estudiante e1 = new Estudiante();
    Estudiante e2 = new Estudiante();
    Estudiante e3 = new Estudiante();
    Estudiante e4 = new Estudiante();
    Estudiante e5 = new Estudiante();
    Estudiante p1 = new Pasante();

    // Invocando método agregar docente de la clase "Institucion" para agregar los 3 docentes
    // a la lista "docentes"
    i1.agregarDocente(do1);
    i1.agregarDocente(do2);
    i1.agregarDocente(do3);
    i1.agregarDirectivo(di1);
    i1.agregarDirectivo(di2);
    i1.agregarAdministrativo(a1);
    i1.agregarAdministrativo(a2);
    i1.agregarEstudiante(e1);
    i1.agregarEstudiante(e2);
    i1.agregarEstudiante(e3);
    i1.agregarEstudiante(e4);
    i1.agregarEstudiante(e5);
    i1.imprimirCantidadDePersonasPorRol();



    }
}
