// novo tipo de dado
public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }

    void avancarCanal(){
        if (ligada == true){
            if (canal == 99){
                System.out.println("Canal indisponivel!");
            }
            else{
                canal++;
                System.out.println("A TV "+marca+" esta no canal "+canal);
            }
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }

    void retrocederCanal(){
        if (ligada == true){
            if (canal == 1){
                System.out.println("Canal indisponivel!");
            }
            else{
                canal--;
                System.out.println("A TV "+marca+" esta no canal "+canal);
            }
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void aumentarVolume(){
        if (ligada == true){
            if (volume == 10){
                System.out.println("Volume maximo atingido!");
            }
            else{
                volume++;
                System.out.println("A TV "+marca+" esta no volume "+volume);
            }
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void diminuirVolume(){
        if (ligada == true){
            if (volume == 0){
                System.out.println("A TV esta no mudo!");
            }
            else{
                volume--;
                System.out.println("A TV "+marca+" esta no volume "+volume);
            }
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void mutarVolume(){
        if (ligada == true){
            volume = 0;
                System.out.println("A TV "+marca+" esta no mudo!");
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
}