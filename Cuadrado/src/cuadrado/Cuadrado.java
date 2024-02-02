
package cuadrado;


public class Cuadrado {
    private int lado;
    
    public Cuadrado(int x){
        this.lado = x;
    }
    
    public int perimetro(){
        return this.lado * 4;
    }
    
}
