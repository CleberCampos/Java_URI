import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, quantidade, kw, valor, valordesc;
        float desc = 0.9f;
        
        // entrada (o valor do salario minimo)
        System.out.println("Digite o valor do salario minimo:");
        salario = teclado.nextFloat();

        // entrada (a quantidade de kw)
        System.out.println("Digite a quantidade de kw:");
        quantidade = teclado.nextFloat();

        kw = (salario/7)/100;
        valor = kw * quantidade;
        valordesc = valor * desc;
  
        System.out.printf("O valor do kw = %5.2f\n", kw);
        System.out.printf("O valor a ser pago = %5.2f\n", valor);
        System.out.printf("O valor com desconto de 10%% = %.2f\n", valordesc);


    }
}
