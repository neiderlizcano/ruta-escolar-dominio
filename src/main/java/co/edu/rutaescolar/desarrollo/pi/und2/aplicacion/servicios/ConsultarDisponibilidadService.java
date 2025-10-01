package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.servicios;

import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.dto.*;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.puertos.in.ConsultarDisponibilidadIn;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.*;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;

public final class ConsultarDisponibilidadService implements ConsultarDisponibilidadIn {

    private final RepoBus repoBus;
    private final RepoConductor repoCon;

    public ConsultarDisponibilidadService(RepoBus b, RepoConductor c) {
        this.repoBus = b;
        this.repoCon = c;
    }

    @Override
    public DisponibilidadDTO run(String rutaId, int demandaMinima) {
        var itin = new Itinerario(demandaMinima);
        return new DisponibilidadDTO(!repoBus.disponibles(itin).isEmpty(), !repoCon.disponibles(itin).isEmpty());
    }
}
