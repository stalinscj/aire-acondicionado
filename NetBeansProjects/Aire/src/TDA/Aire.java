

package TDA;


public class Aire {
    
    private String tipo;
    private String placaBase;
    private Compresor compresor;
    private Condensador condensador;
    private ValvulaDeExpansion valvulaDeExpansion;
    private Evaporador evaporador;
    private Refrigerante refrigerante;
    private ControlRemoto controlRemoto;
    private String carcasa;
    private String componentesPropios;

    public Aire(String tipo) {
        this.tipo = tipo;
        
        switch(tipo){
            case "Split":{
                this.componentesPropios = "Filtro de aire, Ventilador de refrigeracion, Tuberia de desague, Rejilla";
                this.placaBase = "PlacaSplit";
                this.carcasa = "CarcasaSplit";
            
            }break;
                
            case "Ventana":{
                this.componentesPropios = "Tubo capilar, Sistema de ventilacion, Motor del ventilador";
                this.placaBase = "PlacaVentana";
                this.carcasa = "CarcasaVentana";
            }break;
                
            case "Automotriz":{
                this.componentesPropios = "Filtro secador";
                this.placaBase = "PlacaAutomotriz";
                this.carcasa = "CarcasaAutomotriz";
            }break;
            
            default:{
            
            }break;             
        }
        
        this.compresor = new Compresor ();
        this.condensador = new Condensador();
        this.valvulaDeExpansion = new ValvulaDeExpansion();
        this.evaporador = new Evaporador ();
        this.refrigerante = new Refrigerante();
        this.controlRemoto = new ControlRemoto ();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }

    public Compresor getCompresor() {
        return compresor;
    }

    public void setCompresor(Compresor compresor) {
        this.compresor = compresor;
    }

    public Condensador getCondensador() {
        return condensador;
    }

    public void setCondensador(Condensador condensador) {
        this.condensador = condensador;
    }

    public ValvulaDeExpansion getValvulaDeExpansion() {
        return valvulaDeExpansion;
    }

    public void setValvulaDeExpansion(ValvulaDeExpansion valvulaDeExpansion) {
        this.valvulaDeExpansion = valvulaDeExpansion;
    }

    public Evaporador getEvaporador() {
        return evaporador;
    }

    public void setEvaporador(Evaporador evaporador) {
        this.evaporador = evaporador;
    }

    public Refrigerante getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(Refrigerante refrigerante) {
        this.refrigerante = refrigerante;
    }

    public ControlRemoto getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(ControlRemoto controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public String getCarcasa() {
        return carcasa;
    }

    public void setCarcasa(String carcasa) {
        this.carcasa = carcasa;
    }

    public String getComponentesPropios() {
        return componentesPropios;
    }

    public void setComponentesPropios(String componentesPropios) {
        this.componentesPropios = componentesPropios;
    }
}
