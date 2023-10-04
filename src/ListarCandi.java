public class ListarCandi {
    public ListarCandi(String candi[][], int fila){
        System.out.println(fila);
        if(fila>0){    
            for(int i = 0; i<fila;i++){
            
                System.out.println("----------------------------------------------");
                System.out.println("Cedula: "+candi[i][0]);
                System.out.println("Nombre: "+candi[i][1]);
                System.out.println("Ciudad: "+candi[i][2]);
                System.out.println("Partido politico: "+candi[i][3]);
                System.out.println("Ideologia (1. Izquierda  2.Derecha): "+candi[i][4]);
                System.out.println("Propuestas: "+candi[i][5]);
                System.out.println("-----------------------------------------------");
            }
        }else{
            System.out.println("Lista vacia");
        }
        
    }
}
