/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

/**
 *
 * @author Sofia
 */
public class ProfesorTest {
    
    @Test
    public void calculoDePagoCatedra(){
        
         LocalDate fechaNac = LocalDate.of(1997, 3, 12);
        Profesor p = new Profesor("1103748937", "Comunicación", "Ana", "Carrera 83", "3493785649", fechaNac );
        
        p.CalcularSalarioTotal(250000, 4);
        
        assertEquals(1200000, p.getPago(), 0.01);
        assertEquals(204000, p.getPrestaciones(), 0.01);
    }
    
    public void calculoDePagoPlanta(){
        
         LocalDate fechaNac = LocalDate.of(1997, 3, 12);
        Profesor p = new Profesor("1103748937", "Ingeniería", "Carolina", "Carrera 83", "3493785649", fechaNac );
        
        p.CalcularSalarioTotal(15000);
        
        assertEquals(3168000, p.getPago(), 0.01);
        assertEquals(448800, p.getPrestaciones(), 0.01);
    }
    
}
