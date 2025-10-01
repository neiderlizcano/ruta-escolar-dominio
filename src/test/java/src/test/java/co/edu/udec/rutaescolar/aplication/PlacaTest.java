/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.test.java.co.edu.udec.rutaescolar.aplication;

import co.edu.udec.rutaescolar.domain.valueobjects.Placa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

final class PlacaTest {

    @Test
    void formato_valido() {
        assertEquals("ABC123", new Placa("ABC123").valor());
    }

    @Test
    void lanza_si_formato_invalido() {
        assertThrows(IllegalArgumentException.class, () -> new Placa("A1"));
    }
}
