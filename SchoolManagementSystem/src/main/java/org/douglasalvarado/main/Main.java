package org.douglasalvarado.main;

import java.util.Date;

import org.douglasalvarado.clases.Curso;
import org.douglasalvarado.clases.Estudiante;
import org.douglasalvarado.controlador.GestorAcademico;
import org.douglasalvarado.excepciones.EstudianteYaInscritoException;
import org.douglasalvarado.excepciones.EstudianteNoInscritoEnCursoException;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        GestorAcademico gestor = new GestorAcademico();

        Date fechaNacimiento = new Date(2000, 4, 15);
        
        Estudiante estudiante1 = new Estudiante(1, "Douglas", "Morales", fechaNacimiento, Estudiante.Estado.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2, "Juan", "Alvarado", fechaNacimiento, Estudiante.Estado.MATRICULADO);
        Curso curso1 = new Curso(101, "Programación Java", "Curso de programación", 2, "3");
        Curso curso2 = new Curso(102, "Matemáticas Discretas", "Matemáticas avanzadas", 1, "2");

        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);
        System.out.println();
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);
        System.out.println();
        
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getId());
            System.out.println();
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            System.out.println();
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());  // Esto debería lanzar una excepción
        }
        
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
            System.out.println();
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
            System.out.println();
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());  // Esto debería lanzar una excepción
        }
    }
}
