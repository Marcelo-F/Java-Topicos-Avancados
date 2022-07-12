package Aula01_Lambda_Expression;

interface Figura{
    void desenha();
}
public class Exemplo01 {
    public static void main(String[] args) {
     Figura f1 = new Figura() {
         @Override
         public void desenha() {
             System.out.println("Desenha figura 1");
         }
     };

        //Refatoração com lambda expressions, nesse caso não esta passando nenhum argumento, apenas realizando uma ação.
     Figura f2 = () -> System.out.print("Desenha figura 2");

     f1.desenha();
     f2.desenha();
    }
}
