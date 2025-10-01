/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion;

import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Bus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Conductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Ruta;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.eventos.AsignacionRealizada;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.RepoBus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.RepoConductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.servicios.AsignadorDeRecursos;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;
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
