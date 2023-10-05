import java.util.Scanner;

public class Votos {
    Scanner sc = new Scanner(System.in);
    private int[][] votos;

    public Votos(){
        System.out.println("1. Ingresar cantidad de votos");
        System.out.println("2. Mostrar resultados");
        System.out.println("3. Salir");
        int opc = sc.nextInt();
        sc.nextLine();
        if(opc == 1){
            System.out.println("Ingrese la cedula del candidato: ");
            int ced = sc.nextInt();
            if(ced >= 1 && ced <= votos.length){
                
        }
    }
}
}



