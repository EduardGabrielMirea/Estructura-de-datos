package ArraysList.metodos;

import java.util.ArrayList;

public class add1 {

    public static void main(String[] args) {

        //Creamos una arrayList vacia, con una capacidad inicial.
        ArrayList<Integer> lista = new ArrayList<Integer>(5);


        //Este método se utiliza para insertar un elemento específico en un índice de posición específico en una lista.

        //Usamos add() para añadir elementos a la lista.
        lista.add(15);
        lista.add(20);
        lista.add(25);

        //Imprimimos todos los elementos que hay en la lista.
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numeros = " + lista);
        }

        System.out.println(" ");

        //Imprimimos cada vez solo 1 posicion de la lista, es decir solo 1 elemento.
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Solo 1 numero de la lista = " + lista.get(i));
        }
    }
}
