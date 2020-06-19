import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        float diagonal1, diagonal2, area;

        // entrada (o valor da diagonal1 do losango)
        System.out.println("Digite a diagonal1 do losango:");
        diagonal1 = teclado.nextFloat();

        // entrada (o valor da diagonal2 do losango)
        System.out.println("Digite a diagonal2 do losango:");
        diagonal2 = teclado.nextFloat();

        //processamento (calcular a area)
        area = diagonal1 * diagonal2;

        // saida (exibir o valor da area)
        System.out.println("O valor da area = " + area);
    }
}
