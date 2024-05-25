package Constructores;

public class Alumno {
    private String nombre;
    private String ciclo;
    
    // Constructor de la clase Alumno
    public Alumno(String nombre, String ciclo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }
    
    public String getCiclo() {
        return ciclo;
    }
    
}
