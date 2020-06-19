import java.util.Scanner;

public class URI1134{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int a=0, g=0, d=0, valor=0;

        do{
            valor = teclado.nextInt();

            if (valor==1){
                a++; 
            }
            else if (valor==2){
                g++; 
            }
            else if (valor==3){
                d++; 
            }
        }while (valor != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
    }
}