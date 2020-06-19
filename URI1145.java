import java.util.Scanner;

public class URI1145{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        for (int i=1; i<=y; i++){
           if (i % x == 0){
            System.out.printf("%d\n", i);
           }
           else{
            System.out.printf("%d ", i);
           }
        }
    }
}