import java.util.Scanner;

public class URI1051{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valor = teclado.nextFloat();
        float imposto;
       
        if (valor <= 2000){
            System.out.println("Isento");
        }
        else{
            if (valor <= 3000){
                imposto = (valor - 2000) * 0.08f;
            }
            else{
                if (valor <= 4500){
                    imposto = (valor - 3000) * 0.18f + (1000 * 0.08f);
                }
                else{
                    imposto = (valor - 4500) * 0.28f + (1500 * 0.18f) + (1000 * 0.08f);
                }
            }
        System.out.printf("R$ %.2f\n", imposto);
        }
    }
}