package co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.servicios;

import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.dto.*;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.mapper.AsignacionMapper;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.puertos.in.AsignarBusIn;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.AsignarBusUseCase;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Ruta;

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
