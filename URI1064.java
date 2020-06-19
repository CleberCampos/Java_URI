import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        float valor = 0, soma = 0, media = 0;
        int quant = 0;

        for (int i = 1; i <= 6; i++){
            valor = teclado.nextFloat();
            if (valor >= 0){
                soma = soma + valor;
                quant++;
            }
        }
        media = soma / quant; 
        System.out.println(quant + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}