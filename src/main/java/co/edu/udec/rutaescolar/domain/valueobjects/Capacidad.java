/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.valueobjects;

public record Capacidad(int valor) {
  public Capacidad {
    if (valor <= 0) throw new IllegalArgumentException("Capacidad inválida");
  }
}
