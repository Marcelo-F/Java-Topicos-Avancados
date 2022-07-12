package Aula02_Methodo_References;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Produto{
    private String nome;
    private Double preco;


     Produto(String nome, Double preco) {
         this.nome = nome;
         this.preco = preco;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void imprime(){
        System.out.println("Aula01_Lambda_Expression.Produto "+ nome+" valor: "+ preco);

    }
}
class Impressora {
    public static void imprime(Produto p){
        System.out.println("Aula01_Lambda_Expression.Produto "+ p.getNome() +" valor: "+ p.getPreco());

    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<Produto>();
        lista.add(new Produto("Tv 42", 2000.00));
        lista.add(new Produto("Geladeira 470L", 3200.00));
        lista.add(new Produto("Fogão 4 bocas", 900.00));
        lista.add(new Produto("Videoogame", 1999.00));
        lista.add(new Produto("Microondas", 550.00));

        //lambda expression com argumento
        lista.forEach((p)-> System.out.println("Aula01_Lambda_Expression.Produto "+ p.getNome() +" valor: "+ p.getPreco()));
        // Method reference
        System.out.println(" - ---- - Mostrando resultado com o method reference");
        lista.forEach(Impressora::imprime);
        //Method reference objetct
        System.out.println(" - ---- - Mostrando resultado com o method reference de uma instancia do proprio objeto");
        lista.forEach(Produto::imprime);

    }
}
