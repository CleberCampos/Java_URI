import java.util.Scanner;

public class URI1073{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int N = teclado.nextInt();
        int num = 0;
        
        for (int i = 1; i <= N; i++){
            if (i % 2 == 0){
                num = (int)Math.pow(i,2);
                System.out.println(i + "^2 = " + num);
            }
        }
    }
}