/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.valueobjects;

public record Itinerario(int demandaMinima) {
  public Itinerario {
    if (demandaMinima <= 0) throw new IllegalArgumentException("Demanda mínima inválida");
  }
}