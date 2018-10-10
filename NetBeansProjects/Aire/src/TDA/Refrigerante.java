

package TDA;


public class Refrigerante {
    private String codigo;
    private String kilogramos;
    private String recargabilidad;

    public Refrigerante() {
        this.codigo = "";
        this.kilogramos = "";
        this.recargabilidad = "";
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(String kilogramos) {
        this.kilogramos = kilogramos;
    }
    
    public String getRecargabilidad() {
        return recargabilidad;
    }

    public void setRecargabilidad(String recargabilidad) {
        this.recargabilidad = recargabilidad;
    }
}
