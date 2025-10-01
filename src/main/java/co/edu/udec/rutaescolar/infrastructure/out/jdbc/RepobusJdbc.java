package co.edu.udec.rutaescolar.infrastructure.out.jdbc;

import co.edu.udec.rutaescolar.domain.valueobjects.Placa;
import co.edu.udec.rutaescolar.domain.valueobjects.Capacidad;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;
import java.util.List;
import co.edu.udec.rutaescolar.application.ports.out.RepoBus;
import co.edu.udec.rutaescolar.domain.model.Bus;

public final class RepoBusJdbc implements RepoBus {

    @Override
    public List<Bus> disponibles(Itinerario itin) {
        return List.of(new Bus("B1", new Placa("ABC123"), new Capacidad(12)));
    }
}
