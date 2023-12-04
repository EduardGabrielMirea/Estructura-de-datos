package ArraysList;

import java.util.ArrayList;
import java.util.Collections;


public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();

        coches.add("Volvo");
        coches.add("Seat");
        coches.add("Fiat");


        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        Collections.sort(coches); //es lo mismo que Arrays.sort(), sirve para ordenar el arrayList.


        for (String coche : coches) {
            System.out.println(coche);
        } //Con un for mejorado no puedes ir a la inversa y tampoco puedes ir de 2 en  posiciones, solo de 1 en 1.




    }
}
