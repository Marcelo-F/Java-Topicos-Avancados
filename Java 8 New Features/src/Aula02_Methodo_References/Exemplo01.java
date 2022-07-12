package Aula02_Methodo_References;

interface  Figura2D{
    void desenha(Double largura, Double altura);
}

class Retangulo {
    public  void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo de largura: "+ largura+" e altura: "+ altura);

    }
}
public class Exemplo01 {
    public static void main(String[] args) {
        //lambda expression
        Figura2D fig1 = (l,a) -> System.out.println("Desenha figura de largura: "+ l+" e altura: "+ a);
        fig1.desenha(8.0, 1.5);

        //Objeto particular/especifico
        Retangulo ret = new Retangulo();
        //Method reference
        Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(10.5,7.0);

    }
}
