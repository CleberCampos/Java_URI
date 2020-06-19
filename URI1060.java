import java.util.Scanner;

public class URI1060{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        float valor = 0;
        int quant = 0;

        for (int i = 1; i <= 6; i++){
            valor = teclado.nextFloat();
            if (valor >= 0){
                quant++;
            }
        }
        System.out.println(quant + " valores positivos");
    }
}