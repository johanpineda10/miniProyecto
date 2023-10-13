import java.util.ArrayList;
import java.util.Scanner;

public class ListarNom {
    Scanner sc = new Scanner(System.in);
    //Clase que lista solo un candidato por el numero de cedula
    public ListarNom(String candi[][], int fila, ArrayList<String> prome){
        System.out.println("Ingrese el nombre completo: ");
        String nombre = sc.nextLine();
        //for verifica todos los candidatos y encuentra la igualdad con el ingresado por el usuario
        for(int i = 0;i<fila;i++){
            if(candi[i][1].equals(nombre)){
                System.out.println("----------------------------------------------");
                System.out.println("Cedula: "+candi[i][0]);
                System.out.println("Nombre: "+candi[i][1]);
                System.out.println("Ciudad: "+candi[i][2]);
                System.out.println("Partido politico: "+candi[i][3]);
                System.out.println("Ideologia (1. Izquierda  2.Derecha): "+candi[i][4]);
                //Me encuentro a veces errores con las propuestas y me salen todas las propuestas de todos los candidatos
                System.out.println("Propuestas: "+candi[i][5]);
                
                System.out.println("----------------------------------------------");
            }else{
                System.out.println("Nombre no encontrado");
            }
        }
    }
}
