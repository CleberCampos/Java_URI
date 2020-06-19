import java.util.Scanner;

public class URI1006{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float A, B, C, MEDIA;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}