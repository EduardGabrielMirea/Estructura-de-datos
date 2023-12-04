package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Altura {

    public static int numAlumnos(){

        //Almacena en numAlumnos la cantidad de alumnos que leamos por teclado.
        return Utilidades.leerEntero("Cuantos alumnos? ");
    }

    public static ArrayList<Double> leerAlturas(int numeroAlumnos){


        ArrayList<Double> Alturas = new ArrayList<>(numeroAlumnos);

        System.out.printf("Introduzca %d alturas: ", numeroAlumnos);
        for (int i = 1; i <= numeroAlumnos; i++) {
            Alturas.add(Utilidades.leerDoble(""));
        }
        return Alturas;
    }

    public static double calcularMedia(ArrayList<Double> Alturas){

        Double suma = (double)0;
        for (int i = 0; i < Alturas.size(); i++) {
            suma += Alturas.get(i);
        }
        return suma / Alturas.size();
    }

    public static double calcularAlumnosAlturaSuperior(){

    }

    public static void main(String[] args) {
    int numeroAlumnos = numAlumnos();
    ArrayList<Double> Alturas = leerAlturas(numeroAlumnos);


    }

}
