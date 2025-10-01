package co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.out.jdbc;

import java.util.List;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.RepoBus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Bus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.*;

public final class RepoBusJdbc implements RepoBus {

    @Override
    public List<Bus> disponibles(Itinerario itin) {
        return List.of(new Bus("B1", new Placa("ABC123"), new Capacidad(12)));
    }
}
