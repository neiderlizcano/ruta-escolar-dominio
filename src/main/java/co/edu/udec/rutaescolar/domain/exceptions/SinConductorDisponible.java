/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.exceptions;

public final class SinConductorDisponible extends RuntimeException {

    public SinConductorDisponible() {
        super("No hay conductor disponible");
    }
}
