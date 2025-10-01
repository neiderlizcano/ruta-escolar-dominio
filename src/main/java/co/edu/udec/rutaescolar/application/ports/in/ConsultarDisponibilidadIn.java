
package co.edu.udec.rutaescolar.application.ports.in;

import co.edu.udec.rutaescolar.application.dto.DisponibilidadDTO;

public interface ConsultarDisponibilidadIn {

    DisponibilidadDTO run(String rutaId, int demandaMinima);
}
