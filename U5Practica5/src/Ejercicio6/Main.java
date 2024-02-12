package Ejercicio6;

import java.util.Scanner;

/*
Escribe un método que se llame padRight() que recibe una cadena de caracteres, un carácter y un número. Devuelve una cadena formateada con el texto recibido completado por la derecha con el carácter proporcionado hasta la longitud indicada con el número.
Se recomienda utilizar StringBuilder.
 */

public class Main {

	public static Scanner patata = new Scanner(System.in);
	
    public static void main(String[] args) {

    	System.out.print("Introduce una palabra: ");
    	String texto = patata.nextLine().trim();
    	
    	int num = pedirInt("Introduce un entero: ");
    	
        String resultado = padRight(texto, '*', num);
        System.out.println(resultado);
    }

    public static String padRight(String texto, char caracter, int longitudDeseada) {
        if (texto.length() >= longitudDeseada) {
            return texto;
        }
        
        int caracteresAgregar = longitudDeseada - texto.length();

        StringBuilder resultado = new StringBuilder(texto);

        for (int i = 0; i < caracteresAgregar; i++) {
            resultado.append(caracter);
        }

        return resultado.toString();
    }
    public static int pedirInt(String enunciado) {
    	boolean check = false;
    	int num = 0;
    	
    	do {
    		System.out.print(enunciado);
	    	try {
	            num = Integer.parseInt(patata.nextLine().trim());
	            check = true;
	        } catch (NumberFormatException e) {
	            System.out.println("Error: numero no valido. ");
	        }
    	}while(!check);
    	return num;
    	
    }
}

