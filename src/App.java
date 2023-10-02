import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1. adicionar Candidato");
            System.out.println("2. Modificar candidato");
            System.out.println("3. Eliminar candidato");
            System.out.println("4. Listar candidatos");

            System.out.print("Ingrese la opcion: ");
            opc=sc.nextInt();
            switch(opc){
                case 1: new Adicionar();
                break;
            }
        }while(opc != 0);
    }
}
