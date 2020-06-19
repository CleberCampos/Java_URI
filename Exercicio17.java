import java.util.Scanner;

public class Exercicio17{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salario = teclado.nextFloat();
        float imposto;
       
        if (salario < 1000){
            imposto = 0;
        }
        else{
            if (salario < 2500){
                imposto = salario * 0.125f;
            }
            else{
                if (salario < 5000){
                    imposto = salario * 0.25f;
                }
                else{
                    imposto = 1300;
                }
            }
        }
        System.out.printf("Imposto = %.2f\n", imposto);
    }
}