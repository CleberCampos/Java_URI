import java.util.Scanner;

public class Exercicio4{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valorhora, qtdhoras, desconto, salario;
        
        // entrada (o valor recebido por hora)
        System.out.println("Digite o valor recebido por hora:");
        valorhora = teclado.nextFloat();

        // entrada (a quantidade de horas)
        System.out.println("Digite a quantidade de horas:");
        qtdhoras = teclado.nextFloat();

        // entrada (o desconto do INSS)
        System.out.println("Digite o desconto do INSS:");
        desconto = teclado.nextFloat();

        salario = valorhora * qtdhoras * (100 - desconto)/100;
  
        System.out.printf("O salario com desconto = %.2f\n", salario);

    }
}
