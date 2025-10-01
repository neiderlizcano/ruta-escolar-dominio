package co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos;

import java.util.List;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Bus;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;

public interface RepoBus {

    List<Bus> disponibles(Itinerario itin);
}
