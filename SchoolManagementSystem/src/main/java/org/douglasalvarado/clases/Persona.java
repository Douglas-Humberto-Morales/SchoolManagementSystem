package org.douglasalvarado.clases;

import java.util.Date;

public class Persona {
  private String nombre;
  private String apellido;
  private Date fechaDeNacimiento;

  public Persona() {
  }

  public Persona(String nombre, String apellido, Date fechaDeNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaDeNacimiento = fechaDeNacimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Date getFechaDeNacimiento() {
    return fechaDeNacimiento;
  }

  public void setFechaDeNacimiento(Date fechaDeNacimiento) {
    this.fechaDeNacimiento = fechaDeNacimiento;
  }

}
