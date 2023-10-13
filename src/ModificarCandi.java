import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Clase para modificar los candidatos si asi lo desean
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
    //Recibe como parametros la matriz candidatos, la fila y el arreglo de las promesas
    public ModificarCandi(String candidato[][], int fila, ArrayList<String> prome){
        Candidato candi = new Candidato(nombre, cedula, ciudad, ideologia, partidos, promesa);

        System.out.println("Digite la cedula del candidato: ");
        String cedula = sc.nextLine();
        boolean cedEncontrada = false;

        for(int i=0;i<fila;i++){
            if(candidato[i][0].equals(cedula)){
                cedEncontrada = true;
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
                //Muestra un recorrido de las propuestas por candidato
                //NOTA: no me aparece solo las propuestas del candidato, me aparecen las de todos los candidatos
                do{
                    int cont =1;
                    System.out.println("Propuestas del candidato");
                    
                    for(String p : prome){
                        System.out.println(cont + ". " + p + " "+ candidato[i][1]);
                        cont++;
                        
                    }
                    //System.out.println(candidato[i][5]);
                    System.out.println("1. Modificar propuesta");
                    System.out.println("0. Salir");
                    opc = sc.nextInt();
                    sc.nextLine(); //Se agrega para consumir una nueva linea y pueda tomar la siguiente
                    //Luego de elegir modificarla se pregunta el numero y la propuesta nueva
                    if(opc ==1){
                        System.out.println("Ingrese el numero de la propuesta a modificar: ");
                        int numPro = sc.nextInt();
                        sc.nextLine();
                        if(numPro >= 1 && numPro <= prome.size()){
                            System.out.println("Ingrese su propuesta nueva: ");
                            propu = sc.nextLine();
                            
                            prome.set(numPro-1, propu);
                            candi.setPromesas(prome);
                            
                        }else{
                            System.out.println("Numero de propuesta no valido");
                        }
                    }
                System.out.println(candidato[i][5]);
                //candidato[i][5] = ""+candi.getPromesas();
                }while(opc!=0);
                candidato[i][5] = String.join("\n", prome);
            }
            if(!cedEncontrada){
                System.out.println("Usuario no encontrado");
            }
        }
        this.candidato = candidato;
        this.promesa = prome;

    }
}
