
package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.puertos.in;

import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.dto.*;

public interface ConsultarDisponibilidadIn {

    DisponibilidadDTO run(String rutaId, int demandaMinima);
}
