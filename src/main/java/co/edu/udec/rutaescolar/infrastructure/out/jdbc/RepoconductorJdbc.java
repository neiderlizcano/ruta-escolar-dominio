package co.edu.udec.rutaescolar.infrastructure.out.jdbc;

import java.util.List;
import co.edu.udec.rutaescolar.application.ports.out.RepoConductor;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

public final class RepoConductorJdbc implements RepoConductor {

    @Override
    public List<Conductor> disponibles(Itinerario itin) {
        return List.of(new Conductor("C1"));
    }
}
