import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float base, altura, area;

        // entrada (o valor da base do retangulo)
        System.out.println("Digite a base do retangulo:");
        base = teclado.nextFloat();

        // entrada (o valor da altura do retangulo)
        System.out.println("Digite a altura do retangulo:");
        altura = teclado.nextFloat();

        //processamento (calcular a area)
        area = base * altura;

        // saida (exibir o valor da area)
        System.out.println("O valor da area = " + area);
    }
}