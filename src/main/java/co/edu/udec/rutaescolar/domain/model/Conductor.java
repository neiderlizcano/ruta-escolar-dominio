/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.rutaescolar.domain.model;

public final class Conductor {

    private final String id;
    private String nombre;
    private String apellido;

    public Conductor(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id de conductor inválido");
        }
        this.id = id;
    }

    public String id() {
        return id;
    }
}
