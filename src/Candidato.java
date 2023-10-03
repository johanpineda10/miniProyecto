import java.util.List;

public class Candidato extends Ciudadano{
    private int ideologia;
    private PartidoPoli partidos;
    private List<String> promesas;

    public Candidato(String nombre, String cedula, Ciudades ciudadOri, int ideologia, PartidoPoli partidos,
        List<String> promesas) {
        super(nombre, cedula, ciudadOri);
        this.ideologia = ideologia;
        this.partidos = partidos;
        this.promesas = promesas;
    }

    public int getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(int ideologia) {
        this.ideologia = ideologia;
    }

    public PartidoPoli getPartido() {
        return partidos;
    }

    public void setPartido(PartidoPoli partidos) {
        this.partidos = partidos;
    }

    public List<String> getPromesas() {
        return promesas;
    }

    public void setPromesas(List<String> promesas) {
        this.promesas = promesas;
    }

    

    
}
