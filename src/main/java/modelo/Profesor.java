/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Sofia
 */
public class Profesor extends Persona {
    
    private double cedula;
    private String areaTrabajo;
    private double pago;
    private double prestaciones;
    
    
    public Profesor (double cedula, String areaTrabajo, String nombre, String direccion, double telefono, LocalDate fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.areaTrabajo = areaTrabajo;
    }

    public double getCedula() {
        return cedula;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public double getPago() {
        return pago;
    }

    public double getPrestaciones() {
        return prestaciones;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + " |Cédula: " + cedula + "  |Área de trabajo: " + areaTrabajo + "  |Salario total: " + pago + "  |Prestaciones: " + prestaciones + "\n" + 
               "  |Dirección: "+ direccion + "  |Teléfono: " + telefono + "  |Fecha de nacimiento: " +fechaNacimiento+ "\n";
    }

    public void CalcularSalarioTotal(double salarioHora, int horasDictadas ){
        
        pago= salarioHora * horasDictadas;
        
        pago += pago*0.20 ;
   
        prestaciones= pago*0.17 ;   
    }
    
    public void CalcularSalarioTotal(double salarioHora){
        
        pago= salarioHora * 176;
        
        pago += pago*0.20 ;
   
        prestaciones= pago*0.17 ;   
    }
}
