package Ejercicio2;

import java.util.Scanner;

/*
Escribe un método que se llame parentesisCorrectos() que recibe una cadenas de texto que contiene una expresión aritmética en la que hay que comprobar que los paréntesis están bien emparejados.
Devuelve verdadero o falso.

Ejemplo:
Expresión: ((a + b) / 5-d) Daría: true

Expresión: )(a + b)) Daría: false

Utiliza un contador para los paréntesis: Cuando se abre un paréntesis incrementa un contador, cuando se cierra se decrementa.
Al final el contador debe valer 0; en cualquier otro caso la expresión es incorrecta.
 */
public class Main {

	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String texto = patata.nextLine();
		
		boolean resultado = parentesisCorrectos(texto);
		if(resultado == true) {
			System.out.print("Parentesis puestos de forma correcta");
		}else {
			System.out.print("Parentesis puestos de forma incorrecta");
		}

	}
	public static boolean parentesisCorrectos(String texto) {
		int contador = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			
			if(caracter == '(') {
				contador++;
			}else if(caracter == ')') {
				contador--;
			}
		}
		
		if(contador != 0) {
			return false;
		}else {
			return true;
		}
	}
}
