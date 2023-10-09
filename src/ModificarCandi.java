import java.util.ArrayList;
import java.util.Arrays;
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
    private String nombrePar;
    String candidato[][];
    private int opc=0;
    private String propu;
    ArrayList<String> promesa;

    public ModificarCandi(String candidato[][], int fila, ArrayList<String> prome){
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
                System.out.println(prome.get(i));
                do{
                    int cont =1;
                    System.out.println("Propuestas del candidato");
                    
                    for(String p : prome){
                        System.out.println(cont + ". " + p);
                        cont++;
                        
                    }
                    System.out.println("////////////////////");
                    System.out.println(candidato[i][5]);
                    System.out.println("1. Numero de propuesta a modificar");
                    System.out.println("0. Salir");
                    opc = sc.nextInt();
                    sc.nextLine(); //Se agrega para consumir una nueva linea y pueda tomar la siguiente
                    if(opc ==1){
                        System.out.println("Ingrese su propuesta nueva: ");
                        propu = sc.nextLine();
                        
                        prome.set(opc, propu);
                        candi.setPromesas(prome);
                        
                    }
                }while(opc!=0);
                //candidato[i][5] = ""+candi.getPromesas();
            }else{
                System.out.println("Usuario no encontrado");
            }
        }
        this.candidato = candidato;
        this.promesa = prome;

    }
}
