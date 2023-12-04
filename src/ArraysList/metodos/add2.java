package ArraysList.metodos;

import java.util.ArrayList;

public class add2 {
    public static void main(String[] args) {

        //Creamos una ArrayList vacia con una capacidad de 5.
        ArrayList<Integer> lista = new ArrayList<Integer>(5);

        //Añadimos al ArrayList elementos.
        lista.add(10);
        lista.add(22);
        lista.add(30);
        lista.add(40);


        //Este método  " se usa para agregar un elemento específico al final de una lista.
        //Añadimos el elemento 35 en la posicion 4.
        lista.add(3, 35); // 0=10 ; 1=22 ; 2=30 ; 3=35 ; 4=40


        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numero = " + lista.get(i));
        }
    }
}
