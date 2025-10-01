/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.services;

import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.exceptions.SinBusDisponible;
import co.edu.udec.rutaescolar.domain.exceptions.SinConductorDisponible;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;
import java.util.List;

public final class AsignadorDeRecursos {

    public record Seleccion(Bus bus, Conductor conductor) {

    }

    public Seleccion elegir(List<Bus> buses, List<Conductor> conductores, Itinerario itin) {
        Bus bus = buses.stream().filter(b -> b.capacidad().valor() >= itin.demandaMinima()).findFirst()
                .orElseThrow(SinBusDisponible::new);
        Conductor conductor = conductores.stream().findFirst().orElseThrow(SinConductorDisponible::new);
        return new Seleccion(bus, conductor);
    }
}
