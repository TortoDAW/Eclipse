//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.


import java.util.Scanner;
public class VocalNoVocal {
	public static void main(String[] args) {
	Scanner patata = new Scanner(System.in);
		
	String letra;
	
		do {
			{
			System.out.print("Inserte una letra: ");
			letra = patata.next();
			}
				
			if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
				System.out.println("Letra VOCAL");
			}else {
				System.out.println("Letra NO VOCAL");
			}
		}while(!letra.equals(" "));
	}
}
