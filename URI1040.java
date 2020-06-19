import java.util.Scanner;

public class URI1040{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float N1 = teclado.nextFloat();
        float N2 = teclado.nextFloat();
        float N3 = teclado.nextFloat();
        float N4 = teclado.nextFloat();

        float media = 0;

        media = (N1*2 + N2*3 + N3*4 + N4*1) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.00f){
            System.out.println("Aluno aprovado.");
        }
        else{
            if (media < 5.00f){
                System.out.println("Aluno reprovado.");
            }
            else{
                if (media >= 5.00f && media <= 6.90f){
                    System.out.println("Aluno em exame.");
                    float N5 = teclado.nextFloat();
                    System.out.printf("Nota do exame: %.1f\n", N5);
                    media = (media + N5) / 2.0f;
                    if (media >= 5.00f){
                        System.out.println("Aluno aprovado.");
                        System.out.printf("Media final: %.1f\n", media);
                    }
                    else{
                        System.out.println("Aluno reprovado.");
                        System.out.printf("Media final: %.1f", media);
                    }
                } 
            }
        }
    }
}