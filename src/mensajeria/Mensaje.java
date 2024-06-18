/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensajeria;

import java.time.LocalDateTime;

public class Mensaje {
    private String contenido;
    private String remitente;
    private LocalDateTime fecha;

    public Mensaje(String contenido, String remitente) {
        this.contenido = contenido;
        this.remitente = remitente;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + fecha.toString() + "] " + remitente + ": " + contenido;
    }
}