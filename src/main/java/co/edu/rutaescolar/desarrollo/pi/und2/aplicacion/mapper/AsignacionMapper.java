package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.mapper;

import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.dto.*;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;

public final class AsignacionMapper {

    private AsignacionMapper() {
    }

    public static Itinerario toItinerario(AsignacionRequestDTO req) {
        return new Itinerario(req.demandaMinima());
    }

    public static AsignacionResponseDTO toDTO(String rutaId, String busId, String condId) {
        return new AsignacionResponseDTO(rutaId, busId, condId);
    }
}