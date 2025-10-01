/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.dominio.servicios;

import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Bus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Conductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.excepciones.SinBusDisponible;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.excepciones.SinConductorDisponible;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;
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
