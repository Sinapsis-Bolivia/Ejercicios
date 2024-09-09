/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.badsmell.mutabledata;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2> Bad Smells </h2>
 * Este Ejemplo explica el <b>Bad Smell</b> denominado <b>Datos Mutables</b>.
 *
 * <h3>Problema:</h3> El conjunto de datos inicial enviado por referencia, los
 * objetos que utilizan esta información siguen siendo afectados por la
 * mutabilidad de los datos iniciales.
 *
 * <h3>Solución:</h3> Al recibir el conjunto de datos inicial, realizar una
 * copia de la misma información.
 *
 * @author Jonathan Villarroel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> websis = new ArrayList<>(); //Conjunto de Datos Inicial.
        websis.add("Javier Mamani");
        websis.add("Maria Camacho");
        websis.add("Anabel Patiño");

        Informatica info = new Informatica(websis); //Enviamos los Datos Iniciales por referencia al Constructor.
        System.out.println("Informática: " + info.obtenerEstudiantes());

        Sistemas sis = new Sistemas(websis); //Enviamos los Datos Iniciales por referencia al Constructor.
        System.out.println("Sistemas: " + sis.obtenerEstudiantes());

        info.agregarEstudiante("Adrían Rojas"); //Registramos Estudiantes a Informática.
        info.agregarEstudiante("Ramón Valdez");

        sis.agregarEstudiante("Deysi Aguilar"); //Registramos Estudiantes a Sistemas.

        //Mostrar Reporte de Estudiantes Inscritos en las Carreras de Informática y Sistemas.
        System.out.println("Informática: " + info.obtenerEstudiantes());
        System.out.println("Sistemas: " + sis.obtenerEstudiantes());
    }
}
