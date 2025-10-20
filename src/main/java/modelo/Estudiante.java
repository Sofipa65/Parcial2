/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Sofia
 */
public class Estudiante extends Persona{

    public Estudiante(String nombre, String direccion, double telefono, LocalDate fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Estudiante:" + nombre + "  |Dirección: "+ direccion + "  |Teléfono: " + telefono + "  |Fecha de nacimiento: " +fechaNacimiento+ "\n" ;
    }

    
}
