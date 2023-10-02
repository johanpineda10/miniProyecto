public class Candidato extends Ciudadano{
    private int tendencia;
    private Partido partido;
    private String promesas;

    public Candidato(String nombre, String cedula, Ciudades ciudadOri, int tendencia, Partido partido,
        String promesas) {
        super(nombre, cedula, ciudadOri);
        this.tendencia = tendencia;
        this.partido = partido;
        this.promesas = promesas;
    }

    public int getTendencia() {
        return tendencia;
    }

    public void setTendencia(int tendencia) {
        this.tendencia = tendencia;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getPromesas() {
        return promesas;
    }

    public void setPromesas(String promesas) {
        this.promesas = promesas;
    }
    
    
    
}
