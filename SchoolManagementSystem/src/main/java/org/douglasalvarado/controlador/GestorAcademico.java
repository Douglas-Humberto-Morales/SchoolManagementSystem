package org.douglasalvarado.controlador;

import org.douglasalvarado.clases.Curso;
import org.douglasalvarado.clases.Estudiante;
import org.douglasalvarado.excepciones.EstudianteYaInscritoException;
import org.douglasalvarado.excepciones.EstudianteNoInscritoEnCursoException;
import org.douglasalvarado.interfaz.ServiciosAcademicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico implements ServiciosAcademicos {

    private List<Estudiante> estudiantesMatriculados = new ArrayList<>();
    private List<Curso> cursosDisponibles = new ArrayList<>();
    private Map<Integer, ArrayList<Estudiante>> inscripcionesCurso = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantesMatriculados.contains(estudiante)) {
            estudiantesMatriculados.add(estudiante);
            System.out.println("El estudiante: " + estudiante.getNombre() + " matriculado exitosamente.");
        } else {
            System.out.println("El estudiante: " + estudiante.getNombre() + " ya está matriculado.");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursosDisponibles.contains(curso)) {
            cursosDisponibles.add(curso);
            inscripcionesCurso.put(curso.getId(), new ArrayList<>());
            System.out.println("El curso: " +  curso.getNombre() + " agregado exitosamente.");
        } else {
            System.out.println("El curso : " +  curso.getNombre() + " ya existe.");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        List<Estudiante> inscritos = inscripcionesCurso.get(idCurso);

        if (inscritos == null) {
            System.out.println("El curso no existe.");
            return;
        }

        if (inscritos.contains(estudiante)) {
            throw new EstudianteYaInscritoException("El estudiante: " + estudiante.getNombre() + " ya está inscrito en este curso.");
        }

        inscritos.add(estudiante);
        System.out.println("Estudiante: " + estudiante.getNombre() + " inscrito en el curso exitosamente.");
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        List<Estudiante> inscritos = inscripcionesCurso.get(idCurso);

        if (inscritos == null) {
            System.out.println("El curso no existe.");
            return;
        }

        Estudiante estudianteAEliminar = null;
        for (Estudiante estudiante : inscritos) {
            if (estudiante.getId() == idEstudiante) {
                estudianteAEliminar = estudiante;
                break;
            }
        }

        if (estudianteAEliminar == null) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en este curso.");
        }

        inscritos.remove(estudianteAEliminar);
        System.out.println("Estudiante: " + estudianteAEliminar.getNombre() + " desinscrito del curso exitosamente.");
    }
}
