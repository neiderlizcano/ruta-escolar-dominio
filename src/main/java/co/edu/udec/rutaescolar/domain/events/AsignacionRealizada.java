/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.events;

import java.time.Instant;

public final class AsignacionRealizada {

    public final String rutaId;
    public final String busId;
    public final String conductorId;
    public final Instant occurredOn;

    public AsignacionRealizada(String rutaId, String busId, String conductorId) {
        this.rutaId = rutaId;
        this.busId = busId;
        this.conductorId = conductorId;
        this.occurredOn = Instant.now();
    }
}
