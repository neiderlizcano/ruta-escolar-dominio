/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades;

public final class Ruta {

    private final String id;
    private String busId;
    private String conductorId;

    public Ruta(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id de ruta inválido");
        }
        this.id = id;
    }

    public void asignarBus(String busId, String conductorId) {
        if (this.busId != null || this.conductorId != null) {
            throw new IllegalStateException("Ruta ya asignada");
        }
        this.busId = busId;
        this.conductorId = conductorId;
    }

    public String id() {
        return id;
    }

    public String busId() {
        return busId;
    }

    public String conductorId() {
        return conductorId;
    }
}
