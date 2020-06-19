public class Refrigerante{
    private String nome;
    private double preco;
    private int qtdeEstoque;
    
    public Refrigerante(String nome, double preco, int qtdeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setQtdeEstoque(int qtdeEstoque){
        this.qtdeEstoque = qtdeEstoque;
    }
    public int getQtdeEstoque(){
        return this.qtdeEstoque;
    }

    public void tirarEstoque(){
        this.qtdeEstoque = this.qtdeEstoque - 1;
    }

    //public String imprimir(){
    //    return this.titulo+"/"+this.autor+"/"+this.anoPublicacao+"/"+this.categoria+"/"+this.estante+"/"+this.prateleira+"/"+this.emprestado;
    //}
}