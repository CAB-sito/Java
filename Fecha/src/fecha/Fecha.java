package fecha;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(boolean X) {
        if (X) {
            Scanner lector = new Scanner(System.in);
            System.out.println("Ingrese la Fecha");
            System.out.println("Dia");
            this.dia = lector.nextInt();
            System.out.println("Mes");
            this.mes = lector.nextInt();
            System.out.println("Anio");
            this.anio = lector.nextInt();
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2000;
        }
    }
    
    public boolean veryFecha(){
        boolean X;
        if(veryDia() && veryMes() && veryAnio()){
            X = true;
        }else{
            X = false;
        }
        return X;
    }
    
    public boolean varyBisiesto(){
        boolean X;
        if(this.anio % 4 == 0){
            X = true;
        }else{
            X = false;
        }
        return X;
    }
    
    
    public boolean  veryDia(){
        boolean X;
        if(this.dia >= 1 && this.dia <= 31){
            X = true;
        }else{
            X = false;
        }
        return X;
    }
    
     public boolean  veryMes(){
        boolean X;
        if(this.mes >= 1 && this.mes <= 12){
            X = true;
        }else{
            X = false;
        }
        return X;
    }
     
      public boolean  veryAnio(){
        boolean X;
        if(this.anio >= 1 && this.anio <= 2024){
            X = true;
        }else{
            X = false;
        }
        return X;
    }
    
    public void mostrar(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
    }
    

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    
}
