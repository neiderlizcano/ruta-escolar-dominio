package co.edu.udec.rutaescolar.infrastructure.config;

import co.edu.udec.rutaescolar.infrastructure.out.jdbc.RepoBusJdbc;
import co.edu.udec.rutaescolar.infrastructure.out.jdbc.RepoConductorJdbc;
import co.edu.udec.rutaescolar.application.usecases.AsignarBusUseCase;
import co.edu.udec.rutaescolar.application.ports.in.AsignarBusIn;
import co.edu.udec.rutaescolar.application.services.AsignarBusService;
import co.edu.udec.rutaescolar.domain.services.AsignadorDeRecursos;
import co.edu.udec.rutaescolar.infrastructure.in.cli.CliAsignarBus;

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
