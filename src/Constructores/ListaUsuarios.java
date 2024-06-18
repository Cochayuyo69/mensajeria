/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anton
 */
public class ListaUsuarios {
    private Map<String, Usuario> usuarios;

    // Constructor
    public ListaUsuarios() {
        usuarios = new HashMap<>();
    }

    // Agregar un nuevo usuario a la lista
    public void agregarUsuario(String nombre, String contrasena, String tipo, Alumno alumno, Docente docente) {
        Usuario nuevoUsuario = new Usuario(nombre, contrasena, tipo, alumno, docente);
        usuarios.put(nombre, nuevoUsuario);
    }

    // Eliminar un usuario de la lista por nombre
    public void eliminarUsuario(String nombre) {
        usuarios.remove(nombre);
    }

    // Verificar si un usuario existe en la lista y cargar cursos si es docente
    public boolean verificarUsuario(String nombre, String contrasena) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null && usuario.contrasena.equals(contrasena)) {
            if ("Docente".equals(usuario.tipo)) {
                cargarCursosDictados((Docente) usuario.docente);
            }
            return true;
        }
        return false;
    }

    // Método auxiliar para cargar los cursos dictados por un docente
    private void cargarCursosDictados(Docente docente) {
        for (Curso curso : docente.getCursosAsignados()) {
            docente.asignarCurso(curso); // Esto asegura que los cursos estén correctamente asignados al docente
        }
    }

    // Obtener el tipo de usuario
    public String obtenerTipoUsuario(String nombre) {
        Usuario usuario = usuarios.get(nombre);
        return usuario != null ? usuario.tipo : null;
    }

    // Editar un usuario (actualizar contrasena o tipo)
    public void editarUsuario(String nombre, String nuevaContrasena, String nuevoTipo) {
        Usuario usuario = usuarios.get(nombre);
        if (usuario != null) {
            usuario.contrasena = nuevaContrasena;
            usuario.tipo = nuevoTipo;
        }
    }

    // Obtener el nombre del alumno asociado al usuario
    public String obtenerNombreAlumno(String nombreUsuario) {
        Usuario usuario = usuarios.get(nombreUsuario);
        return (usuario != null && usuario.alumno != null) ? usuario.alumno.getNombre() : null;
    }

    // Obtener el nombre del usuario
    public String obtenerNombreUsuario(String nombre) {
        Usuario usuario = usuarios.get(nombre);
        return (usuario != null) ? usuario.nombre : null;
    }

    // Obtener los cursos asociados a un usuario
    public List<Curso> obtenerCursosDeUsuario(String nombreUsuario) {
        Usuario usuario = usuarios.get(nombreUsuario);
        return (usuario != null && usuario.cursos != null) ? new ArrayList<>(usuario.cursos.values()) : new ArrayList<>();
    }

    // Método para obtener un alumno por su nombre de usuario
    public Alumno obtenerAlumno(String nombreUsuario) {
        Usuario usuario = usuarios.get(nombreUsuario);
        if (usuario != null && "Alumno".equals(usuario.tipo)) {
            return usuario.alumno;
        }
        return null;
    }

    // Método para obtener un docente por su nombre de usuario
    public Docente obtenerDocente(String nombreUsuario) {
        Usuario usuario = usuarios.get(nombreUsuario);
        if (usuario != null && "Docente".equals(usuario.tipo)) {
            return (Docente) usuario.docente;
            //System.out.println(Docente.);
        }
        return null;
    }

    // Método auxiliar para mostrar los usuarios (opcional)
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios.values()) {
            System.out.println("Nombre: " + usuario.nombre + ", Tipo: " + usuario.tipo);
        }
    }

    // Clase interna Usuario
    private class Usuario {
        private String nombre;
        private String contrasena;
        private String tipo;
        private Alumno alumno;
        private Docente docente;
        private Map<String, Curso> cursos;

        public Usuario(String nombre, String contrasena, String tipo, Alumno alumno, Docente docente) {
            this.nombre = nombre;
            this.contrasena = contrasena;
            this.tipo = tipo;
            this.alumno = alumno;
            this.docente = docente;
            this.cursos = new HashMap<>();
        }
    }
}