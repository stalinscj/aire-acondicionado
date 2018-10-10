
package TDA;


public class Compresor {
    private String tipo;
    private String marca; 
    private String BTU; 
    private String color;
    private String velocidad;
    
    
    public Compresor(){
        this.tipo = "";
        this.marca = "";
        this.BTU = "";
        this.color = "";
        this.velocidad = "";
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getBTU() {
        return BTU;
    }

    
    public void setBTU(String BTU) {
        this.BTU = BTU;
    }

    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    
    public String getVelocidad() {
        return velocidad;
    }

    
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

}
