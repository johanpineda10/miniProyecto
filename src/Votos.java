import java.util.Scanner;

public class Votos {
    //Clase que recibe como parametros a la matriz y la fila
    
    Scanner sc = new Scanner(System.in);
    String candi[][];
    int fila;

    public Votos(String candi[][], int fila){
        int opc = 0;
        //Creacion de menu de votos, conteo, cantidad, resultados
        do{
            System.out.println("1. Ingresar cantidad de votos");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Conteo final");
            System.out.println("0. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            if(opc == 1){
                //Ingresa la cedula e ingresa la cantidad de votos que obtuvo, esta se almacena en una nueva posicion de la matriz
                System.out.println("Ingrese la cedula del candidato: ");
                String ced = sc.nextLine();
                boolean canEncontrado = false;
                //Busca el usuario y si es encontrado se coloca la cantidad de votos
                for(int i = 0; i < fila; i++){
                    if(candi[i][0].equals(ced)){
                        canEncontrado = true;
                        System.out.println("Ingrese la cantidad de votos para el candidato "+candi[i][1]);
                        int numVoto = sc.nextInt();
                        candi[i][6] = Integer.toString(numVoto); //Se almacena en una nueva posicion convertida a un string
                        System.out.println("Cantidad de votos para el candidato "+ candi[i][1]+ " es igual a "+candi[i][6]);
                        
                        break;
                    }
                    if(!canEncontrado){
                        System.out.println("Cedula no encontrada");
                    }
                }
                //Muestra los resultados de todos los candidatos
            }else if(opc == 2){
                for(int i = 0; i<fila; i++){
                    System.out.println("--------------------------------");
                    System.out.println("Nombre "+candi[i][1]);
                    System.out.println("Cedula "+ candi[i][0]);
                    System.out.println("Numero de votos "+ candi[i][6]);
                    System.out.println("--------------------------------");
                }
                
            }else if(opc == 3){ //Muestra el conteo y el ganador de la candidatura
                //se toma una variable que inicie en 0, para ir comparando los resultados a ver cual es mayor
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
                //Se muestra por pantalla el resultado con el ganador
                System.out.println("El ganador es");
                System.out.println("--------------------------------");
                System.out.println("Nombre: "+candi[ganador][1]);
                System.out.println("Cedula: "+candi[ganador][0]);
                System.out.println("Número de votos: " + max);
                System.out.println("--------------------------------");
                System.out.println("Sus propuestas fueron: "+ candi[ganador][5]); //Me muestra la informacion de todas las propuestas no solo de un candidato
                System.out.println("------------------------------------");
                
                String partidoG = numCandi(fila, candi);//Llamada al metodo
                System.out.println("El partido con mas candidatos es: "+partidoG);
            }
        }while(opc != 0);
        this.candi = candi;   
    }

    public String numCandi(int fila, String candidato[][]){
        //Recibe la matriz y la fila para asi recorrer todos los partitos, cada que encuentra uno igual, se suma a su variable hasta contarlos todos
        //Luego de esto verifica cual es el partido con mas candidatos, comparando mediante una variable incializada en 0
        int maxCandidatos = 0;
        String partidoMax = "";
        int parU= 0;
        int parCon = 0;
        int parAlia = 0;
        int parLiber = 0;
        int parMira = 0;
        int parDemo = 0;
        int parPacto = 0;
        
        for(int i =0; i<fila;i++){
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
        return partidoMax;
        
    }

}



