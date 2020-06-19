import java.util.Scanner;

public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        float lado, volume;

        // entrada (o valor do lado do cubo)
        System.out.println("Digite o lado do cubo:");
        lado = teclado.nextFloat();

        //processamento (calcular a area)
        volume = lado * lado * lado;
        
        // saida (exibir o valor da area)
        System.out.println("O valor do volume1 = " + volume);

    }
}
