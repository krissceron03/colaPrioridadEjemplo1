import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<libro> libroColaP=new PriorityQueue<>((a,b)-> String.valueOf(a.id).compareTo(String.valueOf(b.id)));
        Queue<libro> libroPorAutor=new PriorityQueue<>((a,b) -> a.autor.compareTo(b.autor)*-1);
        libro l1 = new libro(500, "La Cenicienta", "Pepito Sanchez", 456);
        libro l2 = new libro(234, "La Sierenita", "Alejandro Luna", 100);
        libro l3 = new libro(641, "La Bella Durmiente", "José Pérez", 123);
        libro l4 = new libro(421, "La Bella y la Bestia", "Ana López", 284);
        //añadir libros a la cola
        libroColaP.add(l1);
        libroColaP.add(l2);
        libroColaP.add(l3);
        libroColaP.add(l4);
        System.out.println("--------------- COLA ORIGINAL --------------");
        for (libro l:libroColaP) {
            System.out.println(l.id);
        }
        libroColaP.remove();
        System.out.println("--------------- COLA CON REMOVE 1 --------------");
        for (libro l:libroColaP) {
            System.out.println(l.id);
        }
        libroPorAutor.addAll(libroColaP);
        System.out.println("--------------- COLA ORIGINAL PRIORIDAD AUTOR --------------");
        for (libro l:libroPorAutor) {
            System.out.println(l.autor);
        }
        libroPorAutor.remove();
        System.out.println("--------------- COLA CON REMOVE 1 --------------");
        for (libro l:libroPorAutor) {
            System.out.println(l.autor);
        }
    }

}