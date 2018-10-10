

package TDA;


public class ControlRemoto {
    private String marca;
    private String color;
    private String cantidadDeCodigos;

    public ControlRemoto() {
        this.marca = "";
        this.color = "";
        this.cantidadDeCodigos = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidadDeCodigos() {
        return cantidadDeCodigos;
    }

    public void setCantidadDeCodigos(String cantidadDeCodigos) {
        this.cantidadDeCodigos = cantidadDeCodigos;
    }
}
