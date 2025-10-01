package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion;

import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.*;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.eventos.AsignacionRealizada;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.excepciones.SinBusDisponible;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos.*;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.servicios.AsignadorDeRecursos;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Capacidad;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Placa;
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
