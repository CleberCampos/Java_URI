import java.util.Scanner;

public class URI1002{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A, R, n = 3.14159;

        R = teclado.nextDouble();

        A = n * (R * R);
        
        System.out.printf("A=%.4f\n",A);
    }
}