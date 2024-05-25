package Constructores;
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private List<Alumno> integrantes;

    // Constructor de la clase Grupo
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getIntegrantes() {
        return new ArrayList<>(integrantes);
    }

    // Método para agregar un alumno al grupo
    public void agregarAlumno(Alumno alumno) {
        integrantes.add(alumno);
    }
}