package perro;

public class Perro {

    private String nom;
    private String raza;
    private float peso;
    private String color;
    private int aNac;

    public Perro(String nom, String raza, float peso, String color, int aNac) {
        this.nom = nom;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
        this.aNac = aNac;
    }

    public void ladrar(int X) {
        for (int i = 0; i < X; i++) {
            System.out.print("woof ");
        }
        System.out.println("");
    }

    public void ladrar(char X) {
        System.out.println(" Roa" + X + "r" + " Roa" + X + "r ");
    }

    public void ladrar(boolean X) {
        if(X){
            System.out.println("Roar roar");
        }else{
            System.out.println(".....");
        }
    }
    
    public int getEdad(){
        return 2024 - this.aNac;
    }
    
    
    public String toString(){
        return "El perro se llama " + this.nom + ", de raza " + this.raza + ", color "+ this.color + ", su peso es de "+ this.peso+ "Kg y tiene "+ this.getEdad()+ " anios de edad";
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the aNac
     */
    public int getaNac() {
        return aNac;
    }

    /**
     * @param aNac the aNac to set
     */
    public void setaNac(int aNac) {
        this.aNac = aNac;
    }
    
}

