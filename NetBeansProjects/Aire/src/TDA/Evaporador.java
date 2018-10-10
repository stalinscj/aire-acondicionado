

package TDA;


public class Evaporador {
    private String tipo;
    private String marca;
    private String modelo;
    private String BTU;
    
    public Evaporador() {
        this.tipo = "";
        this.marca = "";
        this.modelo = "";
        this.BTU = "";
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
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBTU() {
        return BTU;
    }

    public void setBTU(String BTU) {
        this.BTU = BTU;
    }
}
