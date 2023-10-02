import java.util.List;

public class Candidato extends Ciudadano{
    private int tendencia;
    private Partido partido;
    private List<String> promesas;

    public Candidato(String nombre, String cedula, Ciudades ciudadOri, int tendencia, Partido partido,
        List<String> promesas) {
        super(nombre, cedula, ciudadOri);
        this.tendencia = tendencia;
        this.partido = partido;
        this.promesas = promesas;
    }

    public List<String> getPromesas() {
        return promesas;
    }

    public void setPromesas(List<String> promesas) {
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

    
    
}
