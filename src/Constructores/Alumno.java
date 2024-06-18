package Constructores;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String ciclo;
    private List<Curso> cursosMatriculados;  // Relación con los cursos

    // Constructor de la clase Alumno
    public Alumno(String nombre, String ciclo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.cursosMatriculados = new ArrayList<>();
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }
    
    public String getCiclo() {
        return ciclo;
    }

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    // Método para agregar un curso al estudiante
    public void matricularCurso(Curso curso) {
        cursosMatriculados.add(curso);
    }
    
    public void inscribirEnGrupo(Curso curso, String nombreGrupo) {
        for (Grupo grupo : curso.getGrupos()) {
            if (grupo.getNombre().equals(nombreGrupo)) {
                grupo.agregarAlumno(this);  // Agrega este alumno al grupo encontrado
                return;
            }
        }
    }
}