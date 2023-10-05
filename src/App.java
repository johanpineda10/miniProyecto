import java.util.Scanner;

public class App {

    Scanner sc = new Scanner(System.in);
    public App(){

        String cand[][] = new String[10][10];
        int fila = 0;
        int opc=0;

        do{
            System.out.println("1. Adicionar Candidato");
            System.out.println("2. Modificar candidato");
            System.out.println("3. Eliminar candidato");
            System.out.println("4. Listar candidatos");

            System.out.print("Ingrese la opcion: ");
            opc=sc.nextInt();
            switch(opc){
                case 1: Adicionar adi = new Adicionar(cand, fila);
                        cand = adi.candidato;
                        fila++;
                    break;
                case 2: ModificarCandi mod = new ModificarCandi(cand, fila);
                        cand = mod.candidato;
                    break;
                case 3: EliminarCandi eli = new EliminarCandi(cand, fila);
                        cand = eli.candi;
                        fila--;
                    break;
                case 4: new ListarCandi(cand, fila);
                    break;
            }
        }while(opc != 0);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
