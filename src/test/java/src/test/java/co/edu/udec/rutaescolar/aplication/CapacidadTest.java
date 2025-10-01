package src.test.java.co.edu.udec.rutaescolar.aplication;

import co.edu.udec.rutaescolar.domain.valueobjects.Capacidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

final class CapacidadTest {

    @Test
    void crea_valida() {
        assertEquals(10, new Capacidad(10).valor());
    }

    @Test
    void lanza_si_no_positivo() {
        assertThrows(IllegalArgumentException.class, () -> new Capacidad(0));
    }

    @Test
    void igualdad_por_valor() {
        assertEquals(new Capacidad(8), new Capacidad(8));
    }
}
