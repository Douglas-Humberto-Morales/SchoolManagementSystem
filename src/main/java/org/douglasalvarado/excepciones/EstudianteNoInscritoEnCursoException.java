package org.douglasalvarado.excepciones;

public class EstudianteNoInscritoEnCursoException extends Exception {
  public EstudianteNoInscritoEnCursoException(String mensaje) {
      super(mensaje);
  }
}