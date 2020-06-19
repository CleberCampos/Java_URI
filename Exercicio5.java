import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float tempo, velocidade, litros, distancia;
        
        // entrada (o valor do tempo gato da viagem)
        System.out.println("Digite o valor do tempo gato da viagem:");
        tempo = teclado.nextFloat();

        // entrada (a velocidade media)
        System.out.println("Digite a velocidade media:");
        velocidade = teclado.nextFloat();

        distancia = tempo * velocidade;
        litros = distancia / 12;
  
        //System.out.printf("A quantidade de litros = %.3f\n", litros);

    System.out.printf("Voce percorreu %.3f km, a uma velocidade de %.3f km/h e" +
                      "consumiu %.3f litros!\n", distancia, velocidade, litros);
    
    }
}
