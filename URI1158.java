import java.util.Scanner;

public class URI1158{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int N = teclado.nextInt();
        int soma = 0;
        
        while(N != 0){
            int x = teclado.nextInt();
            int y = teclado.nextInt();
            for (int i=x;i<(x+2*y);i++){
                if (i%2 == 1){
                    soma = soma + i;
                }
            }
            N--;
            System.out.println(soma);
            soma = 0;
        }    
    }
}