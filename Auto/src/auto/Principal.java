
package auto;


public class Principal {

   
    public static void main(String[] args) {
        Auto UNO = new Auto(2018, 899500, "Fiat", "Rojo");
        Auto DOS = new Auto(2015, 675000, "Chebrolet", "Gris");
        
        UNO.mostrar();
        System.out.println("Antiguedad auto 1: "+ UNO.antiguedad());
        
        DOS.mostrar();
        System.out.println("Antiguedad auto 2: "+ DOS.antiguedad());
        
        
        
        
        
        
    }
    
}
