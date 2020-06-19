import java.util.Scanner;

public class Exercicio20{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char sexo = teclado.nextLine().charAt(0);
        String s = "";
        float altura = teclado.nextFloat();
        float peso = 0;
        
        if (sexo == 'H' || sexo == 'h'){
            peso = 72.7f * altura - 58;
            System.out.println("Masculino - peso ideal: " + peso + "kg!");
        }
        else{
            peso = 62.1f * altura - 44.7f;
            System.out.println("Feminino - peso ideal: " + peso + "kg!");
        }
        
        System.exit(0);
    }
}