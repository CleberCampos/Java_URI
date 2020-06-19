public class LivroTeste{
    public static void main(String args[]){
        Livro l1, l2, l3, l4, l5;

        l1 = new Livro("Livro1","Joao",1990,"Biografia",1,10,false);
        l2 = new Livro("Livro2","Maria",1995,"Aventura",2,20,false);
        l3 = new Livro("Livro3","Cleber",2000,"Terror",3,30,false);
        l4 = new Livro("Livro4","Ana",2005,"Romance",4,40,false);
        l5 = new Livro("Livro5","Fabio",2010,"Comédia",5,50,false);

        System.out.println(l1.imprimir());
        System.out.println(l2.imprimir());
        System.out.println(l3.imprimir());
        System.out.println(l4.imprimir());
        System.out.println(l5.imprimir());

        l1.solicitar();
        l2.solicitar();
        l3.solicitar();

        if (l1.consultar()){
            System.out.println("Livro emprestado!");
        }
        else{
            System.out.println("Livro disponível!");
        }
        
        if (l5.consultar()){
            System.out.println("Livro emprestado!");
        }
        else{
            System.out.println("Livro disponível!");
        }

        l3.devolver();

        System.out.println(l1.imprimir());
        System.out.println(l2.imprimir());
        System.out.println(l3.imprimir());
        System.out.println(l4.imprimir());
        System.out.println(l5.imprimir());

    }
}