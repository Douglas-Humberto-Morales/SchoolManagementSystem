package org.douglasalvarado.interfaz;

import org.douglasalvarado.clases.Curso;
import org.douglasalvarado.clases.Estudiante;
import org.douglasalvarado.excepciones.EstudianteNoInscritoEnCursoException;
import org.douglasalvarado.excepciones.EstudianteYaInscritoException;

public interface ServiciosAcademicos {

  public void matricularEstudiante(Estudiante estudiante);

  public void agregarCurso(Curso curso);

  public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;
    
  public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;
  
}
