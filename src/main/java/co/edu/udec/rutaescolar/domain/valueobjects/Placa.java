/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.valueobjects;

public record Placa(String valor) {
  public Placa {
    if (valor == null || !valor.matches("^[A-Z]{3}\\d{3}$"))
      throw new IllegalArgumentException("Placa inválida");
  }
}
