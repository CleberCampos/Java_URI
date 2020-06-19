import java.util.Scanner;

public class URI1041{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float x = teclado.nextFloat();
        float y = teclado.nextFloat();
        
        if (x==0 && y==0){
            System.out.println("Origem");
        }
        if (x==0 && y!=0){
            System.out.println("Eixo Y");
        }
        if (x!=0 && y==0){
            System.out.println("Eixo X");
        }
        if (x>0 && y>0){
            System.out.println("Q1");
        }
        if (x<0 && y>0){
            System.out.println("Q2");
        }
        if (x<0 && y<0){
            System.out.println("Q3");
        }
        if (x>0 && y<0){
            System.out.println("Q4");
        }
   }
}