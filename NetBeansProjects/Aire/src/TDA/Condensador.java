

package TDA;


public class Condensador {
    private String tipo;
    private String marca;
    private String vatios;
    private String BTU;
    private String hertz;
    
    public Condensador() {
        this.tipo = "";
        this.marca = "";
        this.vatios = "";
        this.BTU = "";
        this.hertz = "";
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

    public String getVatios() {
        return vatios;
    }

    public void setVatios(String vatios) {
        this.vatios = vatios;
    }

    public String getBTU() {
        return BTU;
    }

    public void setBTU(String BTU) {
        this.BTU = BTU;
    }

    public String getHertz() {
        return hertz;
    }

    public void setHertz(String hertz) {
        this.hertz = hertz;
    }
}
