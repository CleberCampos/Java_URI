import java.util.Scanner;

public class URI1020{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idadeDias = teclado.nextInt();
        int anos, meses, dias, resto;

        anos = idadeDias / 365;
        
        resto = idadeDias % 365;

        meses = resto / 30;

        dias = resto % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}