package ArraysList;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AñadirCoches {

    public static void main(String[] args) {

        ArrayList<String> coches = new ArrayList<>();

        String marcas;
      do {
          marcas = Utilidades.leerCadena("Introduzca marcas de coche");

          if (!marcas.isEmpty()) {
              coches.add(marcas);
          }

      }while (!marcas.isEmpty());

      System.out.println(coches);

      Collections.sort(coches);
      for (int i = 0; i < coches.size(); i++) {
          System.out.println(coches.get(i));
      }

    }
}
