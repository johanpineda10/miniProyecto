import java.util.ArrayList;
import java.util.Scanner;

public class ListarNom {
    Scanner sc = new Scanner(System.in);

    public ListarNom(String candi[][], int fila, ArrayList<String> prome){
        System.out.println("Ingrese el nombre completo: ");
        String nombre = sc.nextLine();
        for(int i = 0;i<fila;i++){
            if(candi[i][1].equals(nombre)){
                System.out.println("----------------------------------------------");
                System.out.println("Cedula: "+candi[i][0]);
                System.out.println("Nombre: "+candi[i][1]);
                System.out.println("Ciudad: "+candi[i][2]);
                System.out.println("Partido politico: "+candi[i][3]);
                System.out.println("Ideologia (1. Izquierda  2.Derecha): "+candi[i][4]);
                for(String p: prome){
                    System.out.println("Propuestas: "+p);
                }
                System.out.println("----------------------------------------------");
            }else{
                System.out.println("Nombre no encontrado");
            }
        }
    }
}
