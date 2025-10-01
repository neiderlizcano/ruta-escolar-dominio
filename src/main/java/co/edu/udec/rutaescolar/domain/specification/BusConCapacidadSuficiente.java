/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.specification;


import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

public final class BusConCapacidadSuficiente implements Specification<Bus> {
  private final Itinerario itinerario;
  public BusConCapacidadSuficiente(Itinerario itinerario){ this.itinerario = itinerario; }
  @Override public boolean isSatisfiedBy(Bus bus){
    return bus.capacidad().valor() >= itinerario.demandaMinima();
  }
}
