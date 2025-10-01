package co.edu.udec.rutaescolar.application.services;

import co.edu.udec.rutaescolar.application.dto.DisponibilidadDTO;
import co.edu.udec.rutaescolar.application.ports.out.RepoBus;
import co.edu.udec.rutaescolar.application.ports.out.RepoConductor;
import co.edu.udec.rutaescolar.application.ports.in.ConsultarDisponibilidadIn;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

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
