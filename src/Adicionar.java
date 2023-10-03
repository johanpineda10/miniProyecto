import java.util.List;
import java.util.Scanner;

public class Adicionar {

    Scanner sc = new Scanner(System.in);
    private String nombre = "";
    private String cedula = "";
    private Ciudades ciudad;
    private String ciudadOri;
    private int ideologia=0;
    private PartidoPoli partidos;
    private List<String> promesa;
    private String nombrePar;

    String candidato[][];
    public Adicionar(String candidato[][], int fila) {
        Candidato candi = new Candidato(nombre, cedula, ciudad, ideologia, partidos, promesa);
        
            System.out.println("Ingrese su nombre completo: ");
            nombre = sc.nextLine();
            candi.setNombre(nombre);
            candidato[fila][1] = candi.getNombre();

            System.out.println("Ingrese su numero de cedula: ");
            cedula = sc.nextLine();
            candi.setCedula(cedula);
            candidato[fila][0] = candi.getCedula();

            System.out.println("Ingrese su ciudad de origen: ");
            ciudadOri = sc.nextLine();
            ciudad = Ciudades.valueOf(ciudadOri.toUpperCase());
            candi.setCiudadOri(ciudad);
            candidato[fila][2] = ""+candi.getCiudadOri();

            System.out.println("Ingrese su partido politico: ");
            nombrePar = sc.nextLine();
            partidos = PartidoPoli.valueOf(nombrePar.toUpperCase());
            candi.setPartido(partidos);
            candidato[fila][3] = ""+candi.getPartido();

            System.out.println("Ingrese su Ideologia politica: 1. Derecha o 2. Izquierda");
            ideologia = sc.nextInt();
            candi.setIdeologia(ideologia);
            candidato[fila][4] = ""+candi.getIdeologia();


            this.candidato = candidato;

        
        System.out.println(candi.getNombre());
        System.out.println(candi.getCedula());
        System.out.println(candi.getCiudadOri());
        System.out.println(candi.getIdeologia());
        System.out.println(candi.getPartido());
    }

    
    

    
}
