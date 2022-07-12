package Aula8_Reflexao_Metodos_Parametros;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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

public class Exemplo01 {
    public static void main(String[] args) {
        Produto p = new Produto("Geladeira", 300.00);

        Class cl = p.getClass();

        Method[] methods = cl.getDeclaredMethods();

        for (Method m: methods){
            System.out.println(m.getName());

            Parameter[] parameter =m.getParameters();

            for (Parameter pr:parameter){
                System.out.println(pr);
            }
        }

    }
}
