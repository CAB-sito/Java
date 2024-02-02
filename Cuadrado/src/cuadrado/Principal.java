package cuadrado;

public class Principal {

    public static void main(String[] args) {
        Cuadrado UNO = new Cuadrado(4);
        Cuadrado DOS = new Cuadrado(20);
        Cuadrado TRES = new Cuadrado(11);

        System.out.println("UNO: " + UNO.perimetro());
        System.out.println("DOS: " + DOS.perimetro());
        System.out.println("TRES: " + TRES.perimetro());
        
   
    }

}
