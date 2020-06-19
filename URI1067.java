import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int valor = teclado.nextInt();

        for (int i = 1; i <= valor; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}