/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.application.ports.out;

import java.util.List;
import co.edu.udec.rutaescolar.domain.model.Conductor;
import co.edu.udec.rutaescolar.domain.valueobjects.Itinerario;

public interface RepoConductor {

    List<Conductor> disponibles(Itinerario itin);
}
