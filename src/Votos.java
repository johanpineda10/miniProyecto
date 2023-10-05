import java.util.Scanner;

public class Votos {
    Scanner sc = new Scanner(System.in);
    private int[][] votos;

    public Votos(String candi[][], int fila){
        System.out.println("1. Ingresar cantidad de votos");
        System.out.println("2. Mostrar resultados");
        System.out.println("3. Salir");
        int opc = sc.nextInt();
        sc.nextLine();
        if(opc == 1){
            System.out.println("Ingrese la cedula del candidato: ");
            String ced = sc.nextLine();
            for(int i = 0; i < fila; i++){
                if(candi[i][fila].equals(ced)){
                    System.out.println("Ingrese la cantidad de votos para el candidato "+candi[i][1]);
                    int numVoto = sc.nextInt();
                    votos[i][1] = numVoto;
                    
                    candi[i][6] = Integer.toString(numVoto);

                }
                
            }
    }
}
}



