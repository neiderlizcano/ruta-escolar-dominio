package co.edu.udec.rutaescolar.application.ports.in;

import co.edu.udec.rutaescolar.application.dto.AsignacionRequestDTO;
import co.edu.udec.rutaescolar.application.dto.AsignacionResponseDTO;

public interface AsignarBusIn {

    AsignacionResponseDTO run(AsignacionRequestDTO req); }