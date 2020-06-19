public class AppQueUsaTV{
    public static void main(String args[]){
        Televisao t;          // declaro a TV
        t = new Televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 5;
        t.volume = 10;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 9;
        x.volume = 5;

        t.power();
        x.power();

        t.avancarCanal();
        x.avancarCanal();

        t.retrocederCanal();
        x.retrocederCanal();

        t.aumentarVolume();
        x.aumentarVolume();

        t.diminuirVolume();
        x.diminuirVolume();

        t.mutarVolume();
        x.mutarVolume();
    }
}