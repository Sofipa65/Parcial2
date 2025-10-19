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
public class Profesor extends Persona {
    
    private int cedula;
    private String areaTrabajo;
    private double pago;
    
    
    public Profesor (int cedula, String areaTrabajo, double pago, String nombre, String direccion, int telefono, LocalDate fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.areaTrabajo = areaTrabajo;
        this.pago = pago;
    }
    
}
