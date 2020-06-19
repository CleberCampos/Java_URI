import java.util.Scanner;

public class URI1059{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int quant = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}