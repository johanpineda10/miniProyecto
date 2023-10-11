import java.util.ArrayList;
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
    ArrayList<String> promesa = new ArrayList<>();
    private String nombrePar;
    private int opc=0;
    private String propu;

    String candidato[][];

    public Adicionar(String candidato[][], int fila, ArrayList<String> prome) {
        
        Candidato candi = new Candidato(nombre, cedula, ciudad, ideologia, partidos, promesa);
        
            System.out.println("Ingrese su nombre completo: ");
            nombre = sc.nextLine();
            candi.setNombre(nombre);
            candidato[fila][1] = candi.getNombre();

            System.out.println("Ingrese su numero de cedula: ");
            cedula = sc.nextLine();
            for(int i = 0; i<fila;i++){
                System.out.println(candidato[i][0]);
                System.out.println(cedula);
                System.out.println(cedula.equals(candidato[i][0]));
                if(candidato[i][0].equals(cedula)){
                    System.out.println("Cedula ya registrada");
                }else{
                    candi.setCedula(cedula);
                    candidato[fila][0] = candi.getCedula();
                }
            }
            

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

            do{
                System.out.println("1. Agregar propuesta");
                System.out.println("0. Salir");
                opc = sc.nextInt();
                sc.nextLine(); //Se agrega para consumir una nueva linea y pueda tomar la siguiente
                if(opc ==1){
                    System.out.println("Ingrese su propuesta: ");
                    propu = sc.nextLine();
                    prome.add(propu);
                    candi.setPromesas(prome);
                }

            }while(opc!=0);
            
            candidato[fila][5] = ""+candi.getPromesas();
            System.out.println(candi.getPromesas());
            this.candidato = candidato;
            this.promesa = prome;
    } 
}
