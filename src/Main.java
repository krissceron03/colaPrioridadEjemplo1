import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<libro> libroColaP=new PriorityQueue<>();
        libro l1 = new libro(001, "La Cenicienta", "Pepito Sanchez", 456);
        libro l2 = new libro(234, "La Sierenita", "Alejandro Luna", 100);
        libro l3 = new libro(641, "La Bella Durmiente", "José Pérez", 123);
        libro l4 = new libro(421, "La Bella y la Bestia", "Ana López", 284);
        //añadir libros a la cola
        libroColaP.add(l1);
        libroColaP.add(l2);
        libroColaP.add(l3);
        libroColaP.add(l4);

        for (libro l:libroColaP) {
            System.out.println(l.id);
        }
        libroColaP.remove();
        System.out.println();
        for (libro l:libroColaP) {
            System.out.println(l.id);
        }
    }

}