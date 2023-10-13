import java.util.Scanner;

public class EliminarCandi {
    //Clase que elimina los candidatos de la matriz
    Scanner sc = new Scanner(System.in);
    String candi[][];
    int fila = 0;
    public EliminarCandi(String candidato[][], int fila){
        System.out.println("Eliminar candidato");

        System.out.println("Ingrese la cedula del candidato: ");
        int ced = sc.nextInt();
        //Condicional para verificar que la cedula si este entre los parametros
        if(ced>=1 && ced<=fila){
            for(int i = ced - 1; i<fila - 1; i++){
                for(int j =0; j<6; j++){
                    candidato[i][j] = candidato[i+1][j];
                }
            }
            fila--;
            System.out.println("Candidato eliminado");
        }else{
            System.out.println("Numero de cedula no encontrado");
        }
        this.candi = candidato;
        this.fila = fila;
    }
}
