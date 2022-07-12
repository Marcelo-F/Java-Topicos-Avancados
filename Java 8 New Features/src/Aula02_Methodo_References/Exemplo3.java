package Aula02_Methodo_References;
@FunctionalInterface
interface  Figura2DB{
    Retangulo2 desenha(Double largura, Double altura);
}

class Retangulo2 {
    public  Retangulo2(Double largura, Double altura){
        System.out.println("Desenha retângulo de largura: "+ largura+" e altura: "+ altura);

    }
}
public class Exemplo3 {
    public static void main(String[] args) {
     Figura2DB fig1 = Retangulo2::new;
     fig1.desenha(10.0,2.5);

    }
}
