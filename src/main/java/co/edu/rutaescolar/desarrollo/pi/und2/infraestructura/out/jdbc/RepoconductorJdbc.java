package co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.out.jdbc;

import java.util.List;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.RepoConductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Conductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;

public final class RepoConductorJdbc implements RepoConductor {

    @Override
    public List<Conductor> disponibles(Itinerario itin) {
        return List.of(new Conductor("C1"));
    }
}
