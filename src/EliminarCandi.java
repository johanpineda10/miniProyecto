import java.util.Scanner;

public class EliminarCandi {
    String cedula = "";
    String candidato[][];
    int fila;
    public EliminarCandi(String candidato[][], int fila){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cedula del candidato a eliminar: ");
        cedula = sc.nextLine();

        for(int i =0; i < fila; i++){
            if(candidato[i][0].equals(cedula)){
                candidato[i] = null;
                System.out.println("Candidato eliminado con exito");
            }else{
                System.out.println("Usuario no encontrado");
            }
        
        }
        this.candidato = candidato;

    }
}
