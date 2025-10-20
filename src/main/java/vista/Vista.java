/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Estudiante;
import modelo.Profesor;

/**
 *
 * @author Sofia
 */
public class Vista {
    
    static ArrayList<Profesor> profesores= new ArrayList<>();
    static ArrayList<Estudiante> estudiantes= new ArrayList<>();
    
    public int mostrarMenu() {
        String menu = """
        MENÚ
        1. Ingresar estudiante
        2. Ingresar profesor  
        3. Listar estudiantes
        4. Listar profesores
        5. Salir
        """;
        String opcion = JOptionPane.showInputDialog(menu + "\nSeleccione una opción:");
        return Integer.parseInt(opcion);
    }
    
    
    public void AgregarProfesor(){
        
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        String areaTrabajo= JOptionPane.showInputDialog("Ingrese el area de trabajo del profesor: ");
        String direccion= JOptionPane.showInputDialog("Ingrese la dirección del profesor: ");
        double cedula= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de cédula: "));
        double telefono= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el teléfono del profesor: "));
        LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (AAAA-MM-DD): "));

        Profesor profesor= new Profesor(cedula, areaTrabajo, nombre, direccion, telefono, fechaNacimiento);
        
        int tipo= Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Seleccione la modalidad de contratación del profesor 
                                                                1. Hora cátedra  2. Tiempo completo"""));
        
         switch (tipo) {
             case 1 -> {
                     double salarioHora= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora: "));
                     int horas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas dictadas por el profesor: "));
                     profesor.CalcularSalarioTotal(salarioHora, horas);
                 }
             case 2 -> {
                     double salarioHora= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora: "));
                     profesor.CalcularSalarioTotal(salarioHora);
                 }
             default -> JOptionPane.showMessageDialog(null, "Opción inválida");
         }
        
        profesores.add(profesor);
        
    }
    
    public void AgregarEstudiante(){
        
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        String direccion= JOptionPane.showInputDialog("Ingrese la dirección del profesor: ");
        double telefono= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el teléfono del profesor: "));
        LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (AAAA-MM-DD): "));
        
        Estudiante estudiante= new Estudiante(nombre, direccion, telefono, fechaNacimiento);
        
        estudiantes.add(estudiante);    
    }
    
    public static void mostrarEstudiantes() {

        String lista = "Estudiantes:\n";
        lista += estudiantes.toString();
        JOptionPane.showMessageDialog(null, lista);
    }
    
    public static void ordenarProfesores(){
        
        for (int i = 0; i < profesores.size()-1; i++) {
            for (int j = 0; j < profesores.size()- i - 1; j++) {
            
                if (profesores.get(j).getPago()> profesores.get(j+1).getPago()){

                    Profesor puestotemporal = profesores.get(j);
                    profesores.set(j, profesores.get(j + 1));
                    profesores.set(j + 1, puestotemporal);
                }
            }
        }
    }
    
    
    public static void mostrarProfesores() {

        String lista = "Profesores:\n";
        ordenarProfesores();
        lista += profesores.toString();
        JOptionPane.showMessageDialog(null, lista);
    }

}
