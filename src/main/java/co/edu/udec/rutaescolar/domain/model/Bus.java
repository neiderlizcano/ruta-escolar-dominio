/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.model;

import co.edu.udec.rutaescolar.domain.valueobjects.Capacidad;
import co.edu.udec.rutaescolar.domain.valueobjects.Placa;

public final class Bus {

    private final String id;
    private final Placa placa;
    private final Capacidad capacidad;

    public Bus(String id, Placa placa, Capacidad capacidad) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id de bus inválido");
        }
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public String id() {
        return id;
    }

    public Placa placa() {
        return placa;
    }

    public Capacidad capacidad() {
        return capacidad;
    }
}
