/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.test.java.co.edu.udec.rutaescolar.aplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import co.edu.udec.rutaescolar.domain.model.*;
import co.edu.udec.rutaescolar.domain.services.AsignadorDeRecursos;
import co.edu.udec.rutaescolar.domain.valueobjects.*;

final class AsignadorDeRecursosTest {

    @Test
    void elige_bus_con_capacidad_y_un_conductor() {
        var srv = new AsignadorDeRecursos();
        var buses = List.of(new Bus("B1", new Placa("ABC123"), new Capacidad(12)));
        var conds = List.of(new Conductor("C1"));
        var sel = srv.elegir(buses, conds, new Itinerario(10));
        assertEquals("B1", sel.bus().id());
        assertEquals("C1", sel.conductor().id());
    }
}
