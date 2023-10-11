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
            System.out.println("0. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            if(opc == 1){
                System.out.println("Ingrese la cedula del candidato: ");
                String ced = sc.nextLine();
                boolean canEncontrado = false;

                for(int i = 0; i < fila; i++){
                    if(candi[i][0].equals(ced)){
                        canEncontrado = true;
                        System.out.println("Ingrese la cantidad de votos para el candidato "+candi[i][1]);
                        int numVoto = sc.nextInt();
                        candi[i][6] = Integer.toString(numVoto);
                        System.out.println("Cantidad de votos para el candidato "+ candi[i][1]+ " es igual a "+candi[i][6]);
                        
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
                        System.out.println(f);
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
                
                numCandi(fila, candi);
                
            }
        }while(opc != 0);
        this.candi = candi;   
    }

    public void numCandi(int fila, String candidato[][]){
        int maxCandidatos = 0;
        String partidoMax = "";
        int parU= 0;
        int parCon = 0;
        int parAlia = 0;
        int parLiber = 0;
        int parMira = 0;
        int parDemo = 0;
        int parPacto = 0;
        
        for(int i =0; i<=fila;i++){
            String partido = candidato[i][3];
            switch(partido){
                case "U":
                    parU++;
                    break;
                case "CONSERVADOR":
                    parCon++;
                    break;
                case "ALIANZAVERDE":
                    parAlia++;
                    break;
                case "LIBERAL":
                    parLiber++;
                    break;
                case "MIRA":
                    parMira++;
                    break;
                case "DEMOCRATICO":
                    parDemo++;
                    break;
                case "PACTOHISTORICO":
                    parPacto++;
                    break;

            }
        }
        if(parU > maxCandidatos){
            maxCandidatos = parU;
            partidoMax = "U";
        }
        if(parCon > maxCandidatos){
            maxCandidatos = parCon;
            partidoMax = "CONSERVADOR";
        }
        if(parAlia > maxCandidatos){
            maxCandidatos = parAlia;
            partidoMax = "ALIANZAVERDE";
        }
        if(parLiber > maxCandidatos){
            maxCandidatos = parLiber;
            partidoMax = "LIBERAL";
        }
        if(parMira > maxCandidatos){
            maxCandidatos = parMira;
            partidoMax = "MIRA";
        }
        if(parDemo >maxCandidatos){
            maxCandidatos = parDemo;
            partidoMax = "DEMOCRATICO";
        }
        if(parPacto > maxCandidatos){
            maxCandidatos = parPacto;
            partidoMax = "PACTOHISTORICO";
        }
        System.out.println("El partido con mas candidatos es "+partidoMax);
        
    }

}



