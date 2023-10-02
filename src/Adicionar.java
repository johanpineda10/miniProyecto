import java.util.List;
import java.util.Scanner;

public class Adicionar {

    Scanner sc = new Scanner(System.in);
    String nombre, cedula;
    Ciudades ciudad;
    int tendencia;
    Partido partido;
    List<String> promesa;


    public Adicionar(String nombre, String cedula, Ciudades ciudad, int tendencia, Partido partido,
            List<String> promesa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.tendencia = tendencia;
        this.partido = partido;
        this.promesa = promesa;

        Candidato candi = new Candidato(nombre, cedula, ciudad, tendencia, partido, promesa);
        
        candi.setNombre(nombre);
        candi.setCedula(cedula);
        candi.setCiudadOri(ciudad);
        candi.setTendencia(tendencia);
        candi.setPartido(partido);
    }

    
    

    
}
