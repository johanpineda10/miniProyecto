import java.util.ArrayList;
import java.util.List;

public class Candidato extends Ciudadano{
    private int ideologia;
    private PartidoPoli partidos;
    private ArrayList<String> promesas;
    //Clase candidato hija de Ciudadano con los metodos getter y setter y los demas metodos de la clase padre
    public Candidato(String nombre, String cedula, Ciudades ciudadOri, int ideologia, PartidoPoli partidos,
        ArrayList<String> promesas) {
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
    
    public ArrayList<String> getPromesas() {
        return promesas;
    }

    public void setPromesas(ArrayList<String> promesas) {
        this.promesas = promesas;
    }

   

    

    
}
