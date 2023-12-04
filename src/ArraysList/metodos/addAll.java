package ArraysList.metodos;

import java.util.ArrayList;

public class addAll {

    public static void main(String[] args) {

        //Creamos y añadimos elementos a la primera lista.
        ArrayList<Integer> lista1 = new ArrayList<Integer>(5);

        lista1.add(12);
        lista1.add(20);
        lista1.add(45);

        //Creamos y añadimos elementos a la segunda lista.
        ArrayList<Integer> lista2 = new ArrayList<Integer>(5);

        lista2.add(25);
        lista2.add(30);
        lista2.add(31);
        lista2.add(35);

        //Vamos a insertar los elementos de la lista2, al final de la lista1.
        lista1.addAll(lista2);

        System.out.println("Imprimimos todos los elementos 1 vez y luego por seaprado: " +lista1);
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("Total = " + lista1.get(i));
        }

    }
}
