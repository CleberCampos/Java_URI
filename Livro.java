public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String categoria;
    private int estante;
    private int prateleira;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, String categoria, int estante, int prateleira, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.estante = estante;
        this.prateleira = prateleira;
        this.emprestado = emprestado; 
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public void setEstante(int estante){
        this.estante = estante;
    }
    public int getEstante(){
        return this.estante;
    }

    public void setPrateleira(int prateleira){
        this.prateleira = prateleira;
    }
    public int getPrateleira(){
        return this.prateleira;
    }

    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public boolean getEsprestado(){
        return this.emprestado;
    }

    public void solicitar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    public boolean consultar(){
        return this.emprestado;
    }

    public String imprimir(){
        return this.titulo+"/"+this.autor+"/"+this.anoPublicacao+"/"+this.categoria+"/"+this.estante+"/"+this.prateleira+"/"+this.emprestado;
    }
}