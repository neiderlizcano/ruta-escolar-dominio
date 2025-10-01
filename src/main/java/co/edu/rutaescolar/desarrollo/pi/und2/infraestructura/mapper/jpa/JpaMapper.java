package co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.mapper.jpa;

import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.*;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.*;

public final class JpaMapper {

    private JpaMapper() {
    }

    public static Bus toDomain(BusEntity e) {
        return new Bus(e.id, new Placa(e.placa), new Capacidad(e.capacidad));
    }

    public static BusEntity toEntity(Bus b) {
        var e = new BusEntity();
        e.id = b.id();
        e.placa = b.placa().valor();
        e.capacidad = b.capacidad().valor();
        return e;
    }

    public static Conductor toDomain(ConductorEntity e) {
        return new Conductor(e.id);
    }

    public static ConductorEntity toEntity(Conductor c) {
        var e = new ConductorEntity();
        e.id = c.id();
        return e;
    }
}
