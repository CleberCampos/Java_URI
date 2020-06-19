import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);


        float altura, largura, profundidade, volume;

        // entrada (o valor da altura do paralelepipedo)
        System.out.println("Digite a altura do paralelepipedo:");
        altura = teclado.nextFloat();

        // entrada (o valor da largura do paralelepipedo)
        System.out.println("Digite a largura do paralelepipedo:");
        largura = teclado.nextFloat();

        // entrada (o valor da profundidade do paralelepipedo)
        System.out.println("Digite a profundidade do paralelepipedo:");
        profundidade = teclado.nextFloat();

        //processamento (calcular a area)
        volume = altura * largura * profundidade;

        // saida (exibir o valor da area)
        System.out.println("O valor do volume = " + volume);
    }
}
