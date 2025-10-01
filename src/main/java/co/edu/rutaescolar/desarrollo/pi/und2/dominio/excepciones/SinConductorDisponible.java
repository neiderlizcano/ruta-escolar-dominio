/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.dominio.excepciones;

public final class SinConductorDisponible extends RuntimeException {

    public SinConductorDisponible() {
        super("No hay conductor disponible");
    }
}
