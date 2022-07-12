package Aula01_Lambda_Expression;

public class ExemploThread {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });

        /*Thread com lambda*/
        Thread t2 = new Thread(() -> System.out.println("Thread 2 em execução"));

        t1.start();
        t2.start();
    }
}
