package mensajeria;

import Constructores.Alumno;
import Constructores.Curso;
import Constructores.Grupo;
import Constructores.Nodo;
import forms.frmCursos;
import forms.frmLogin;
import java.util.ArrayList;
import java.util.List;

public class Mensajeria {
    public static void main(String[] args) {
//        // Crear una instancia de Chat
//        Chat chat = new Chat();
//
//        // Crear alumnos
//        Alumno alumno1 = new Alumno("Juan", "Primero");
//        Alumno alumno2 = new Alumno("Ana", "Primero");
//        Alumno alumno3 = new Alumno("Luis", "Segundo");
//        Alumno alumno4 = new Alumno("Maria", "Segundo");
//
//        // Crear nodos para los alumnos
//        Nodo<Alumno> nodoAlumno1 = new Nodo<>(alumno1);
//        Nodo<Alumno> nodoAlumno2 = new Nodo<>(alumno2);
//        Nodo<Alumno> nodoAlumno3 = new Nodo<>(alumno3);
//        Nodo<Alumno> nodoAlumno4 = new Nodo<>(alumno4);
//
//        // Crear una lista de nodos de Alumnos
//        List<Nodo<Alumno>> listaNodosAlumnos = new ArrayList<>();
//        listaNodosAlumnos.add(nodoAlumno1);
//        listaNodosAlumnos.add(nodoAlumno2);
//        listaNodosAlumnos.add(nodoAlumno3);
//        listaNodosAlumnos.add(nodoAlumno4);
//
//        // Crear grupos y agregar alumnos
//        Grupo grupo1 = new Grupo("Grupo 1");
//        grupo1.agregarAlumno(alumno1);
//        grupo1.agregarAlumno(alumno2);
//
//        Grupo grupo2 = new Grupo("Grupo 2");
//        grupo2.agregarAlumno(alumno3);
//        grupo2.agregarAlumno(alumno4);
//
//        // Crear nodos para los grupos
//        Nodo<Grupo> nodoGrupo1 = new Nodo<>(grupo1);
//        Nodo<Grupo> nodoGrupo2 = new Nodo<>(grupo2);
//
//        // Crear una lista de nodos de grupos
//        List<Nodo<Grupo>> listaNodosGrupos = new ArrayList<>();
//        listaNodosGrupos.add(nodoGrupo1);
//        listaNodosGrupos.add(nodoGrupo2);
//
//        // Crear cursos y agregar grupos
//        Curso curso = new Curso("Matemática II", "Lunes");
//        curso.agregarGrupo(grupo1);
//        curso.agregarGrupo(grupo2);
//
//        Curso curso2 = new Curso("Creatividad e Innovación", "Martes");
//        curso2.agregarGrupo(grupo1);
//        curso2.agregarGrupo(grupo2);
//
//        Curso curso3 = new Curso("Electrónica y Circuitos Digitales", "Miércoles");
//        curso3.agregarGrupo(grupo1);
//        curso3.agregarGrupo(grupo2);
//
//        Curso curso4 = new Curso("Empredimiento y Organización de Empresas", "Jueves");
//        curso4.agregarGrupo(grupo1);
//        curso4.agregarGrupo(grupo2);
//
//        // Crear nodos para los cursos
//        Nodo<Curso> nodoCurso = new Nodo<>(curso);
//        Nodo<Curso> nodoCurso2 = new Nodo<>(curso2);
//        Nodo<Curso> nodoCurso3 = new Nodo<>(curso3);
//        Nodo<Curso> nodoCurso4 = new Nodo<>(curso4);
//
//        // Crear una lista de nodos de cursos
//        List<Nodo<Curso>> listaNodosCursos = new ArrayList<>();
//        listaNodosCursos.add(nodoCurso);
//        listaNodosCursos.add(nodoCurso2);
//        listaNodosCursos.add(nodoCurso3);
//        listaNodosCursos.add(nodoCurso4);
////
////        // Mostrar la información almacenada en los nodos
////        for (Grupo grupo : nodoCurso.getData().getGrupos()) {
////            System.out.println("Grupo: " + grupo.getNombre());
////            for (Alumno alumno : grupo.getIntegrantes()) {
////                System.out.println("  Alumno: " + alumno.getNombre() + ", Ciclo: " + alumno.getCiclo());
////            }
////        }
//
        frmLogin f = new frmLogin();
        f.setVisible(true);
          
    }
}
