package Ejercicio5;

/*
Define un método estático llamado encripta() que reciba un texto como argumento y lo encripte utilizando el algoritmo de Cesar y lo devuelva transformado.
Deben seguirse los principios y estilo del código limpio.
 */

public class Utilidades {

    public static String encripta(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            System.out.println("La palabra no puede ser nula o vacía.");
        }

        char[] caracteres = palabra.toCharArray();
        char ultima = caracteres[caracteres.length - 1];

        for (int i = caracteres.length - 1; i > 0; i--) {
            caracteres[i] = caracteres[i - 1];
        }

        caracteres[0] = ultima;

        return new String(caracteres);
    }
}

