public class libro {//implements Comparable<libro>
    //atributos
    int id;
    String nombre, autor;
    int cantidad;

    public libro(int id, String nombre, String autor, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    /*@Override
    public int compareTo(libro lb) {
    return String.valueOf(id).compareTo(String.valueOf(lb.id))*-1;

        /*if (id> lb.id){
            return 1;
        } else if (id< lb.id) {
            return -1;
        }else {
            return 0;
        }*/
    }

