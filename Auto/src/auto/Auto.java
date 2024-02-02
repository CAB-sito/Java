package auto;

public class Auto {

    private int mod;
    private String color;
    private int precio;
    private String marca;

    public Auto(int mod, int pre, String marca, String color) {
        this.mod = mod;
        this.precio = pre;
        this.marca = marca;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Modelo: " + this.mod);
        System.out.println("Color: " + this.color);
        System.out.println("Precio: " + this.precio);
        System.out.println("Marca: " + this.marca);

    }

    public int antiguedad() {
        return 2024 - this.mod;
    }

    /**
     * @return the mod
     */
    public int getMod() {
        return mod;
    }

    /**
     * @param mod the mod to set
     */
    public void setMod(int mod) {
        this.mod = mod;
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
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
