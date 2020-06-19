import java.util.Scanner;

public class Leituras{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        String nome;
        int valor;
        String txtValor;
        float valor2;

        System.out.println("Digite um valor numerico:");
        txtValor = teclado.nextLine(); // leio como string
        valor = Integer.parseInt(txtValor); //converto para inteiro
                // Float.parseFloat(txtValor) - valor numerico precisa digitar com ponto
                // Double.parseDouble(txtValor)
        valor2 = Float.parseFloat(teclado.nextLine().replace(",","."));

        System.out.println("Digite seu nome:");
        nome = teclado.nextLine();

        System.out.println("Voce digitou: " + valor + " - " + valor2 + " - " + nome);

    }
}