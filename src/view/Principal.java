package view;
import controller.ThreadTriatlo;
public class Principal {
 
    public static void main(String[] args) {
       // Eu mando o atleta e o .start inicializa a thread
        for (int i = 1; i <= 25; i++) {
            Thread t = new ThreadTriatlo(i);
            t.start();
        }
    }
 
}