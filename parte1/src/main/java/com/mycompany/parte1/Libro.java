/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte1;

/**
 *
 * @author admin
 */
// Clase Libro que representa un libro con sus datos y operaciones
public class Libro {

  // Atributos de la clase: título, isbn y autor del libro
  private String titulo;
  private String isbn;
  private String autor;

  // Constructor por defecto de la clase: asigna valores vacíos a los atributos
  public Libro() {
    this.titulo = "";
    this.isbn = "";
    this.autor = "";
  }

  // Constructor con parámetros de la clase: recibe los valores de los atributos y los asigna
  public Libro(String titulo, String isbn, String autor) {
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor = autor;
  }

  // Métodos de acceso: permiten obtener y modificar los valores de los atributos

  // Método que devuelve el título del libro
  public String getTitulo() {
    return this.titulo;
  }

  // Método que modifica el título del libro
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  // Método que devuelve el isbn del libro
  public String getIsbn() {
    return this.isbn;
  }

  // Método que modifica el isbn del libro
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  // Método que devuelve el autor del libro
  public String getAutor() {
    return this.autor;
  }

  // Método que modifica el autor del libro
  public void setAutor(String autor) {
    this.autor = autor;
  }

  // Método que devuelve la representación en cadena del libro
  @Override
  public String toString() {
    // Se devuelve una cadena con el formato: título, isbn, autor
    return this.titulo + ", " + this.isbn + ", " + this.autor;
  }

  // Método que realiza el préstamo del libro
  public void prestamo() {
    // Se muestra un mensaje indicando que el libro ha sido prestado
    System.out.println("El libro " + this.titulo + " ha sido prestado.");
  }

  // Método que realiza la devolución del libro
  public void devolucion() {
    // Se muestra un mensaje indicando que el libro ha sido devuelto
    System.out.println("El libro " + this.titulo + " ha sido devuelto.");
  }

}
