import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int N = teclado.nextInt();
        int l=0;

        while (N != 0){
            for (int i=1; i<4; i++){
                System.out.printf("%d ", i + l);
            }
            System.out.println("PUM");
            l = l + 4;
            N--;
        }
    }
}