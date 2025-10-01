/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.test.java.co.edu.udec.rutaescolar.aplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import co.edu.udec.rutaescolar.domain.model.Bus;
import co.edu.udec.rutaescolar.domain.specification.BusConCapacidadSuficiente;
import co.edu.udec.rutaescolar.domain.valueobjects.*;

final class BusConCapacidadSuficienteTest {

    @Test
    void acepta_bus_con_capacidad_mayor_o_igual() {
        var spec = new BusConCapacidadSuficiente(new Itinerario(10));
        assertTrue(spec.isSatisfiedBy(new Bus("B1", new Placa("ABC123"), new Capacidad(12))));
        assertTrue(spec.isSatisfiedBy(new Bus("B2", new Placa("DEF456"), new Capacidad(10))));
        assertFalse(spec.isSatisfiedBy(new Bus("B3", new Placa("GHI789"), new Capacidad(8))));
    }
}
