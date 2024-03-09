/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte1;

/**
 *
 * @author admin
 */
// Clase Contador que representa un contador de programación
public class Contador {

  // Atributo de la clase: valor del contador
  private int valor;

  // Constructor por defecto de la clase: asigna un valor inicial al atributo
  public Contador() {
    this.valor = 0;
  }

  // Constructor con parámetros de la clase: recibe el valor del atributo y lo asigna
  public Contador(int valor) {
    this.valor = valor;
  }

  // Constructor que recibe un Contador del cual copia su valor
  public Contador(Contador otro) {
    this.valor = otro.valor;
  }

  // Métodos de acceso: permiten obtener y modificar el valor del atributo

  // Método que devuelve el valor del contador
  public int getValor() {
    return this.valor;
  }

  // Método que modifica el valor del contador
  public void setValor(int valor) {
    this.valor = valor;
  }

  // Método que incrementa el valor del contador en una unidad
  public void incrementar() {
    // Se suma una unidad al valor del contador
    this.valor = this.valor + 1;
  }

  // Método que decrementa el valor del contador en una unidad
  public void decrementar() {
    // Se resta una unidad al valor del contador
    this.valor = this.valor - 1;
  }

}
