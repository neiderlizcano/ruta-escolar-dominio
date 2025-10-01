package co.edu.udec.rutaescolar.infrastructure.in.cli;

import co.edu.udec.rutaescolar.application.dto.AsignacionRequestDTO;
import java.util.Scanner;
import co.edu.udec.rutaescolar.application.ports.in.AsignarBusIn;

public final class CliAsignarBus {

    private final AsignarBusIn api;

    public CliAsignarBus(AsignarBusIn api) {
        this.api = api;
    }

    public void run() {
        var sc = new Scanner(System.in);
        System.out.print("RutaId: ");
        var rutaId = sc.nextLine();
        System.out.print("Demanda mínima: ");
        var demanda = Integer.parseInt(sc.nextLine());
        var resp = api.run(new AsignacionRequestDTO(rutaId, demanda));
        System.out.println("OK -> Ruta=" + resp.rutaId() + " Bus=" + resp.busId() 
                + " Conductor=" + resp.conductorId());
    }
}
