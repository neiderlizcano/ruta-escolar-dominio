/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.test.java.co.edu.udec.rutaescolar.aplication;

import co.edu.udec.rutaescolar.domain.model.Ruta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

final class RutaTest {

    @Test
    void no_permite_doble_asignacion() {
        var r = new Ruta("R1");
        r.asignarBus("B1", "C1");
        assertThrows(IllegalStateException.class, () -> r.asignarBus("B2", "C2"));
    }
}
