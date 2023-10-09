import java.util.Scanner;

public class Votos {
    Scanner sc = new Scanner(System.in);
    String candi[][];
    int fila;

    public Votos(String candi[][], int fila){
        int opc = 0;
        do{
            System.out.println("1. Ingresar cantidad de votos");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Conteo final");
            System.out.println("3. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            if(opc == 1){
                System.out.println("Ingrese la cedula del candidato: ");
                String ced = sc.nextLine();
                boolean canEncontrado = false;

                for(int i = 0; i < fila; i++){
                    if(candi[i][0].equals(ced)){
                        System.out.println("Ingrese la cantidad de votos para el candidato "+candi[i][1]);
                        int numVoto = sc.nextInt();
                        candi[i][6] = Integer.toString(numVoto);
                        System.out.println("Cantidad de votos para el candidato "+ candi[i][1]+ " es igual a "+candi[i][6]);
                        canEncontrado = true;
                        break;
                    }
                    if(!canEncontrado){
                        System.out.println("Cedula no encontrada");
                    }
                }
            }else if(opc == 2){
                for(int i = 0; i<fila; i++){
                    System.out.println("--------------------------------");
                    System.out.println("Nombre "+candi[i][1]);
                    System.out.println("Cedula "+ candi[i][0]);
                    System.out.println("Numero de votos "+ candi[i][6]);
                    System.out.println("--------------------------------");
                }
            }else if(opc == 3){
                
                int max = Integer.parseInt(candi[0][6]);
                int ganador =0;
                for(int f = 0; f < fila; f++){
                    int numVotos = Integer.parseInt(candi[f][6]);
                    if(numVotos>max){
                        max = numVotos;
                        ganador=f;
                        
                    }
                }
                System.out.println("El ganador es");
                System.out.println("--------------------------------");
                System.out.println("Nombre: "+candi[ganador][1]);
                System.out.println("Cedula: "+candi[ganador][0]);
                System.out.println("Número de votos: " + max);
                System.out.println("--------------------------------");
                System.out.println("Sus propuestas fueron: "+ candi[ganador][5]); 
                System.out.println("------------------------------------");
                for(int i = 0; i<fila;i++){
                    numCandi(fila, candi);
                }
            }
        }while(opc != 0);
        this.candi = candi;   
    }

    public void numCandi(int fila, String candidato[][]){
        int parU= 0;
        int parCon = 0;
        int parAlia = 0;
        int parLiber = 0;
        int parMira = 0;
        int parDemo = 0;
        int parPacto = 0;
        
        for(int i =0; i<=1;i++){
            if(candidato[i][3].equals("U")){
                parU = parU+1;
            }
            if(candidato[i][3].equals("CONSERVADOR")){
                parCon = parCon+1;
            }
            if(candidato[i][3].equals("ALIANZAVERDE")){
                parAlia = parAlia+1;
            }
            if(candidato[i][3].equals("LIBERAL")){
                parLiber = parLiber+1;
            }
            if(candidato[i][3].equals("MIRA")){
                parMira = parMira+1;
            }
            if(candidato[i][3].equals("DEMOCRATICO")){
                parDemo = parDemo+1;
            }
            if(candidato[i][3].equals("PACTOHISTORICO")){
                parPacto = parPacto+1;
            }

        }
        System.out.println(parU);
        System.out.println(parCon);
        System.out.println(parAlia);
    }

}



