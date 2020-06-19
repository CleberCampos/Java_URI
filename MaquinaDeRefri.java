public class MaquinaDeRefri{
    private double credito;
    private Refrigerante lista[];
    
    public MaquinaDeRefri(){
        this.credito = 0.0;
        lista = new Refrigerante[4];
        lista[0] = new Refrigerante("Coca-Cola", 2.50, 5);
        lista[1] = new Refrigerante("Fanta", 2.00, 5);
        lista[2] = new Refrigerante("Sprite", 2.00, 5);
        lista[3] = new Refrigerante("Pepsi", 1.80, 5);
    }

    public void adicionarCredito(double valor){
        this.credito += valor;
    }

    public double pegarTroco(){
        double troco = this.credito;
        this.credito = 0.0;
        return troco;
    }

    

}