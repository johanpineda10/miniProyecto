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
                for(int i = 0; i < fila; i++){
                    if(candi[i][0].equals(ced)){
                        System.out.println("Ingrese la cantidad de votos para el candidato "+candi[i][1]);
                        int numVoto = sc.nextInt();
                        candi[i][6] = Integer.toString(numVoto);
                        System.out.println(candi[i][6]);
                                
                    }else{
                        System.out.println("Cedula no encontrada");
                    }
                }
            }else if(opc == 2){
                for(int i = 0; i<fila; i++){
                    System.out.println("--------------------------------");
                    System.out.println("Nombre "+candi[i][0]);
                    System.out.println("Cedula "+ candi[i][1]);
                    System.out.println("Numero de votos "+ candi[i][6]);
                    System.out.println("--------------------------------");
                }
            }else if(opc == 3){
                int max = Integer.parseInt(candi[0][6]);
                for(int f = 0; f < fila; f++){
                    if(Integer.parseInt(candi[f][6]) > max){
                        System.out.println("El ganador es");
                        System.out.println("--------------------------------");
                        System.out.println("Nombre: "+candi[f][1]);
                        System.out.println("Cedula: "+candi[f][0]);
                        System.out.println("--------------------------------");
                        System.out.println("Sus propuestas fueron: "+ candi[f][5]); 
                    }
                    
                }
            }
        }while(opc != 0);
        this.candi = candi;   
    }
}



