package cuenta;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cant) {
        this.titular = titular;
        this.cantidad = cant;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String toString() {

        return ("Titular: " + this.titular + ", Cantidad: " + this.cantidad);

    }

    public void ingresar(double X) {
        if (X > 0) {
            this.cantidad = this.cantidad + X;
        }
    }

    public void retirar(double X) {
        if ((this.cantidad - X) < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = this.cantidad - X;
        }
    }

    public void mostrar() {
        System.out.println(toString());
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public static void main(String[] args){
        Cuenta uno = new Cuenta("Brian", 1000);
        
        uno.mostrar();
        uno.ingresar(2000);
        uno.mostrar();
        uno.retirar(1234);
        uno.mostrar();
    }
}
