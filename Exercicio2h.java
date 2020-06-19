import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float diametro, raio, altura, volume;
        float pi = 3.14f;

        // entrada (o valor do diametro do cilindro)
        System.out.println("Digite o diametro do cilindro:");
        diametro = teclado.nextFloat();

        // entrada (o valor do diametro do cilindro)
        System.out.println("Digite a altura do cilindro:");
        altura = teclado.nextFloat();

        raio = diametro/2;

        //processamento (calcular a area)
        volume = pi * raio * raio * altura;
        
        // saida (exibir o valor da area)
        //System.out.println("O valor do volume = " + volume);

        //exemplo uso de mascara
        System.out.printf("O valor do volume = %5.2f\n", volume);


    }
}
