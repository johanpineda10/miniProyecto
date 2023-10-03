import java.util.List;
import java.util.Scanner;

public class ModificarCandi {
    Scanner sc = new Scanner(System.in);
    private String nombre = "";
    private String cedula;
    private Ciudades ciudad;
    private String ciudadOri;
    private int ideologia=0;
    private PartidoPoli partidos;
    private List<String> promesa;
    private String nombrePar;
    String candidato[][];

    public ModificarCandi(String candidato[][], int fila){
        Candidato candi = new Candidato(nombre, cedula, ciudad, ideologia, partidos, promesa);
        System.out.println("Digite la cedula del candidato: ");
        String cedula = sc.nextLine();
        for(int i=0;i<fila;i++){
            if(candidato[i][0].equals(cedula)){
                System.out.println("Ingrese su nombre completo: ");
                nombre = sc.nextLine();
                candi.setNombre(nombre);
                candidato[i][1] = candi.getNombre();

                System.out.println("Ingrese su ciudad de origen: ");
                ciudadOri = sc.nextLine();
                ciudad = Ciudades.valueOf(ciudadOri.toUpperCase());
                candi.setCiudadOri(ciudad);
                candidato[i][2] = ""+candi.getCiudadOri();

                System.out.println("Ingrese su partido politico: ");
                nombrePar = sc.nextLine();
                partidos = PartidoPoli.valueOf(nombrePar.toUpperCase());
                candi.setPartido(partidos);
                candidato[i][3] = ""+candi.getPartido();

                System.out.println("Ingrese su Ideologia politica: 1. Derecha o 2. Izquierda");
                ideologia = sc.nextInt();
                candi.setIdeologia(ideologia);
                candidato[i][4] = ""+candi.getIdeologia();
            }else{
                System.out.println("Usuario no encontrado");
            }
        }
        this.candidato = candidato;

    }
}
