/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perro;

/**
 *
 * @author NOBLEX
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro uno = new Perro("Fido", "pitbull", 3, "negro", 2000);
        
        
        uno.mostrar();
        
        uno.ladrar(3);
        uno.ladrar('u');
        uno.ladrar(true);
        uno.ladrar(false);
        
        System.out.println("Edad "+ uno.getEdad());
        
    }
    
}
