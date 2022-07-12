package Aula01_Lambda_Expression;

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
        System.out.println("----- Ordenando lista e realizando comparações de preço ----");
        lista.sort(Comparator.comparing(Produto::getPreco));
        System.out.println("----- Mostrando a lista ordenada ----");
        lista.forEach((p)-> System.out.println("Aula01_Lambda_Expression.Produto "+ p.getNome() +" valor: "+ p.getPreco()));
    }
}
