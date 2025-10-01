/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo;

public record Placa(String valor) {
  public Placa {
    if (valor == null || !valor.matches("^[A-Z]{3}\\d{3}$"))
      throw new IllegalArgumentException("Placa inválida");
  }
}
