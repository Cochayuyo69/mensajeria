package Constructores;

import java.util.Vector;

public class Curso {
    private String nombre;
    private String dia;
    private Vector<Grupo> grupos;

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

    // Método para agregar un grupo al curso
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre)
          .append(", Día: ").append(dia)
          .append(", Grupos: ");
        for (Grupo grupo : grupos) {
            sb.append(grupo.getNombre()).append(" ");
        }
        return sb.toString().trim();
    }
    
}