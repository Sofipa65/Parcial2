/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vista;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import modelo.Profesor;

/**
 *
 * @author Sofia
 */
public class VistaTest {
    
    @Test
    public void testOrdenarProfesores() {
        
        Profesor p1 = new Profesor("1", "Ingeniería", "Ana", "Calle 10", "3001234567", LocalDate.of(1980,5,10));
        Profesor p2 = new Profesor("2", "Física", "Luis", "Calle 20", "3109876543", LocalDate.of(1985,6,15));
        Profesor p3 = new Profesor("3", "Arquitectura", "Laura", "Calle 30", "3205555555", LocalDate.of(1990,7,12));

        p1.CalcularSalarioTotal(20000, 5);  
        p2.CalcularSalarioTotal(20000, 10); 
        p3.CalcularSalarioTotal(20000, 3);  

        Vista.profesores.add(p1);
        Vista.profesores.add(p2);
        Vista.profesores.add(p3);

        Vista.ordenarProfesores();

        assertEquals(p3, Vista.profesores.get(0));
        assertEquals(p1, Vista.profesores.get(1)); 
        assertEquals(p2, Vista.profesores.get(2)); 
    }   
}
