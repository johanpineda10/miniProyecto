import java.util.List;

public class Candidato extends Ciudadano{
    private int ideologia;
    private Partido partido;
    private List<String> promesas;

    public Candidato(String nombre, String cedula, Ciudades ciudadOri, int ideologia, Partido partido,
        List<String> promesas) {
        super(nombre, cedula, ciudadOri);
        this.ideologia = ideologia;
        this.partido = partido;
        this.promesas = promesas;
    }

    public List<String> getPromesas() {
        return promesas;
    }

    public void setPromesas(List<String> promesas) {
        this.promesas = promesas;
    }


    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(int ideologia) {
        this.ideologia = ideologia;
    }

    
    
}
