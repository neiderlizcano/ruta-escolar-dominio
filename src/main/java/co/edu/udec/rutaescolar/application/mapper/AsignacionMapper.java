package co.edu.udec.rutaescolar.application.mapper;

import co.edu.udec.rutaescolar.application.dto.AsignacionRequestDTO;
import co.edu.udec.rutaescolar.application.dto.AsignacionResponseDTO;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

public final class AsignacionMapper {

    private AsignacionMapper() {
    }

    public static Itinerario toItinerario(AsignacionRequestDTO req) {
        return new Itinerario(req.demandaMinima());
    }

    public static AsignacionResponseDTO toDTO(String rutaId, String busId,
            String condId) {
        return new AsignacionResponseDTO(rutaId, busId, condId);
    }
}
