import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);

        int valor = 0;
        int quantp = 0, quanti = 0, quantpos = 0, quantneg = 0;

        for (int i = 1; i <= 5; i++){

            valor = Integer.parseInt(teclado.nextLine().replace(".",","));
            
            if (valor % 2 == 0){
                quantp++;
                if (valor > 0){
                    quantpos++;
                }
                if (valor < 0){
                    quantneg++;
                }
            }
            else{
                quanti++;
                if (valor > 0){
                    quantpos++;
                }
                if (valor < 0){
                    quantneg++;
                }
            }
        }
        System.out.println(quantp + " valor(es) par(es)");
        System.out.println(quanti + " valor(es) impar(es)");
        System.out.println(quantpos + " valor(es) positivo(s)");
        System.out.println(quantneg + " valor(es) negativo(s)");
    }
}