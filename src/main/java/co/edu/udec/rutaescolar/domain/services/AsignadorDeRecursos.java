package co.edu.udec.rutaescolar.domain.services;

import co.edu.udec.rutaescolar.domain.exceptions.SinBusDisponible;
import co.edu.udec.rutaescolar.domain.exceptions.SinConductorDisponible;
import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.specification.BusConCapacidadSuficiente;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

import java.util.List;

public final class AsignadorDeRecursos {

    public record Seleccion(Bus bus, Conductor conductor) {}

    public Seleccion elegir(List<Bus> buses, List<Conductor> conductores, Itinerario itin) {
        var spec = new BusConCapacidadSuficiente(itin);

        var bus = buses.stream()
                .filter(spec::isSatisfiedBy)
                .findFirst()
                .orElseThrow(SinBusDisponible::new);

        var conductor = conductores.stream()
                .findFirst()
                .orElseThrow(SinConductorDisponible::new);

        return new Seleccion(bus, conductor);
    }
}