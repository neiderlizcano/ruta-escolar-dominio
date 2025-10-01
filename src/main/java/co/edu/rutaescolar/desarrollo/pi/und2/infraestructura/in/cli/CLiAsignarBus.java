package co.edu.rutaescolar.desarrollo.pi.und2.infraestructura.in.cli;

import java.util.Scanner;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.dto.*;
import co.edu.rutaescolar.desarrollo.pi.und2.aplicacion.puertos.in.AsignarBusIn;

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
        System.out.println("OK -> Ruta=" + resp.rutaId() + " Bus=" + resp.busId() + " Conductor=" + resp.conductorId());
    }
}
