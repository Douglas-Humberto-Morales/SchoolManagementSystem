package org.douglasalvarado.clases;

import java.util.Date;

public class Estudiante extends Persona{

  public enum Estado {
    MATRICULADO,
    INACTIVO,
    GRADUADO
  }

  private Integer id;
  private Estado estado;

  public Estudiante() {
  }

  public Estudiante(Integer id, String nombre, String apellido, Date fechaDeNacimiento, Estado estado) {
    super(nombre, apellido, fechaDeNacimiento);
    this.id = id;
    this.estado = estado;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }
}
