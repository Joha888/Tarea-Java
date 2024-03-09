/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte1;

/**
 *
 * @author admin
 */
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar fecha;

    // Constructor por defecto
    public Fecha() {
        fecha = new GregorianCalendar();
    }

    // Constructor con parámetros
    public Fecha(int año, int mes, int dia) {
        fecha = new GregorianCalendar(año, mes - 1, dia);
    }

    // Constructor copia
    public Fecha(Fecha otraFecha) {
        this.fecha = (GregorianCalendar) otraFecha.getFecha().clone();
    }

    // Método para comprobar si la fecha es correcta
    public boolean fechaCorrecta() {
        try {
            fecha.setLenient(false);
            fecha.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Método para sumar un día al valor actual de la fecha
    public void sumarUnDia() {
        fecha.add(GregorianCalendar.DAY_OF_MONTH, 1);
    }

    // Método de acceso para obtener la fecha
    public GregorianCalendar getFecha() {
        return fecha;
    }

    // Método toString para imprimir la fecha
    @Override
    public String toString() {
        return fecha.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
               (fecha.get(GregorianCalendar.MONTH) + 1) + "/" +
               fecha.get(GregorianCalendar.YEAR);
    }
}

