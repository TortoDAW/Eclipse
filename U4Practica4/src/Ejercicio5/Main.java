package Ejercicio5;

// Prueba del codigo

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Inserta una palabra: ");
        String palabra = patata.nextLine().trim();

        System.out.print("Encriptacion: " + Utilidades.encripta(palabra));

    }
}

