//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
//El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.

import java.util.Scanner;
public class MayorMenorIgual {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);

		System.out.print("Introduce la cantidad de numeros que quieres poner:");
		int cantidad = patata.nextInt();
		
		int mayor = 0;
		int menor = 0;
		int igual = 0;
		int numero = 0;
		
		do {
			if(cantidad <= 0) {
				System.out.print("Introduce un numero entero positivo: ");
					cantidad = patata.nextInt();
			}
		}while(cantidad <= 0);
		
		while(cantidad > 0) {
			for(int i = 1; i <=cantidad; i++) {
				System.out.print("Introduce el "+i+"º numero: ");
				numero = patata.nextInt();
				
				if(numero > 0) {
					mayor++;
				}
				else if(numero < 0) {
					menor++;
				}
				else {
					igual++;
				}
			}
			break;
		}
		System.out.println(igual +" numeros iguales que 0");
		System.out.println(mayor +" numeros mayores que 0");
		System.out.println(menor +" numeros menores que 0");
	}
}
