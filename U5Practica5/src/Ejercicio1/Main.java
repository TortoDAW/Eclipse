package Ejercicio1;

import java.util.Scanner;

/*
Escribe un método que se llame invertirTexto() que recibe una cadena de caracteres cualquiera y la devuelve invertida.
Por ejemplo:
"Introducción" -> "nóiccudortnI"
Se recomienda utilizar internamente un StringBuilder y un bucle do-while
 */
public class Main {

	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String texto = patata.nextLine().trim();
		
		String resultado = invertirTexto(texto);
		System.out.print("Palabra invertida: " + resultado);
		

	}
	public static String invertirTexto(String texto) {
		StringBuilder invertir = new StringBuilder();
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			invertir.append(texto.charAt(i));
		}
		
		return invertir.toString();
	}
}
