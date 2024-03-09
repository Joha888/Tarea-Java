/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte1;

/**
 *
 * @author admin
 */
// Clase CuentaCorriente que representa una cuenta corriente bancaria
public class CuentaCorriente {

  // Atributos de la clase: saldo, límite de descubierto y número de cuenta de la cuenta corriente
  private double saldo;
  private double limiteDescubierto;
  private String numeroCuenta;

  // Constructor por defecto de la clase: asigna valores iniciales a los atributos
  public CuentaCorriente() {
    this.saldo = 0;
    this.limiteDescubierto = -1000;
    this.numeroCuenta = "0000-0000-00-0000000000";
  }

  // Constructor con parámetros de la clase: recibe los valores de los atributos y los asigna
  public CuentaCorriente(double saldo, double limiteDescubierto, String numeroCuenta) {
    this.saldo = saldo;
    this.limiteDescubierto = limiteDescubierto;
    this.numeroCuenta = numeroCuenta;
  }

  // Constructor que recibe una CuentaCorriente de la cual copia todos sus datos
  public CuentaCorriente(CuentaCorriente otra) {
    this.saldo = otra.saldo;
    this.limiteDescubierto = otra.limiteDescubierto;
    this.numeroCuenta = otra.numeroCuenta;
  }

  // Métodos de acceso: permiten obtener y modificar los valores de los atributos

  // Método que devuelve el saldo de la cuenta corriente
  public double getSaldo() {
    return this.saldo;
  }

  // Método que modifica el saldo de la cuenta corriente
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  // Método que devuelve el límite de descubierto de la cuenta corriente
  public double getLimiteDescubierto() {
    return this.limiteDescubierto;
  }

  // Método que modifica el límite de descubierto de la cuenta corriente
  public void setLimiteDescubierto(double limiteDescubierto) {
    this.limiteDescubierto = limiteDescubierto;
  }

  // Método que devuelve el número de cuenta de la cuenta corriente
  public String getNumeroCuenta() {
    return this.numeroCuenta;
  }

  // Método que modifica el número de cuenta de la cuenta corriente
  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  // Método que muestra el estado de la cuenta corriente
  public void mostrarEstado() {
    // Se muestra el saldo y el límite de descubierto de la cuenta corriente
    System.out.println("El saldo de la cuenta " + this.numeroCuenta + " es: " + this.saldo);
    System.out.println("El límite de descubierto de la cuenta " + this.numeroCuenta + " es: " + this.limiteDescubierto);
  }

  // Método que realiza un ingreso en la cuenta corriente
  public void ingreso(double cantidad) {
    // Se comprueba que la cantidad sea positiva
    if (cantidad > 0) {
      // Se suma la cantidad al saldo de la cuenta corriente
      this.saldo = this.saldo + cantidad;
      // Se muestra un mensaje indicando que el ingreso ha sido realizado
      System.out.println("Se ha ingresado " + cantidad + " en la cuenta " + this.numeroCuenta);
    } else {
      // Se muestra un mensaje indicando que la cantidad no es válida
      System.out.println("La cantidad a ingresar debe ser positiva");
    }
  }

  // Método que realiza un egreso en la cuenta corriente
  public void egreso(double cantidad) {
    // Se comprueba que la cantidad sea positiva
    if (cantidad > 0) {
      // Se resta la cantidad al saldo de la cuenta corriente
      this.saldo = this.saldo - cantidad;
      // Se muestra un mensaje indicando que el egreso ha sido realizado
      System.out.println("Se ha retirado " + cantidad + " de la cuenta " + this.numeroCuenta);
    } else {
      // Se muestra un mensaje indicando que la cantidad no es válida
      System.out.println("La cantidad a retirar debe ser positiva");
    }
  }

  // Método que realiza un reintegro en la cuenta corriente
  public void reintegro(double cantidad) {
    // Se comprueba que la cantidad sea positiva
    if (cantidad > 0) {
      // Se comprueba que el saldo menos la cantidad no sea menor que el límite de descubierto
      if (this.saldo - cantidad >= this.limiteDescubierto) {
        // Se resta la cantidad al saldo de la cuenta corriente
        this.saldo = this.saldo - cantidad;
        // Se muestra un mensaje indicando que el reintegro ha sido realizado
        System.out.println("Se ha reintegrado " + cantidad + " de la cuenta " + this.numeroCuenta);
      } else {
        // Se muestra un mensaje indicando que no hay suficiente saldo disponible
        System.out.println("No hay suficiente saldo disponible para reintegrar " + cantidad + " de la cuenta " + this.numeroCuenta);
      }
    } else {
      // Se muestra un mensaje indicando que la cantidad no es válida
      System.out.println("La cantidad a reintegrar debe ser positiva");
    }
  }

  // Método que realiza una transferencia desde la cuenta corriente a otra cuenta corriente
  public void transferencia(CuentaCorriente destino, double cantidad) {
    // Se comprueba que la cantidad sea positiva
    if (cantidad > 0) {
      // Se comprueba que el saldo menos la cantidad no sea menor que el límite de descubierto
      if (this.saldo - cantidad >= this.limiteDescubierto) {
        // Se resta la cantidad al saldo de la cuenta corriente
        this.saldo = this.saldo - cantidad;
        // Se suma la cantidad al saldo de la cuenta corriente destino
        destino.saldo = destino.saldo + cantidad;
        // Se muestra un mensaje indicando que la transferencia ha sido realizada
        System.out.println("Se ha transferido " + cantidad + " desde la cuenta " + this.numeroCuenta + " a la cuenta " + destino.numeroCuenta);
      } else {
        // Se muestra un mensaje indicando que no hay suficiente saldo disponible
        System.out.println("No hay suficiente saldo disponible para transferir " + cantidad + " desde la cuenta " + this.numeroCuenta + " a la cuenta " + destino.numeroCuenta);
      }
    } else {
      // Se muestra un mensaje indicando que la cantidad no es válida
      System.out.println("La cantidad a transferir debe ser positiva");
    }
  }

}
