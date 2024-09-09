/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.badsmell.mutabledata;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta Entidad Representa a la Carrera de Informática.
 *
 * @author Jonathan Villarroel
 */
public class Informatica {

    private final List<String> estudiantes;

    /**
     * Inicializa los objetos con un conjunto de información inicial.
     *
     * @param estudiantes Lista de Estudiantes Iniciales.
     */
    public Informatica(List<String> estudiantes) {
        this.estudiantes = new ArrayList<>(estudiantes);
    }

    /**
     * Registramos un Estudiante.
     *
     * @param estudiante, Nombre completo del Estudiante.
     */
    public void agregarEstudiante(String estudiante) {
        estudiantes.add(estudiante);
    }

    public List<String> obtenerEstudiantes() {
        return estudiantes;
    }
}
