import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        float baseMenor, baseMaior, altura, area;

        // entrada (o valor da base menor do trapezio)
        System.out.println("Digite a base menor do trapezio:");
        baseMenor = teclado.nextFloat();

        // entrada (o valor da base maior do trapezio)
        System.out.println("Digite a base maior do trapezio:");
        baseMaior = teclado.nextFloat();

        // entrada (o valor da altura do trapezio)
        System.out.println("Digite a altura do trapezio:");
        altura = teclado.nextFloat();

        //processamento (calcular a area)
        area = ((baseMenor + baseMaior) * altura) / 2;

        // saida (exibir o valor da area)
        System.out.println("O valor da area = " + area);
    }
}
