package org.douglasalvarado.clases;

public class Curso {

  private Integer id;
  private String nombre;
  private String descripcion;
  private Integer numeroCreditos;
  private String version;

  public Curso() {
  }

  public Curso(Integer id, String nombre, String descripcion, Integer numeroCreditos, String version) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.numeroCreditos = numeroCreditos;
    this.version = version;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Integer getNumeroCreditos() {
    return numeroCreditos;
  }

  public void setNumeroCreditos(Integer numeroCreditos) {
    this.numeroCreditos = numeroCreditos;
  }

  public String getversion() {
    return version;
  }

  public void setversion(String version) {
    this.version = version;
  }

}
