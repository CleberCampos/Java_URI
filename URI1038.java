import java.util.Scanner;

public class URI1038{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        int Y = teclado.nextInt();

             
        if (X == 1){
            System.out.printf("Total: R$ %.2f\n", 4.00f*Y);
        }
        else{
            if (X == 2){
                System.out.printf("Total: R$ %.2f\n", 4.50f*Y);
            }
            else{
                if (X == 3){
                    System.out.printf("Total: R$ %.2f\n", 5.00f*Y);
                }
                else{
                    if (X == 4){
                        System.out.printf("Total: R$ %.2f\n", 2.00f*Y);
                    }
                    else{
                        if (X == 5){    
                            System.out.printf("Total: R$ %.2f\n", 1.50f*Y);
                        }
                    }
                }
            }
        }
    }
}