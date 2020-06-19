import java.util.Scanner;

public class URI1074{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int N = Integer.parseInt(teclado.nextLine().replace(".",","));
        int valor = 0;
        
        for (int i = 1; i <= N; i++){

            valor = Integer.parseInt(teclado.nextLine().replace(".",","));
             
            if (valor % 2 == 0){
                if (valor > 0){
                    System.out.println("EVEN POSITIVE");
                }
                else if (valor < 0){
                    System.out.println("EVEN NEGATIVE");
                }
                else{
                    System.out.println("NULL");
                }
            }
            else{
                if (valor > 0){
                    System.out.println("ODD POSITIVE");
                }
                else if (valor < 0){
                    System.out.println("ODD NEGATIVE");
                }
                else{
                    System.out.println("NULL");
                }
            }
        }
    }
}