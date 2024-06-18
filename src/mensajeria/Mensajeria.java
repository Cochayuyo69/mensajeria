package mensajeria;

import Constructores.Alumno;
import Constructores.Curso;
import Constructores.Docente;
import Constructores.Grupo;
import Constructores.ListaUsuarios;
import forms.frmLogin;
import java.util.ArrayList;
import java.util.List;

public class Mensajeria {
    public static void main(String[] args) {
        // Crear una instancia de Chat
        Chat chat = new Chat();
        
        // Creación de listas
        List<Alumno> listaAlumnos = new ArrayList<>();
        List<Docente> listaDocentes = new ArrayList<>();
        List<Curso> listaCursos = new ArrayList<>();
        List<Grupo> listaGrupos = new ArrayList<>();
        ListaUsuarios listaUsuarios = new ListaUsuarios();

        // Creación de objetos Docente
        Docente docente1 = new Docente("Dr. Smith");
        Docente docente2 = new Docente("Prof. Johnson");

        // Creación de objetos Alumno
        Alumno alumno1 = new Alumno("Juan Perez", "2021");
        Alumno alumno2 = new Alumno("Ana Gomez", "2021");
        Alumno alumno3 = new Alumno("Luis Lopez", "2021");
        Alumno alumno4 = new Alumno("Maria Martinez", "2021");

        // Creación de objetos Curso
        Curso cursoMatematicas = new Curso("Matemáticas", "Lunes");
        Curso cursoFisica = new Curso("Física", "Martes");

        // Asignación de docentes a cursos
        cursoMatematicas.asignarDocente(docente1);
        cursoFisica.asignarDocente(docente2);

        // Agregar los cursos asignados a los docentes
        docente1.asignarCurso(cursoMatematicas);
        docente2.asignarCurso(cursoFisica);

        // Creación de objetos Grupo
        Grupo grupo1 = new Grupo("Grupo 1");
        Grupo grupo2 = new Grupo("Grupo 2");
        Grupo grupo3 = new Grupo("Grupo 3");
        Grupo grupo4 = new Grupo("Grupo 4");

        // Agregar grupos a cursos
        cursoMatematicas.agregarGrupo(grupo1);
        cursoMatematicas.agregarGrupo(grupo2);
        cursoFisica.agregarGrupo(grupo3);
        cursoFisica.agregarGrupo(grupo4);

        // Asignar alumnos a grupos dentro de cursos
        cursoMatematicas.asignarAlumnoAGrupo("Grupo 1", alumno1);
        cursoMatematicas.asignarAlumnoAGrupo("Grupo 1", alumno2);
        cursoMatematicas.asignarAlumnoAGrupo("Grupo 2", alumno3);

        cursoFisica.asignarAlumnoAGrupo("Grupo 3", alumno1);
        cursoFisica.asignarAlumnoAGrupo("Grupo 3", alumno4);
        cursoFisica.asignarAlumnoAGrupo("Grupo 4", alumno2);
        cursoFisica.asignarAlumnoAGrupo("Grupo 4", alumno3);

        // Agregar cursos a la lista de cursos
        listaCursos.add(cursoMatematicas);
        listaCursos.add(cursoFisica);

        // Agregar alumnos a la lista de alumnos
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);

        // Agregar docentes a la lista de docentes
        listaDocentes.add(docente1);
        listaDocentes.add(docente2);

        // Agregar grupos a la lista de grupos
        listaGrupos.add(grupo1);
        listaGrupos.add(grupo2);
        listaGrupos.add(grupo3);
        listaGrupos.add(grupo4);

        // Agregar usuarios a ListaUsuarios
        listaUsuarios.agregarUsuario("jperez", "jperez123", "Alumno", alumno1, null);
        listaUsuarios.agregarUsuario("agomez", "agomez123", "Alumno", alumno2, null);
        listaUsuarios.agregarUsuario("llopez", "llopez123", "Alumno", alumno3, null);
        listaUsuarios.agregarUsuario("mmartinez", "mmartinez123", "Alumno", alumno4, null);
        listaUsuarios.agregarUsuario("admin", "admin123", "Docente", null, docente2);
        listaUsuarios.agregarUsuario("Smith", "contrasena", "Docente", null, docente1);
        
        frmLogin f = new frmLogin(listaAlumnos, listaDocentes, listaCursos, listaGrupos, listaUsuarios, chat);
        f.setVisible(true); 
    }
}
