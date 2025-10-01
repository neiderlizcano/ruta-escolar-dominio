/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.application.usecases;

import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.model.Ruta;
import co.edu.udec.rutaescolar.domain.events.AsignacionRealizada;
import co.edu.udec.rutaescolar.application.ports.out.RepoBus;
import co.edu.udec.rutaescolar.application.ports.out.RepoConductor;
import co.edu.udec.rutaescolar.domain.services.AsignadorDeRecursos;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;
import java.util.List;

public final class AsignarBusUseCase {

    private final RepoBus repoBus;
    private final RepoConductor repoConductor;
    private final AsignadorDeRecursos asignador;

    public AsignarBusUseCase(RepoBus repoBus, RepoConductor repoConductor,
            AsignadorDeRecursos asignador) {
        this.repoBus = repoBus;
        this.repoConductor = repoConductor;
        this.asignador = asignador;
    }

    public AsignacionRealizada run(Ruta ruta, Itinerario itin) {
        List<Bus> buses = repoBus.disponibles(itin);
        List<Conductor> conductores = repoConductor.disponibles(itin);
        var sel = asignador.elegir(buses, conductores, itin);
        ruta.asignarBus(sel.bus().id(), sel.conductor().id());
        return new AsignacionRealizada(ruta.id(), sel.bus().id(),
                sel.conductor().id());
    }
}
