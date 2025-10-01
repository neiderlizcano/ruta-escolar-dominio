/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.exceptions;

public final class SinBusDisponible extends RuntimeException {

    public SinBusDisponible() {
        super("No hay bus disponible con capacidad suficiente");
    }
}
