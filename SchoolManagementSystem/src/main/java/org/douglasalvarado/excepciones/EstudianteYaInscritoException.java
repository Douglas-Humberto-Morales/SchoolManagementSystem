package org.douglasalvarado.excepciones;

public class EstudianteYaInscritoException extends Exception {
  public EstudianteYaInscritoException(String mensaje) {
      super(mensaje);
  }
}