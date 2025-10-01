/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.rutaescolar.desarrollo.pi.und2.dominio.puertos;

import java.util.List;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.entidades.Conductor;
import co.edu.rutaescolar.desarrollo.pi.und2.dominio.vo.Itinerario;

public interface RepoConductor {

    List<Conductor> disponibles(Itinerario itin);
}
