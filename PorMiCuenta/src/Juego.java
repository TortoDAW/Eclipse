import java.util.Scanner;
import java.lang.Math;

public class Juego {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);

		int aleatorio = (int)(Math.random()*100);
		
		int intento = 0;
		
		System.out.println("El numero aleatorio es "+ aleatorio);
		
		System.out.print("\n\nEl programa generara un numero aleatorio entre 1 y 100. Inserte un numero entre 1-100 para adivinar el numero aleatorio exacto:");
			intento = patata.nextInt();
			
		while(intento != aleatorio) {
			if(intento>aleatorio) {
				System.out.println("El numero aleatorio es menor al numero que has insertado.");
			}
			else {
				System.out.println("El numero aleatorio es mayor al numero que has insertado.");
			}
			System.out.print("Por favor, inserte otro numero: ");
				intento = patata.nextInt();
		}
		System.out.println("Lo has adivinado, el numero aleatorio era "+ aleatorio);

	}
}
