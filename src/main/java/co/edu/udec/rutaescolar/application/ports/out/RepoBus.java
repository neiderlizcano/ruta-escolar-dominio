package co.edu.udec.rutaescolar.application.ports.out;

import java.util.List;
import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

public interface RepoBus {

    List<Bus> disponibles(Itinerario itin);
}
