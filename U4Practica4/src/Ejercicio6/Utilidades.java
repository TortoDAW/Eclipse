package Ejercicio6;

public class Utilidades {

    public static String desencripta(String palabra) {

        char[] caracteres = palabra.toCharArray();
        char primera = caracteres[0];

        for (int i = 0; i < caracteres.length - 1; i++) {
            caracteres[i] = caracteres[i + 1];
        }

        caracteres[caracteres.length - 1] = primera;

        return new String(caracteres);
    }
}