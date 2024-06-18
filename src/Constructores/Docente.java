/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class Docente {
    private String nombre;
    private List<Curso> cursosAsignados;

    // Constructor de la clase Docente
    public Docente(String nombre) {
        this.nombre = nombre;
        this.cursosAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursosAsignados() {
        return cursosAsignados;
    }

    // Método para agregar un curso al docente
    public void asignarCurso(Curso curso) {
        cursosAsignados.add(curso);
    }
}
