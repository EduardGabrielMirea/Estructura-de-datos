package ArraysList.metodos;

import java.util.ArrayList;

public class addAll2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
        list1.add(12);
        list1.add(20);
        list1.add(45);

        ArrayList<Integer> list2 = new ArrayList<Integer>(5);
        list2.add(25);
        list2.add(30);
        list2.add(31);
        list2.add(35);

        //Sirve para añadir los elementos de la lista2 a la lista1 apartir de una posicion de la lista1 index:x.
        list1.addAll(2, list2);

        System.out.println("Imprimimos todos los elementos 1 vez y luego por seaprado: " +list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Number = " +list1.get(i));
        }
    }
}
