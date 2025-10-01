package co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.config;

import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.AsignarBusUseCase;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.puertos.in.AsignarBusIn;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.servicios.AsignarBusService;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.servicios.AsignadorDeRecursos;
import co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.out.jdbc.*;
import co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.in.cli.CliAsignarBus;

public final class Bootstrap {

    public static void main(String[] args) {
        var repoBus = new RepoBusJdbc();
        var repoCon = new RepoConductorJdbc();
        var asignador = new AsignadorDeRecursos();
        var useCase = new AsignarBusUseCase(repoBus, repoCon, asignador);
        AsignarBusIn api = new AsignarBusService(useCase);
        new CliAsignarBus(api).run();
    }
}
