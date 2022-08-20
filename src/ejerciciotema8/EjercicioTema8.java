/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema8;

/**
 *
 * @author MANUEL RIVAS GAUNA
 */
public class EjercicioTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona miPersona;
        
        miPersona = new Persona();
        
        miPersona.setEdad(25);
        miPersona.setNombre("Manuel");
        miPersona.setTelefono("15552220");
        
        System.out.println("Nombre: " + miPersona.getNombre());
        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Telefono: " + miPersona.getTelefono());
    }
    
}
