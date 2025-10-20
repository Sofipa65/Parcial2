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
import modelo.Estudiante;
import modelo.Profesor;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class MainIT {
    
    @Test
    void testAgregarProfesorYCalcularPago() {
        
        Profesor p1 = new Profesor("1203482938", "Matemáticas", "Ana", "Calle 10", "37890765478", LocalDate.of(1980, 10, 01));
        p1.CalcularSalarioTotal(50000, 10); 
        Vista.profesores.add(p1);

        Profesor p2 = new Profesor("1203482938", "Física", "Carlos", "Carrera 83", "3202754890", LocalDate.of(2000, 05, 15));
        p2.CalcularSalarioTotal(40000); 
        Vista.profesores.add(p2);

        assertEquals(2, Vista.profesores.size());

        assertTrue(p1.getPago() > 0);
        assertTrue(p1.getPrestaciones() > 0);

        Vista.ordenarProfesores();
        assertTrue(Vista.profesores.get(0).getPago() <= Vista.profesores.get(1).getPago());
    }
}
