import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        float base, altura, area;

        // entrada (o valor da base do triangulo)
        System.out.println("Digite a base do triangulo:");
        base = teclado.nextFloat();

        // entrada (o valor da altura do triangulo)
        System.out.println("Digite a altura do triangulo:");
        altura = teclado.nextFloat();

        //processamento (calcular a area)
        area = (base * altura)/2;

        // saida (exibir o valor da area)
        System.out.println("O valor da area = " + area);
    }
}
