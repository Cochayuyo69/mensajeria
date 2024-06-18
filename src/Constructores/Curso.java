package Constructores;

import java.util.Vector;

public class Curso {
    private String nombre;
    private String dia;
    private Vector<Grupo> grupos;
    private Docente docente;

    // Constructor de la clase Curso
    public Curso(String nombre, String dia) {
        this.nombre = nombre;
        this.dia = dia;
        this.grupos = new Vector<>();
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getDia() {
        return dia;
    }

    public Vector<Grupo> getGrupos() {
        return new Vector<>(grupos);
    }

    public Docente getDocente() {
        return docente;
    }

    // Método para agregar un grupo al curso
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    // Método para asignar un docente al curso
    public void asignarDocente(Docente docente) {
        this.docente = docente;
    }

    public void asignarAlumnoAGrupo(String nombreGrupo, Alumno alumno) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombreGrupo)) {
                grupo.agregarAlumno(alumno);
                alumno.matricularCurso(this);
                return;
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre)
          .append(", Día: ").append(dia)
          .append(", Docente: ").append(docente != null ? docente.getNombre() : "No asignado")
          .append(", Grupos: ");
        for (Grupo grupo : grupos) {
            sb.append(grupo.getNombre()).append(" ");
        }
        return sb.toString().trim();
    }
}