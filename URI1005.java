import java.util.Scanner;

public class URI1005{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A, B, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        MEDIA = (A * 0.35 + B * 0.75) * 10/11;
        
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}