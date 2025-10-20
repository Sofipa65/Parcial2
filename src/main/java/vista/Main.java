/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

/**
 *
 * @author Sofia
 */
public class Main {

        
    public static void main(String[] args) {
        
        Vista v= new Vista();
        
        int opcion; 
        do {
            opcion = v.mostrarMenu();

            switch (opcion) {
                case 1 -> v.AgregarEstudiante();
                case 2 -> v.AgregarProfesor();
                case 3 -> v.mostrarEstudiantes();
                case 4 -> v.mostrarProfesores();
                case 5 -> {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }        
        }while(opcion !=5);            
    }       
}

