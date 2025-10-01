package src.test.java.co.edu.udec.rutaescolar.aplication;

import co.edu.udec.rutaescolar.application.usecases.AsignarBusUseCase;
import co.edu.udec.rutaescolar.application.ports.out.RepoBus;
import co.edu.udec.rutaescolar.application.ports.out.RepoConductor;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.model.Ruta;
import co.edu.udec.rutaescolar.domain.events.AsignacionRealizada;
import co.edu.udec.rutaescolar.domain.exceptions.SinBusDisponible;
import co.edu.udec.rutaescolar.domain.services.AsignadorDeRecursos;
import co.edu.udec.rutaescolar.domain.valueobjects.Capacidad;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;
import co.edu.udec.rutaescolar.domain.valueobjects.Placa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

final class AsignarBusUseCaseTest {

  // Dobles de puertos
  RepoBus fakeRepoBus(List<Bus> buses) { return itin -> buses; }
  RepoConductor fakeRepoConductor(List<Conductor> conds) { return itin -> conds; }

  @Test
  void asigna_bus_y_conductor_cuando_hay_capacidad() {
    var itin = new Itinerario(8);
    var buses = List.of(new Bus("B1", new Placa("ABC123"), new Capacidad(10)));
    var conds = List.of(new Conductor("C1"));

    var uc = new AsignarBusUseCase(fakeRepoBus(buses), fakeRepoConductor(conds), new AsignadorDeRecursos());
    var ruta = new Ruta("R1");

    AsignacionRealizada ev = uc.run(ruta, itin);

    assertEquals("B1", ruta.busId());
    assertEquals("C1", ruta.conductorId());
    assertEquals("R1", ev.rutaId);
    assertEquals("B1", ev.busId);
    assertEquals("C1", ev.conductorId);
  }

  @Test
  void falla_si_no_hay_bus_con_capacidad_suficiente() {
    var itin = new Itinerario(12);
    var buses = List.of(new Bus("B1", new Placa("ABC123"), new Capacidad(10))); // insuficiente
    var conds = List.of(new Conductor("C1"));

    var uc = new AsignarBusUseCase(fakeRepoBus(buses), fakeRepoConductor(conds), new AsignadorDeRecursos());
    var ruta = new Ruta("R1");

    assertThrows(SinBusDisponible.class, () -> uc.run(ruta, itin));
  }
}
