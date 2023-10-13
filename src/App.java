import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner sc = new Scanner(System.in);
    public App(){
//Creacion de la matriz de los candidatos para enviar la informacion a las demas clases

        String cand[][] = new String[20][7];
        int fila = 0;
        int opc=0;
        //Creacion de la lista de arreglos para almacenar promesas de candidatos
        ArrayList<String> prome = new ArrayList<>();
        //Creacion del menu con las diferentes opciones
        do{
            System.out.println("1. Adicionar Candidato");
            System.out.println("2. Modificar candidato");
            System.out.println("3. Eliminar candidato");
            System.out.println("4. Listar candidato por nombre");
            System.out.println("5. Listar todos los candidatos");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opcion: ");
            opc=sc.nextInt();
            //Creacion del switch para ingresar a la clase que elija el usuario
            switch(opc){
                case 1: Adicionar adi = new Adicionar(cand, fila, prome);
                        cand = adi.candidato;
                        prome = adi.promesa;
                        fila++;
                        
                        System.out.println("Esta es la fila: "+fila);
                    break;
                case 2: ModificarCandi mod = new ModificarCandi(cand, fila, prome);
                        cand = mod.candidato;
                        prome = mod.promesa;
                        for(String p : prome){
                            System.out.println(p);
                        }
                    break;
                case 3: EliminarCandi eli = new EliminarCandi(cand, fila);
                        cand = eli.candi;
                        fila--;
                    break;
                case 4: new ListarNom(cand, fila, prome);
                    break;
                case 5: new ListarCandi(cand, fila);
                    break;
                case 0: Votos v = new Votos(cand, fila);
                        cand = v.candi; 
                    break;
            }
        }while(opc != 0);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
