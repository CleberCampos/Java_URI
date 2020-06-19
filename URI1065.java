import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int valor = 0;
        int quant = 0;

        for (int i = 0; i < 5; i++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                quant++;
            }
        }
        System.out.println(quant + " valores pares");
    }
}