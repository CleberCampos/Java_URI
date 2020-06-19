import java.util.Scanner;

public class URI1154{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int idade = 0, cont = 0;
        float media = 0;
        
        do{
            media = media + idade;
            cont++;
            idade = teclado.nextInt();             
        }while(idade>=0);

        media = media / (cont - 1);
        System.out.printf("%.2f\n", media);
    }
}