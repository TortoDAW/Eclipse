package Ejercicio5;
/*
Escribe un método que se llame pasarMayusculaSubCadena() que recibe un texto etiquetado y devuelve otra cadena en la que se han cambiado a mayúsculas todos los caracteres en el texto entre las etiquetas <mayus></mayus>
Las etiquetas no se pueden anidar y deben ser limpiadas del texto resultante.

Se recomienda utilizar expresiones regulares o IndexOf() para abrir y cerrar la etiqueta. Una vez calculado el índice de inicio y final del texto afectado por una etiqueta se extrae, se pasa a mayúscula se reemplaza toda la subcadena <mayus>texto</mayus>.
 */
public class Main {

    public static void main(String[] args) {

        String texto = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";

        String resultado = pasarMayusculaSubCadena(texto);
        System.out.print(resultado);

    }

    public static String pasarMayusculaSubCadena(String texto) {
        int posInicial;
        int posFinal;

        while ((posInicial = texto.indexOf("<mayus>")) != -1 && (posFinal = texto.indexOf("</mayus>")) != -1) {
        	
            String subcadenaOriginal = texto.substring(posInicial + "<mayus>".length(), posFinal);

            String subcadenaMayuscula = subcadenaOriginal.toUpperCase();

            texto = texto.substring(0, posInicial) + subcadenaMayuscula + texto.substring(posFinal + "</mayus>".length());
        }

        return texto;
    }
}

