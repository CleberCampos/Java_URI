import java.util.Scanner;

public class URI1144{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int N = teclado.nextInt();
        int x = 1;

        while (x != N+1){
            System.out.printf("%d %d %d\n", x, x*x, x*x*x);
            System.out.printf("%d %d %d\n", x, (x*x) + 1, (x*x*x) + 1);
            x++;
        }
    }
}