import java.util.Scanner;

public class URI1072{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int N = teclado.nextInt();
        int X = 0, in = 0, out = 0;

        for (int i = 1; i <= N; i++){
            X = teclado.nextInt();
            if (X >= 10 && X <= 20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}