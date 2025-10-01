package co.edu.udec.rutaescolar.application.services;

import co.edu.udec.rutaescolar.application.dto.AsignacionRequestDTO;
import co.edu.udec.rutaescolar.application.dto.AsignacionResponseDTO;
import co.edu.udec.rutaescolar.application.mapper.AsignacionMapper;
import co.edu.udec.rutaescolar.application.ports.in.AsignarBusIn;
import co.edu.udec.rutaescolar.application.usecases.AsignarBusUseCase;
import co.edu.udec.rutaescolar.domain.model.Ruta;

public final class AsignarBusService implements AsignarBusIn {

    private final AsignarBusUseCase useCase;

    public AsignarBusService(AsignarBusUseCase uc) {
        this.useCase = uc;
    }

    @Override
    public AsignacionResponseDTO run(AsignacionRequestDTO req) {
        var ruta = new Ruta(req.rutaId());
        var itin = AsignacionMapper.toItinerario(req);
        var ev = useCase.run(ruta, itin);
        return AsignacionMapper.toDTO(ev.rutaId, ev.busId, ev.conductorId);
    }
}
