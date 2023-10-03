import java.util.List;
import java.util.Scanner;

public class Adicionar {

    Scanner sc = new Scanner(System.in);
    private String nombre = "";
    private String cedula = "";
    private Ciudades ciudad;
    private String ciudadOri;
    private int ideologia=0;
    private Partido partido;
    private String partidoPoli;
    private List<String> promesa;
    private String[] guardar = new String[10];



    public Adicionar() {
        Candidato candi = new Candidato(nombre, cedula, ciudad, ideologia, partido, promesa);
        
        System.out.println("Ingrese su nombre completo: ");
        nombre = sc.nextLine();
        candi.setNombre(nombre);

        System.out.println("Ingrese su numero de cedula: ");
        cedula = sc.nextLine();
        candi.setCedula(cedula);

        System.out.println("Ingrese su ciudad de origen: ");
        ciudadOri = sc.nextLine();
        ciudad = Ciudades.valueOf(ciudadOri.toUpperCase());
        candi.setCiudadOri(ciudad);

        System.out.println("Ingrese su Ideologia politica: 1. Derecha o 2. Izquierda");
        ideologia = sc.nextInt();
        candi.setIdeologia(ideologia);

        System.out.println("Ingrese su partido politico: ");
        partidoPoli = sc.nextLine();
        partido = Partido.valueOf(partidoPoli.toUpperCase());
        candi.setPartido(partido);

        for(int i = 0; i <= guardar.length; i++){
            guardar[i] = candi.getNombre()+""+candi.getCedula();
            System.out.println(guardar[i]);
        }
        
        /*System.out.println(candi.getNombre());
        System.out.println(candi.getCedula());
        System.out.println(candi.getCiudadOri());
        System.out.println(candi.getIdeologia());*/

    }

    
    

    
}
