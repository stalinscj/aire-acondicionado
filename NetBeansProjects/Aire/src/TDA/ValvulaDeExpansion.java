

package TDA;


public class ValvulaDeExpansion {
    private String tipo;
    private String marca;
    private String modelo;
    private String TRF;

    public ValvulaDeExpansion() {
        this.tipo = "";
        this.marca = "";
        this.modelo = "";
        this.TRF = "";
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

    public String getTRF() {
        return TRF;
    }

    public void setTRF(String TRF) {
        this.TRF = TRF;
    }
}
